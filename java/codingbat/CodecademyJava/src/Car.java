class Car extends Vehicle {

    int modelYear;

    public Car(int year) {

        modelYear = year;

    }

    //Other methods omitted for brevity...

    public static void main(String[] args){

        Car myFastCar = new Car(2007);
        myFastCar.checkBatteryStatus();

    }
}

/*

class Car {

    int modelYear;

    public Car(int year) {

        modelYear = year;

    }

    public void startEngine() {

        System.out.println("Vroom!");

    }

    public void drive(int distanceInMiles) {

        System.out.println("Your car drove " + distanceInMiles + " miles!");

    }

    public int numberOfTires() {

        return 4;

    }

    public static void main(String[] args){

        Car myFastCar = new Car(2007)
        myFastCar.startEngine();
        myFastCar.drive(1628);

        int tires = myFastCar.numberOfTires();
        System.out.println(tires);

    }
}

*/