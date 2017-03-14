package ch5;
public class tester
{

	public static void main(String[] args)
	{
		System.out.println(alarm(4));
		System.out.println(sum100());
		System.out.println(maxOfTwo(5,4));
		System.out.println(maxOfTwo(2,4));
		System.out.println(maxOfTwo(4,4));
		System.out.println(sumRange(0,4));
		System.out.println(larger(10,4));
		System.out.println(larger(1,4));
		//System.out.println(countA("AppleApps"));
	}

	/*
	private static char[] alarm(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	*/
	public static int alarm(int num)
	{
		if(num >= 1)
		{
			for (int i = 0; i < num; i ++)
				System.out.println("Alarm!");
		}
		else
			return 0;
		return num;
	}

	//
	 public static int sum100()
	 {
	 	int sum = 0;
	 	for(int i = 1;i<=100;i++){
	 		sum = sum + i;
	 	}
	 	return sum;
	 } // should be 5050

	
	 //
	 public static int maxOfTwo(int a, int b)
	 {
	 	int larger;
	 	if (a > b){
	 		larger = a;
	 	} else
	 		larger = b;
	 	return larger;
	 } 
	 

	 // EX 5.14
	 public static int sumRange(int startNum, int endNum)
	 {

	 	int sum = 0;
	 	if (endNum < startNum)
	 		return 0;
	 	for(int i = startNum; i <= endNum; i++)
	 	{
	 		sum = sum + i;
	 	}
	 	return sum;
	 }
	 
	 // EX 5.15
	 public static boolean larger(double a, double b)
	 {
	 	return (a > b);
	 }
	 
	 
	 // EX 5.16
	 /*
	 public static int countA(String str)
	 {
	 	int count = 0;
	 	for(int i = 0;i<str.length();i++)
	 	{
	 		if(str.substring(i,i+1).equals("A"))
	 		{
	 			count = count + 1;
	 		}
	 	return count;
	 	}
	 }
	 */


}




