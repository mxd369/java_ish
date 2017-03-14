//********************************************************************
//  BackPainAnalyzer.java       Java Foundations
//
//  Demonstrates the use of a binary tree.
//********************************************************************

public class BackPainAnalyzer
{
   //-----------------------------------------------------------------
   //  Asks questions of the user to diagnose a medical problem.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      BackPainExpert expert = new BackPainExpert();
      expert.diagnose();
   }
}
