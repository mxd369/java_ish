import java.util.ArrayList;

public class grade
{
    public static void main(String[] args)
    {
        ArrayList<Integer> quizGrades = new ArrayList<Integer>();
        
        quizGrades.add(95);
        quizGrades.add(87);
        quizGrades.add(83);
        
        quizGrades.add(0, 100);
        System.out.println( quizGrades.get(0) );
        
        /*
        for (int counter = 0; counter < 5; counter++) {
            System.out.println("The counter value is: " + counter);
        }
        */
        
        /*
        for (int waterLevel = 0; waterLevel < 7; waterLevel++) {
        }
        */
        
        for (int i = 0; i < quizGrades.size(); i++)
        {
            System.out.println( quizGrades.get(i) );
        }

        System.out.println();
        
        for(Integer grade : quizGrades)
        {
            System.out.println(grade);
        }
        
    }
}