class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    public void drive(){
        if (currentFuelInLiters == 0){
            System.out.println("Car is out of fuel");
        } else if (currentFuelInLiters <= 5) {
            System.out.println("Car is driving, but fuel is low");
            currentFuelInLiters--;
        } else {
            System.out.println("Car is driving");
            currentFuelInLiters--;
        }

    }

    public void addFuel(float fuel){
        currentFuelInLiters+=fuel;
    }

    public  float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }

}

public class ClassAndObject {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
        myCar.addFuel(7);
        System.out.println(myCar.getCurrentFuelLevel());
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());
    }
}
