/*
In the tester,
make an object and access the object's variables and methods
*/
class DogTestDrive {
	public static void main(String[] args) {
		// Dog Test code goes here
		// just a main method

		// Make a Dog Object
		Dog d = new Dog();

		// use the dot operator (.) to set the size of the Dog
		d.size = 40;

		// call its bark() method
		d.bark();
	}
}