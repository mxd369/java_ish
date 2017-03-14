import java.util.ArrayList;

public class weeklyTemperatures
{
    public static void main(String[] args)
  {
        ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
        weeklyTemperatures.add(78);
        weeklyTemperatures.add(67);
        weeklyTemperatures.add(89);
        weeklyTemperatures.add(94);
        System.out.println(weeklyTemperatures);
        System.out.println(weeklyTemperatures.get(1));
        
        weeklyTemperatures.add(2, 111);

        System.out.println(weeklyTemperatures.get(3));
        System.out.println();
        
        for (int i = 0; i < weeklyTemperatures.size(); i++)
        {
            System.out.println(weeklyTemperatures.get(i));
        }


    }
}