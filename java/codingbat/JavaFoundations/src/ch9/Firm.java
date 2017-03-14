/*
Program modify the Firm class creates the interface
called Payable such that it accomplishes polymorphism
using an interface Payable


Interface: Payable
Class:
  StaffMember,
  Volunteer,
  Employee,
  Executive,
  Hourly
  Firm
 
Methods:
  toString(),
  pay(),
  awardBonus(),
  addHours()
   
Input:
  name,
  address,
  phone,
  socialSecurityNumber,
  payRate,
  bonus,
  hoursWorked

Output:
  Displays employee information
*/
//********************************************************************
//  Firm.java       Java Foundations
//
//  Demonstrates polymorphism via inheritance.
//********************************************************************
package ch9;
public class Firm
{
   //-----------------------------------------------------------------
   //  Creates a staff of employees for a firm and pays them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Staff personnel = new Staff();

      personnel.payday();
   }
}