package linkedstackcode;
import java.util.Scanner;
public class StackTester 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String sentence;
		
			System.out.println("Please enter the sentence: ");
			sentence = keyboard.nextLine();
			System.out.println("If you want to print it completely backwards, enter '1'.");
			System.out.println("If you want to print the letters backwards with the words still in order, enter '2'.");
			int option = keyboard.nextInt();
		
			if(option==2)
			{
				LinkedListStack<Character> l = new LinkedListStack<Character>();
				boolean done = false;
				int i=-1;
				while(!done)
				{
					for (i+=1; i<sentence.length(); i++)
					{
						if(sentence.charAt(i)==' ')
							break;
						else
							l.push(sentence.charAt(i));
					}
					int size = l.size();
					int j;
					for(j=0; j<size; j++)
					{
						System.out.print(l.pop());
					}
					System.out.print(" ");
					if(i>sentence.length())
					{
						done=true;
						System.out.println();
					}
					
				}
			}
			else if (option ==1)
			{
				LinkedListStack<Character> l = new LinkedListStack<Character>();
				int i;
				for(i=0; i<sentence.length(); i++)
				{
					l.push(sentence.charAt(i));
				}
			
				int size =l.size();
				for(i=0; i<size; i++)
				{
					System.out.print(l.pop());
				}
				System.out.println();
			}
		
		keyboard.close();
	}

}
