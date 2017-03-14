/*
use the Monte Carlo simulation to calculate the probability of selecting a certain marble from a bowl of marbles.
I want you to estimate the probability of getting three of the same color marbles if you randomly select the marbles from
a bowl that has a total of six marbles. Three are white, and three are blue.
I'd like to give you a series of steps that you can follow, or an algorithm.
Start by creating unique variables, one to represent whether or not it's a blue marble,
and one for whether or not it's a white marble. Add variables to keep track of the attempts, and the number of successes.
Then set up your loop for the simulation. Create an array to simulate the bowl.
So the array will have six objects that hold the unique variables for blue and white.
Three of those objects should represent blue and three should represent white at the beginning.
Create a second array that only has three marbles.
This array holds the marbles that were randomly selected. Inside the simulation loop, create a smaller loop that will
execute three times to randomly draw three marbles. Inside the loop, randomly choose one marble.
Add it to the array that contains the marbles that were already drawn, and, like I said, reduce the size of your bowl by one.
Specifically, reduce it by the one that you chose. Update the bowl without the selected marble.
Once you've randomly selected three marbles, test to see if all three marbles are the same color.
If they are, add one to your success counter. Either way, make sure you add one to your attempts.
At the end of your simulation, calculate the success rate using the number of successes
divided by the total number of attempts, and return that value back to the main program where it can be printed out.
I'm estimating that this challenge will take you about 15 minutes

Objectives:
  Estimate probability of:
    Getting three same color marbles Out of a bowl with 3 blue/3 white
  
  Algorithm
    -Create unique variables for blue/white Add variables to count attempts/success
    -Loop simulation Create an array to simulate the bowl Create an array to hold marbles selected
    -Create a loop to draw three Inside, randomly choose one add it to drawn array
    reduce the size of the bowl by one update the bowl without the selected marble
  	-test for three matches add to successes if match..calculate success rate return value to main
*/
package simulationsAndAlgorithmAnalysis;
import java.util.Arrays;
public class MonteCarlo
{
    
    public static void main(String[] args)
    {
       System.out.println("Probability of Drawing 3 marbles of the same color-");
       System.out.println("100 trials: " + marbleSimulation(100));
       System.out.println("1000 trials: " + marbleSimulation(1000));
       System.out.println("10000 trials: " + marbleSimulation(10000));
       System.out.println("100000 trials: " + marbleSimulation(100000));
       System.out.println("1000000 trials: " + marbleSimulation(1000000));
       System.out.println("10000000 trials: " + marbleSimulation(10000000));
    }
    /**
     * Runs numTrials trials of a Monte Carlo Simulation of drawing 3 marbles
     * out of a bowl containing 3 blue marbles and 3 white marbles
     * Marbles are not replaced once drawn
     * 
     * @param numTrials
     *   the number of times the method will attempt to draw 3 marbles
     * @returns a double - the fraction of times 3 marbles of the same color were selected
     * 
     */
    // pass in numTrials to method marbleSimulation
    public static String marbleSimulation(int numTrials)
    {
        final int B = 1;// declare to static variables to represent marbles
        final int W = 2;
        
        double number = 0.0;// record the number of successes, all marbles same color
        double result = 0.0;// takes the number of successes divided by numTrials
        
        for (int t = 0; t < numTrials; t++)
        {
            result++; // add one to total attempts
            
            int[] bowl = { B, B, B, W, W, W }; // declare the bowl which has 3 B 3 W
            int[] drawMarbles = new int[3];// create array holds num marbles draw from bowl
            
            for (int draw = 0; draw < 3; draw++)
            {
                //randomly generating a number as my index into the bowl array.
                int index = (int) (Math.random() * bowl.length);
                drawMarbles[draw] = bowl[index];
                // create a newBowl array by reducing the size of the original bowl array minus one.
                int[] newBowl = new int[bowl.length - 1];
                int j = 0;
                /*
                 Then I go through a loop and populate this new bowl but whenever
                 I find the marble that was withdrawn, if (i == index), I skip over that marble.
                 When I'm all done, I reassign my bowl array to the newBowl, and I continue to draw my marbles.
                 */
                for (int i = 0; i < bowl.length; i++)
                {
                    if (i == index)
                    {
                        continue;
                    }
                    newBowl[j] = bowl[i];
                    j++;
                }
                bowl = newBowl;
            }
            // After I've drawn three marbles, I check to see if they are all the same.
            // If they are, I add one to successes.
            if(drawMarbles[0] == drawMarbles[1] && drawMarbles[1] == drawMarbles[2])
            {
                // add one to successes
                number++;
                // System.out.println("winner");
            }
            // System.out.println(Arrays.toString(drawMarbles));
        }
        // And at the very end I return my results.
        // I take the number of successes,
        // meaning three marbles, all the same color,
        // divided by the total attempts.
        return "Results: " + (number / result);
    }
}


