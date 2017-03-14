public class RecursionExample
{

    public static void main(String[] args)
    {
        countDown(10);
    }
    
    public static void countDown(int count)
    {
        if (count == 0)
            return;
        System.out.println(count + "...");
        countDown(count - 1);
    }

}