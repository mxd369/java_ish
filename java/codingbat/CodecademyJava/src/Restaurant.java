import java.util.HashMap;

public class Restaurant
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>();
        
        restaurantMenu.put("Turkey Burger", 13);
        restaurantMenu.put("Naan Burger", 11);
        restaurantMenu.put("Cranberry Kale Salad", 10);
        restaurantMenu.put("Naan Pizza", 8);
        
        System.out.println("Naan Pizza");
        
        
        System.out.println();
        for (String item: restaurantMenu.keySet())
        {
            System.out.println("A "
                                + item
                                + " costs "
                                + restaurantMenu.get(item)
                                + " dollars.");
        }

    }
}