public class StringEquality {
    public static void main(String[] args) {
        String dog1 = new String("dog");
        String dog2 = "dog";
        if(dog1 == dog2) {
            System.out.println("same reference");
        }
        else if (dog1.equals(dog2)){
            System.out.println("same value");
        }
        else {
            System.out.println("different");
        }
    }
}
