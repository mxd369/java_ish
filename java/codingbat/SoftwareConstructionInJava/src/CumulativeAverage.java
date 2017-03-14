public class CumulativeAverage {
    public static void main(String[] args) {
        int[] data = new int[] { 2, 4, 6 };
        int total = 0;
        int average = 0;
        int n = 0;
        for (int value : data) {
            ++n;
            total += value;
            average = total / n;
            System.out.println("average: " + average);
        }
    }
}