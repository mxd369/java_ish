package ch5;
import java.util.Random;
import java.math.*;
public class RandomNumber{
	
	public static int random100(){
		Random rand = new Random();
		return rand.nextInt(100) + 1;
	}
	
	
	/*
	public static int randomInRange(int a, int b)
	{
		Random rn = new Random();
		return rn.nextInt(a) + b;
	}
	*/
	
	/*
	Write a method called randomInRange that accepts two integer parameters representing a
	range. The method should return a random integer in the specified range (inclusive). Return
	zero if the first parameter is greater than the second.
	// assumes java.util.Random is imported
	*/
	public static int randomInRange (int first, int second)
	{
		int result = 0;
		Random generator = new Random();
		if (first <= second)
		{
			int range = second - first + 1;
			result = generator.nextInt(range) + first;
		}
	 return result;
	} 
	
	
	// powersOfTwo is a function that prints first 10 numbers
	/**
	 * powersOfTwo prints the first 10 powers of 2 (starting with 2)
	 * @param none
	 * @return none
	 */
	public static void powersOfTwo()
	{
		int base = 2;
		for (int pow = 1; pow <= 10; pow++)
		System.out.println((int)Math.pow(base,pow));
	}
	
	
	public static void main(String[] args){
		System.out.println(random100());
		System.out.println(randomInRange(500,1000));
		//System.out.println(randomInRange(200,150));
		//System.out.println(powersOfTwo());
	}
	
	
	
}