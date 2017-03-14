//********************************************************************
//  SearchPlayerList.java       Java Foundations
//
//  Demonstrates a linear search of Comparable objects.
//********************************************************************

public class SearchPlayerList
{
   //-----------------------------------------------------------------
   //  Creates an array of Contact objects, then searches for a
   //  particular player.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Contact[] players = new Contact[7];

      players[0] = new Contact ("Rodger", "Federer", "610-555-7384");
      players[1] = new Contact ("Andy", "Roddick", "215-555-3827");
      players[2] = new Contact ("Maria", "Sharapova", "733-555-2969");
      players[3] = new Contact ("Venus", "Williams", "663-555-3984");
      players[4] = new Contact ("Lleyton", "Hewitt", "464-555-3489");
      players[5] = new Contact ("Eleni", "Daniilidou", "322-555-2284");
      players[6] = new Contact ("Serena", "Williams", "243-555-2837");

      Contact target = new Contact ("Eleni", "Daniilidou", "");

      Contact found = (Contact)Searching.linearSearch(players, target);

      if (found == null)
         System.out.println ("Player was not found.");
      else
         System.out.println ("Found: " + found);
   }
}
