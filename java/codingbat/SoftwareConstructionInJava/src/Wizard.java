import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Represents a wizard in a popular series of books.
public class Wizard {
    private final String name;
    private final Set<Wizard> friends;
    // Rep invariant:
    //   name, friends != null
    //   friend links are bidirectional: for all f in friends, f.friends contains this
    // Thread safety argument:
    //   TODO
    
    private void checkRep() {
        assert name != null;
        assert friends != null;
        assert bidirectionalFriendships();
    }
    
    private boolean bidirectionalFriendships() {
        for (Wizard p : friends) {
            assert p.isFriendsWith(this);
        }
        return true;
    }
    
    public Wizard(String name) {
        this.name = name;
        this.friends = new HashSet<Wizard>();
        checkRep();
    }
    
    public boolean isFriendsWith(Wizard that) {
        return this.friends.contains(that);
    }
    
    public void friend(Wizard that) {
        if (this.friends.add(that)) {
            that.friend(this);
        }
        checkRep();
    }
    
    public void defriend(Wizard that) {
        if (this.friends.remove(that)) {
            that.defriend(this);
        }
        checkRep();
    }
    
    public String toString() {
        return name;
    }

    static {
        // require assertions to be turned on
        try {
            assert false;
            throw new RuntimeException("turn on assertions for this exercise");
        } 
        catch (AssertionError e) {            
        }
    }
    
    public static void main(String[] args) {
        final Wizard harry =      new Wizard("Harry Potter");
        final Wizard hermione =   new Wizard("Hermione Granger");
        final Wizard ron =        new Wizard("Ron Weasley");
        final Wizard dumbledore = new Wizard("Albus Dumbledore");
        final Wizard snape =      new Wizard("Severus Snape");

        // books 1..4
        harry.friend(hermione);
        harry.friend(ron);
        harry.friend(dumbledore);
        snape.friend(dumbledore);
        
        // now suppose a couple of children you know are reading book 5 over and over
        final int numChildren = 2;
        final int numReadings = 100;

        List<Thread> children = new ArrayList<Thread>();
        for (int i = 0; i < numChildren; ++i) {
            final int numChild = i;
            Thread child = new Thread(new Runnable() {
                public void run() {
                    Thread.yield();
                    for (int j = 0; j < numReadings; ++j) {
                        System.err.println("child # " + numChild + " reading for the " + j + "th time");
                        
                        // this is basically the plot of book 5.
                        harry.friend(snape);
                        snape.defriend(harry);
                    }
                    System.err.println("child #" + numChild + " is done reading");
                }
            });
            child.start();
            children.add(child);
        }
        
        waitForAll(children);
        System.err.println("all children are done reading");
    }

    /* wait for all threads in set to complete. */
    private static void waitForAll(final Collection<Thread> threads) {
        for (Thread thread : threads) {
            try {
                thread.join();
            }
            catch (InterruptedException e) {
                throw new AssertionError("don't interrupt my testing");
            }
        }                
    }
    
}