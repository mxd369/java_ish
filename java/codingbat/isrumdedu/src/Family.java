/*
 * =================================================================
 * Family.java. Create person objects and compute their age...
 * 
 * Note. This implementation does not try to model relationships  
 *       between family members. 
 * 
 * Written By: Mark Austin                             December 2006
 * =================================================================
 */

import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Family {
   ArrayList member = new ArrayList();
 
   // Sort family members by age ....

   public void sortByAge () {
      Collections.sort( member, new ageCompare() );
   }

   class ageCompare implements Comparator {
      public int compare( Object o1, Object o2) {
          Person p1 = (Person) o1;
          Person p2 = (Person) o2;
          if ( p1.getAge() == p2.getAge() )
               return  0;
          else if ( p1.getAge() > p2.getAge() )
               return  1;
          else
               return -1;
      }
   }

   // ==========================================================
   // Exercise methods in Person class ....
   // ==========================================================

   public static void main ( String [] args ) {

      // Create four person objects ....

      Person abe = new Person();
      abe.setName("Abe Simpson");
      abe.setBirthDate ( 1911, Calendar.JANUARY, 1 );

      Person homer = new Person();
      homer.setName("Homer Simpson");
      homer.setBirthDate ( 1956, Calendar.JANUARY, 1 );

      Person bart = new Person();
      bart.setName("Bart Simpson");
      bart.setBirthDate ( 1985, Calendar.APRIL, 1 );

      Person lisa = new Person();
      lisa.setName("Lisa Simpson");
      lisa.setBirthDate ( 1987, Calendar.APRIL, 1 );

      // Create an array list of Simpson family members ...

      Family simpson = new Family();

      // Add people to the family definition ....

      simpson.member.add( homer );
      simpson.member.add( abe );
      simpson.member.add( bart );
      simpson.member.add( lisa );

      // Walk along list and print details ....

      System.out.println("Meet The Simpsons!           ");
      System.out.println("=============================");

      for ( int i = 0; i < simpson.member.size(); i = i + 1 ) {
          Person p = (Person) simpson.member.get(i);
          System.out.println( p.toString() );
      }

      // Sort family members by age .....

      simpson.sortByAge();

      // Print sorted list .....

      System.out.println("Order: From youngest to oldest ...  ");
      System.out.println("==================================");

      for ( int i = 0; i < simpson.member.size(); i = i + 1 ) {
          Person p = (Person) simpson.member.get(i);
          System.out.println( p.toString() );
      }
   }
}