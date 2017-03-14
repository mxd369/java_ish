import java.util.ArrayList;
import java.util.List;

public class BadGrep {
    
    private static int numMatches = 0;
    
    public static void main(String[] args) throws InterruptedException {
        
        // substring to search for
        String substring = "do";
        
        // build a list of lines to search
        List<String> lines = new ArrayList<String>();
        for (int ii = 0; ii < 1_000; ++ii) {
            lines.add("don't do this");
            lines.add("not threadsafe");
        }
        
        // list for accumulating matching lines
        List<String> matches = new ArrayList<>();
        
        Thread[] consumers = new Thread[20]; // use multiple consumers
        
        for (int ii = 0; ii < consumers.length; ii++) { // create Consumers
            consumers[ii] = new Thread(new Consumer(lines, substring, matches));
        }
        
        for (Thread consumer : consumers) { // start Consumers
            consumer.start();
        }
        
        for (Thread consumer : consumers) { // wait for Consumers to stop
            consumer.join();
        }
        
        System.out.println(numMatches + " lines matched");
    }
    
    static class Consumer implements Runnable {
        private List<String> lines;
        private String substring;
        private List<String> matches;
        
        public Consumer(List<String> lines, String substring, List<String> matches) {
            this.lines = lines;
            this.substring = substring;
            this.matches = matches;
        }

        public void run() {
            while (lines.size()>0) {
                int i = (int) (Math.random() * lines.size());
                String line = lines.get(i);
                lines.remove(i);
                if (line.contains(substring)) {
                    matches.add(line);
                    ++numMatches;
                }
            }
        }
    }
}