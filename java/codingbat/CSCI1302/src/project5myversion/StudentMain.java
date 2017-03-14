package project5myversion;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StudentMain
{
    public static void main(String[] args)
    {    
        
        // *********************************************************************************************** ArrayList
        List<Person> person = new ArrayList<Person>();
        //person.add(new Person(2232, "Lebron", "James", "09-28-1987"));
        person.add(new Student(5517, "Ashley", "Jones","12-15-1997", "SU"));
        person.add(new Student(9949, "Edward", "Monos", "01-11-1991", "UTA"));
        person.add(new Student(2232, "John", "Blueon", "04-18-1990", "GSU"));
        person.add(new Student(2872, "Hamilton", "Poe", "01-25-1987", "UGA"));
        person.add(new Student(9834, "Rob", "Flenn", "10-05-1993", "GSU"));
        person.add(new Student(3421, "Jennifer", "Shin", "06-12-1990", "NYU"));
        person.add(new Student(8897, "Esther", "Cole", "03-05-1998", "MIT"));
        // *********************************************************************************************** ArrayList
        // *********************************************************************************************** Serialize
        // print test
        // Persons: [5517 Bobby Fisher 02-15-1990, 9949 Rickson Flair 11-12-1992, 2232 Lebron James 09-28-1987, 5517 Ashley Jones 12-15-1997 [SU], 9949 Edward Monos 01-11-1991 [UTA], 2232 John Blueon 04-18-1990 [GSU], 2872 Hamilton Poe 01-25-1987 [UGA], 9834 Rob Flenn 10-05-1993 [GSU], 3421 Jennifer Shin 06-12-1990 [NYU], 8897 Esther Cole 03-05-1998 [MIT]]
        // System.out.println("Persons: " + person);   
        StudentDirectory directory = new StudentDirectory();
        directory.serialize(person, "src/project5myversion/StudentsList.dat");
        
        System.out.println("Serialization Complete");
        // *********************************************************************************************** Serialize
        // *********************************************************************************************** Deserialize & loadList
        // create a new list of Person
        List<Person> newList = directory.deserialize("src/project5myversion/StudentsList.dat");
        
        // print list
        // New list: [5517 Bobby Fisher 02-15-1990, 9949 Rickson Flair 11-12-1992, 2232 Lebron James 09-28-1987, 5517 Ashley Jones 12-15-1997 [SU], 9949 Edward Monos 01-11-1991 [UTA], 2232 John Blueon 04-18-1990 [GSU], 2872 Hamilton Poe 01-25-1987 [UGA], 9834 Rob Flenn 10-05-1993 [GSU], 3421 Jennifer Shin 06-12-1990 [NYU], 8897 Esther Cole 03-05-1998 [MIT]]
        // System.out.println("New list: " + newList);
        System.out.println("Deserialization Complete");
        
        // retrieve
        for (Person p:person)
        {
            System.out.println ("retrieved: " + p);
        }
        // *********************************************************************************************** Deserialize & loadList
        
        
        
        // *********************************************************************************************** GUI
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDirectory().setVisible(true);
            }
        });
        // *********************************************************************************************** GUI  
        
    }
}