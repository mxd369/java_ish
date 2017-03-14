/**
 * Monte Carlo Pattern
 * 1st, define a domain of possible inputs.
 * 2nd, generate inputs randomly from a probability distribution over the domain.
 * 3rd, perform a deterministic computation on the inputs. 
 * 4th, aggregate the results. 
 */

/**
 * Approximate the value of PI
 * A simple Monte Carlo simulation can be used to calculate the value of PI,
 * or to approximate the value of PI.
 * 
 * If you had a circle and a square, where the length of a side of the square
 * was the same as the diameter of the circle, the ratio of the area of the
 * circle to the area of the square would be PI over four.
 * So, if you put this circle inside the square and select many random points
 * inside the square, the number of points that fall inside the circle divided
 * by the number of points inside the square
 * and the circle would be approximately PI over four.
 * The benefit of the Monte Carlo method is it allows you to perform this
 * calculation with very high numbers of trials by using the computer simulator.
 * 
 * In this procedure, the domain of inputs is all the points in the square that
 * circumscribes our circle. We randomly generate inputs by simulating the scattering
 * of points inside the square, and then perform a computation on each input.
 * Test whether it falls within the circle or not.
 * Finally, we aggregate the results to obtain our final result, the approximation of Pi.
 */
package simulationsAndAlgorithmAnalysis;

public class FindingPI
{
    public static void main(String[] args)
    {
        // approximate pi using the values listed below for numPoints
        System.out.println(getPi(10000));
        System.out.println(getPi(100000));
        System.out.println(getPi(1000000));
        System.out.println(getPi(10000000));
        System.out.println(getPi(100000000));
        System.out.println(getPi(1000000000));        
    }
    
    public static double getPi(int numPoints)
    {
        int inCircle = 0;
        for(int i = 0; i < numPoints; i++)
        {
            // a square with a side of length 2 centered at 0 has
            // x and y range of -1 to 1
            double randX = (Math.random() * 2) - 1;//range -1 to 1
            double randY = (Math.random() * 2) - 1;//range -1 to 1
            
            // distance from (0,0) = square((x - 0)^2 + (y - 0)^2)
            double dist = Math.sqrt(randX * randX + randY * randY);
            if(dist < 1)
            {
                // circle with diameter of 2 has radius of 1
                // add one every time the point is inside the circle
                inCircle++;
            }
        }
        return 4.0 * inCircle / numPoints;
    }
}