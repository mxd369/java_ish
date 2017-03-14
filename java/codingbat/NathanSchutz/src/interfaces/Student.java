// Interfaces Part 6: Comparable Interface (Java)

/*
This video looks at how the compareTo() method of the Comparable interface can be
implemented in the Java programming language.
It shows how the compareTo() method can be used to compare multiple variables
and sort items accordingly.
*/
package interfaces;
public class Student implements Comparable<Student>
{
    private String name;
    private int grade;
    private double gpa;
    
    public Student(String name, int grade, double gpa)
    {
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
    }
    
    public String getName() { return name; }
    public int getGrade() { return grade; }
    public double getGPA() { return gpa; }
 
    public boolean equals(Student other)
    {
        return this.getGrade() == other.getGrade();
    }
    
    /**
     * compareTo
     * Takes in a value for comparison
     */
    public int compareTo(Student other/*Object temp*/)
    {
        // Object cast
        // Student other = (Student) temp;
        // compare grade level
        if(getGrade() > other.getGrade())
        {
            return 1;
        }
        else if(getGrade() < other.getGrade())
        {
            return -1;
        }
        else
            return 0;
    }
    // end compareTo method

    public String toString()
    {
        return "(Name :: " + getName() + " Grade :: " + getGrade() + " GPA :: " + getGPA() + "}";
    }

}