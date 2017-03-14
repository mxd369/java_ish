class FinancialCalc {

    public static void main(String[] args) {
        double principal = 1000.00; // $1000 initial investment
        double interestRate = 0.035; // 3.5% interest rate
        int numOfYears = 7; // investment length is 7 years

        double finalValue = 0.0;
        finalValue = principal * Math.pow((1 + interestRate), numOfYears);

        System.out.println("Investing $" + principal
                + " at an interest rate of " + (interestRate * 100) + "%"
                + " for " + numOfYears + " years"
                + " will have a final worth of $" + finalValue);
        System.out.println();
        
        System.out.println("Using computeFinalValue:");
        System.out.println("Investing $" + principal
                + " at an interest rate of " + (interestRate * 100) + "%"
                + " for " + numOfYears + " years"
                + " will have a final worth of $" 
                + computeFinalValue(principal, interestRate, numOfYears));
        System.out.println();
        
        System.out.println("Using computePrincipal:");
        System.out.println("Investing $" 
                + computePrincipal(finalValue, interestRate, numOfYears)
                + " at an interest rate of " + (interestRate * 100) + "%"
                + " for " + numOfYears + " years"
                + " will have a final worth of $" + finalValue);
        System.out.println();
        
        System.out.println("Using computeInterestRate");
        System.out.println("Investing $" + principal
                + " at an interest rate of " 
                + (computeInterestRate(finalValue, principal, numOfYears) * 100) + "%"
                + " for " + numOfYears + " years"
                + " will have a final worth of $" + finalValue);
        System.out.println();
        
        System.out.println("Using computeNumOfYears:");
        System.out.println("Investing $" + principal
                + " at an interest rate of " + (interestRate * 100) + "%"
                + " for " 
                + computeNumOfYears(finalValue, principal, interestRate) + " years"
                + " will have a final worth of $" + finalValue);
    }
    
    /**
     * Given the initial investment, interest rate, and number of years,
     * calculate the final value according to the formula:
     *      FV = P * (1 + I) ^ (y)
     *      
     * @param principal
     *                  double representing initial investment
     * @param interestRate
     *                  double representing interest rate
     * @param numOfYears
     *                  int representing duration/ number of years
     */
    static double computeFinalValue(double principal,
                                    double interestRate,
                                    int numOfYears) {
        /*REPLACE WITH YOUR CODE*/
        return 0.0;
    }

    /**
     * Given the final value, interest rate, and number of years,
     * calculate the initial investment (principal) according to the formula:
     *      FV = P * (1 + I) ^ (y)
     *      
     * @param finalValue
     *                  double representing final value
     * @param interestRate
     *                  double representing interest rate
     * @param numOfYears
     *                  int representing duration/ number of years
     */
    static double computePrincipal(double finalValue,
                                   double interestRate,
                                   int numOfYears) {
        /*REPLACE WITH YOUR CODE*/
        return 0.0;
    }

    /**
     * Given the final value, initial investment, and number of years,
     * calculate the interest rate according to the formula:
     *      FV = P * (1 + I) ^ (y)
     *      
     * @param finalValue
     *                  double representing final value
     * @param principal
     *                  double representing initial investment
     * @param numOfYears
     *                  int representing duration/ number of years
     */
    static double computeInterestRate(double finalValue,
                                      double principal,
                                      int numOfYears) {
        /*REPLACE WITH YOUR CODE*/
        return 0.0;
    }

    /**
     * Given the final value, principal, and interest rate.
     * calculate the duration according to the formula:
     *      FV = P * (1 + I) ^ (y)
     *      
     * @param finalValue
     *                  double representing final value
     * @param principal
     *                  double representing initial investment
     * @param interestRate
     *                  double representing interestRate
     */
    static double computeNumOfYears(double finalValue,
                                    double principal,
                                    double interestRate) {
        /*REPLACE WITH YOUR CODE*/
        return 0.0;
    }

}