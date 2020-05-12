package Homework1;

public class Main {
    public static void main(String[] args) {
        Car firstCar = new Car("Infiniti", "G35", 2006, 20, 20);
        firstCar.drive(25);


        System.out.println("There is now " + firstCar.getGallonsOfGas() + " gallons of gas!");
        firstCar.refuel(10);
        System.out.println("There is now " + firstCar.getGallonsOfGas() + " gallons of gas!");
    }
}
