
public class Fib {
    
    // return the fibonacci number of n calculated iteratively
    public static long fibIter(int n) {
        long fibPrev = 1;
        long fibPrevPrev = 1;
        long fib = 1;
        for(int i=2; i<= n; i++) {
            fibPrevPrev = fibPrev;
            fibPrev = fib;
            fib = fibPrev + fibPrevPrev;
        }
        return fib;
    }
    
    
    // return the fibonacci number of n calculated recursively
    public static long fibRecur(int n) {
        if(n == 0)
            return 1;
        else if(n == 1)
            return 1;
        else 
            return fibRecur(n-1) + fibRecur(n-2);
    }
    

    public static void main(String[] args){
        for(int i=0; i<80; i++)
            System.out.println("fib("+i+") = "+ fibIter(i));
        
        for(int i=0; i<80; i++)
            System.out.println("fib("+i+") = "+ fibRecur(i));
    }
}