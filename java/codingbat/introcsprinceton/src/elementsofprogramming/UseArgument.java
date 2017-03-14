/******************************************************************************
 *  Compilation:  javac UseArgument.java
 *  Execution:    java UseArgument yourname
 *
 *  Prints "Hi, Bob. How are you?" where "Bob" is replaced by the
 *  command-line argument.
 *
 *  % java UseArgument Bob
 *  Hi, Bob. How are you?
 *
 *  % java UseArgument Alice
 *  Hi, Alice. How are you?
 *
 ******************************************************************************/
package elementsofprogramming;

public class UseArgument
{
    public static void main(String[] args)
    {
        System.out.println("Hi, ");
        System.out.println(args[0]);
        System.out.println(". How are you?");
    }
}