package testingGround2;

import java.io.*;
import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable{
    public String fname, lname, course;
    int section;
    private static final long serialVersionUID = 1L;

    public static ArrayList<Student> students = getStudent();

    public Student()
    {}

    public Student(String fname, String lname, String course, int section){
        this.fname = fname;
        this.lname = lname;
        this.course = course;
        this.section = section;
    }
    public static void addStudent(){
        String fname = GetInput.getInput("Enter the First Name: ");
        String lname = GetInput.getInput("Enter the Last Name: ");
        String course = GetInput.getInput("Enter the Course: ");
        String S_section = GetInput.getInput("Enter the section: ");
        int section = Integer.parseInt(S_section);
        Student student = new Student(fname, lname, course, section);  
        students.add(student); 
        System.out.println("Writing to file...");
        try {
            writeToFile(student);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Student> getStudent(){
        try{
            FileInputStream fis = new FileInputStream("C:\\students.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Student> students1 = (ArrayList<Student>) ois.readObject();

            ois.close();

            return students1;
        } catch( ClassNotFoundException | IOException ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }
    public static void listStudent(ArrayList<Student> students){
        System.out.println("View the Records in the Database:");
        for(Student student: students){
            System.out.println("Name: " + student.fname + " " + student.lname);
            System.out.println("Course: " + student.course);
            System.out.println("Section: " + student.section);
            System.out.println();
        }
    }

    static void writeToFile(Student student) throws FileNotFoundException, IOException{
        String path = "C:\\students.ser";
        FileOutputStream fos = new FileOutputStream(path, true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student);
        oos.close();
        System.out.println("New Record has been written!");
    }
}