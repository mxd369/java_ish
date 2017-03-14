package arraylist;
import java.util.ArrayList;

public class DemoArrayList
{
    public static void main(String[] args) {
        // assign
        ArrayList<String> fruit = new ArrayList<String>();
        
        // compile
        System.out.println("Before adding to fruit-list: " + fruit);
        
        fruit.add("PineApple");
        fruit.add("Coconut");
        fruit.add("Pear");
        fruit.add("Peach");
        fruit.add("Grape");
        fruit.add("Apple");
        fruit.add("Jackfruit");
        
        System.out.println("After adding to fruit-list: " + fruit);
        
        
        // add to specific position
        fruit.add(1, "Cherry");
        
        // remove
        fruit.remove("Pear");
        
        // contains
        boolean containsKiwi = fruit.contains("Kiwi");
        System.out.printf("Contains Kiwi: %b%n", containsKiwi);
        
        // indexOf
        int indexOfApple = fruit.indexOf("Apple");
        System.out.printf("index of Apple: %d%n", indexOfApple);

        // add if indexOfApple is greater than 2
        if (indexOfApple >= 2)
        {
            fruit.add("Watermelon");
        }
        
        System.out.println("Final fruit-list: " + fruit);
        
        
        int numfruit = 0;
        
        for(int i = 0; i < fruit.size() ; i++)
        {
           numfruit += 1;
        }
        System.out.println("num of fruit is " + numfruit);

    }
    

}