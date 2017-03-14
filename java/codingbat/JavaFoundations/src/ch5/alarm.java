package ch5; 
public class alarm{

	public static void alarm(int num)
	{
		if(num >= 1)
		{
			for (int i = 0; i <= num; i ++)
				System.out.println("Alarm!");
		}
		else
			System.out.println("Error");
	}
}