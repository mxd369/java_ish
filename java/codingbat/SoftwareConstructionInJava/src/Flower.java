
public class Flower {
    static int numberOfFlowers = 0;
    
    static {
        System.out.println("Flower Class Loaded");
    }
    
    public Flower() {
        numberOfFlowers++;
    }
    
    public int petalLengthSum() {
        int[] petalLengths = new int[8];
        int sum = 0;
        for(int petalLength : petalLengths) {
            petalLength = 10;
            sum += petalLength;
        }
        return sum;
    }
    public void dimensions() {
        int height = 7;
        for(int i = 0; i < 10; i++) {
            int width = 0;
            for(int j = 10; j > 0; j--) {
                width = 4;
            }
        }
        int radius = 10;
        while(radius > 0) {
            radius--;
        }
        
        System.out.println(height);
        System.out.println(radius);
    }
    
    public static void main(String args[])
    {
        Flower rose = new Flower();
        System.out.println("There is " +  Flower.numberOfFlowers + " flower!");
        Flower lily = new Flower();
        System.out.println("Now, there are " +  Flower.numberOfFlowers + " flowers!");
    }
}