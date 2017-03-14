/*
HAILSTONE SEQUENCE

As a running example,
we're going to explore the hailstone sequence,
which is defined as follows.

Starting with a number n,
the next number in the sequence is n/2 if n is even,
or 3n+1 if n is odd.
The sequence ends when it reaches 1.
Here are some examples:

2, 1
3, 10, 5, 16, 8, 4, 2, 1
4, 2, 1
2n, 2n-1 , ... , 4, 2, 1
5, 16, 8, 4, 2, 1
7, 22, 11, 34, 17, 52, 26, 13, 40, ...? (where does this stop?)


Because of the odd-number rule,
the sequence may bounce up and down before decreasing to 1.
It's conjectured that all hailstones eventually fall to the ground — i.e.,
the hailstone sequence reaches 1 for all starting n — but that's still an open question.
Why is it called a hailstone sequence?
Because hailstones form in clouds by bouncing up and down,
until they eventually build enough weight to fall to earth.
*/


/*
public class hailstonesequence {
	int n = 3;
	while (n != 1) {
		System.out.println(n);
		if (n % 2 == 0){
			n = n / 2;
		} else {
			n = 3 * n + 1;
		}
	}

public static void main(String args[]){
	//System.out.println("Hello");
	}
}
*/

public class hailstonesequence {
    public static void main(String[] args) {
        printHailstoneMaxMin(7, 10);
        printHailstoneMaxMin(7, 20);
    }

    public static void printHailstoneMaxMin(int value, 
                                            int length) {
        int min = value;
        int max = value;
        for (int i = 1; i <= length - 1; i++) {
            if (value % 2 == 0) {
                value = value / 2;
            } else {
                value = 3 * value + 1;
            }
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}










