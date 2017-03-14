// format: Right-click > Source > Format

public class Student {

    // instance variables
    private String lastName;
    private String firstName;
    private int age;

    // Constructor
    // Right-click > Source > Generate Constructor using Fields
    public Student(String lastName, String firstName, int age) {
        super();
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    // Getter and Setter
    // Right-click > Source > Generate Getters and Setters > Select All > OK
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // override toString
    // Right-click > Source > Override / Implement Methods > toString()
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    // main CTRL+SPACE
    public static void main(String[] args) {
        // sysout CTRL + SPACE
        System.out.println("foobar");

        // foreach CTRL + SPACE
        for (String temp : args) {

            System.out.println(temp);
        }

    }

}