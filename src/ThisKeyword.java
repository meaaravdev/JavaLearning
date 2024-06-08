class myCar {
    float currentFuelOfCar;
    public myCar start(){
        if (currentFuelOfCar==0){
            System.out.println("Your not have fuel, pls refuel");
        } else if (currentFuelOfCar<=5) {
            System.out.println("Your car is started, but fuel is low");
        } else {
            System.out.println("Your car is started");
        }
        return this;
    }

    public float addFuel(float currentFuelOfCar){
        this.currentFuelOfCar+=currentFuelOfCar;
        return currentFuelOfCar;
    }

    public void drive(){
        if (currentFuelOfCar==0){
            System.out.println("your engine not started because you not have fuel");
        } else {
            start();
            System.out.println("Car is Driving");
            currentFuelOfCar--;
            System.out.println(this.currentFuelOfCar);
        }
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        myCar audiQ8 =  new myCar();
        audiQ8.addFuel(7);
        audiQ8.start().drive();
    }

}
