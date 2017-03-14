// exception an error or anomaly that occurs as a program is executing
public class ExceptionHandling
{
	public static void main(String[] args)
	{
		try{
			int a[] = new int[2];
			System.out.println(a[5]);
		} catch (Exception e) {
			System.out.println("An error occured");
		}
	}
}