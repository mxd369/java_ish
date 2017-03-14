package mehdi10ADTAndCollections;

public class Student{
	private String name;
	private String level;
	private String major;
	private LapTop hasLaptop;
	private Backpack hasBackPack;
}

public class Laptop {
	private String make;
	private String model;
	private String cpul
	public Laptop (){
		// ...
	}
}

public class Backpack{
	private String brand;
	private float capacity;
	private int compartments;
	public Backpack(){
		// ...
	}
}


/*
Data Types

Data Model as UML Class Diagram

==============Data Types
Student:
 -name: String
 -level: String
 -major: String
 
 hasLapTop
 hasBackpack

Laptop:
 -make: String
 -model: String
 -cpu: String


Backpack:
 -brand: String
 -capacity: float
 -compartments: int

================Data Types

s1: Student
  name = "Becky"
  level = "Senior"
  major = "CS"
  
  hasLapTop
  hasBackpack


l1: Laptop
  make = "HP"
  model = "g6-1d48dx"
  cpu = "AMD A6-3420M"

b1: Backpack
  brand = "SwissGear"
  capacity = 15.6
  compartments = 5

s1
  name = "Becky"
  level ="Senior"
  major = "CS"

==================Data Types: Hiding Details

public class Student
{
  public String getName()
  public String getLevel()
  public String getMajor()
  public Laptop getLaptop()
  public Backpack getBackpack()
}

public class Laptop
{
  public String getMake()
  public String getModel()
  public String getCPU()
}

public class Backpack
{
  public String getBrand()
  public float getCapacity()
  public int getCompartments()
}


public interface Student
{
  String getBrand();
  float getCapacity();
  int getCompartments();
}

public interface Laptop
{
  String getMake();
  String getModel();
  String getCPU();
}

public interface Backpack
{
  String getBrand();
  float getCapacity();
  int getCompartments();
}

======================Data types
public interface Student
{
  String getName();
  String getLevel();
  String getMajor();
  Laptop getLaptop();
  Backpack getBackpack();
}
