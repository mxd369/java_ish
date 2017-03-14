package simulationsAndAlgorithmAnalysis;
/**
 * Recursion Example
 * @author MXD
 */
public class RecursionExample
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("Start Countdown");
        countDown(10);//initialize and call the countDown method, control is transferred to line 19
        System.out.println("End");
    }
    public static void countDown(int count)
    {
        if(count == 0)//this is the start of the countDown method with a stop value at 0
            return;// base case is 0, return after it reaches the base case, prevents infinite loop
        //if not base case print the count variable is at that time
        System.out.println(count + "...");
        //call the method again, call the method again with 9
        countDown(count-1);
    }
    
}