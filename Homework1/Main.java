package Homework1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Infiniti", "G35", 2006, 20, 20);
        car.drive(25);
        System.out.println("There is now " + car.getGallonsOfGas() + " gallons of gas!");
        car.refuel(10);
        System.out.println("There is now " + car.getGallonsOfGas() + " gallons of gas!");
    }
}
