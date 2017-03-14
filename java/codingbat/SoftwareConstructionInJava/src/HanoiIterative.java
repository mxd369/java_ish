/**
 *  An iterative solution to the Towers of Hanoi problem.
 *
 *  @author Kevin Andrew Seiter
 */

public class HanoiIterative{
    
    // -------------------------------------------------------------------------
    // All integers needed for program calculations.

    public static int n;           
    public static int numMoves;          
    public static int second = 0;      
    public static int third;             
    public static int pos2;              
    public static int pos3;   
    public static int j;
    public static int i;
  
    public static void hanoi_iter(int n) {          
        int[] locations = new int[ n + 2 ];    //Sets location size 

        for ( j=0; j < n; j++ ){               //For loop - Initially all
            locations[j] = 0;                  //discs are on tower 1
        }

        locations[ n + 1 ] = 2;                //Final disk destination
        numMoves = 1;                          
        for ( i = 1; i <= n; i++){             //Calculates minimum steps
            numMoves *= 2;                     //based on disc size then
        }                                      //subtracts one. ( standard
        numMoves -= 1;                         //algorithm 2^n - 1 )
        System.out.println("Number of Moves: " + numMoves);
        //Begins iterative solution. Bound by min number of steps.
        for ( i = 1; i <= numMoves; i++ ){     
            if ( i%2 == 1 ){                   //Determines odd or even.
                second = locations[1];
                locations[1] = ( locations[1] + 1 ) % 3;
                System.out.print("Move disc 1 to ");
                System.out.println((char)('A'+locations[1]));
            } else {                             //If number is even.
                third = 3 - second - locations[1];
                pos2 = n + 1;
                for ( j = n + 1; j >=2; j-- )   //Iterative vs Recursive.
                    if ( locations[j] == second )
                        pos2 = j;
                pos3 = n + 1;
                for ( j = n + 1; j >= 2; j-- )  //Iterative vs Recursive.
                    if ( locations[j] == third )
                        pos3 = j;
                System.out.print("Move disc "); //Assumes something is moving.

                //Iterative set. Much slower here than Recursive.
                if ( pos2 < pos3 ){
                    System.out.print( pos2 );
                    System.out.print(" to ");
                    System.out.println((char)('A' + third));
                    locations[pos2] = third;
                }
                //Iterative set. Much slower here than Recursive.
                else {
                    System.out.print( pos3 );
                    System.out.print(" to ");
                    System.out.println((char)('A' + second));
                    locations[ pos3 ] = second;
                }
            }
        }
    }
}