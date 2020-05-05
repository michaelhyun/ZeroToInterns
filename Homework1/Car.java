package Homework1;

public class Car {
    private String make;
    private String model;
    private int year;
    private double gallonsOfGas;
    private double milesPerGallon;

    public Car(String make, String model, int year, int gallonsOfGas, double milesPerGallon) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.gallonsOfGas = gallonsOfGas;
        this.milesPerGallon = milesPerGallon;
    }

    public void drive(int numOfMiles) {
        System.out.println("Drove " + numOfMiles + " miles!");
//        bonus answer using if and else
//        if(gasAmount - numOfMiles/milesPerGallon < 0) {
//            System.out.println("Ran out of gas!");
//            this.gasAmount = 0;
//        }
//        else {
//            this.gasAmount = gasAmount - numOfMiles/milesPerGallon;
//        }
        double gallonsUsed = numOfMiles/milesPerGallon;
        this.gallonsOfGas = gallonsOfGas - gallonsUsed;
    }

    public void refuel(int amount) {
        System.out.println("Refueled " + amount + " gallons!");
        this.gallonsOfGas = gallonsOfGas + amount;
    }

    public double getGallonsOfGas() {
        return gallonsOfGas;
    }

    public void setGallonsOfGas(int gasAmount) {
        this.gallonsOfGas = gasAmount;
    }

    public double getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
