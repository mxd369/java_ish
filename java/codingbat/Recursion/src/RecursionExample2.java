public class RecursionExample2
{
    public static void main(String[] args)
    {
        countDown(10);
    }
    public static void countDown(int count)
    {
        if(count == 0)
            System.out.println("End");
        else
        {
            System.out.println(count);
            countDown(count - 1);
        }
    }
}