public class Factorial {

    /** 
     * @param n must be >= 0
     * @return n!
     */
    public static int fact(int n) {
        System.out.println("working on fact(" + n + ")");
        // Check if n is less than or equal to 1.
        if (n <= 1) { return 1; }
        else { return n * fact(n-1); }
    }

    /**
     * Computes n! in a thread and prints it on standard output.
     * @param n must be >= 0
     */
    private static void computeFactInThread(final int n) {
        Thread t = new Thread(new Runnable() {
            public void run() {
                int factn = fact(n);
                System.out.println("fact(" + n + ") = " + factn);
            }
        });
        // thread is now created -- but don't forget to start it!
        t.start();
    }
    
    public static void main(String[] args) {
        for (int n = 0; n < 10; ++n) {
            computeFactInThread(n);
        }
    }
}
