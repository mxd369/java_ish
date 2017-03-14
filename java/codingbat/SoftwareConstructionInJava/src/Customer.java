import Customer.MinutesWaiting;

public class Customer {

    public static int numberOfCustomers = 0;
    private int customerId = 0;
    
    public void setCustomerId(long l) {
        int multiplicationFactor = (int)l;
        int number = (int) (Math.random() * multiplicationFactor);
        customerId = number;
    }
    
    public static void main(String[] args) {
        Customer sarah = new Customer();
        if(sarah instanceof Customer) {
            System.out.println("sarah is a Customer!");
        }
        
        MinutesWaiting sarahMinutes = (int a) -> { return a * 60; };
    }
    
    interface MinutesWaiting {
        int multiplication(int a);
    }
    
}
