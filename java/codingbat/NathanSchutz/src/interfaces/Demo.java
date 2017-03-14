package interfaces;
public class Demo {
 
    public static void main(String[] args)
    {
        Student s1 = new Student("Joe", 12, 3.5);
        Student s2 = new Student("Bob", 12, 3.5);
        
        System.out.println(s1.equals(s2));
        
        System.out.println(s1);
        System.out.println(s1);
        
        // comparison using compareTo
        System.out.println("Compare to Returns :: " + s1.compareTo(s2));
        // is it greater than or less than
        // save that into a variable called result
        int result = s1.compareTo(s2);
        if(result < 0)
            System.out.println(s1.getName() + " comes before " + s2.getName());
        else if(result > 0)
            System.out.println(s2.getName() + " comes before " + s1.getName());
        else
            System.out.println(s1.getName() + " is equals to " + s2.getName());
    }
}