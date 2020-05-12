package Homework1;

public class Car {
    private String make;
    private String model;
    private int year;
    private double gallonsOfGas;
    private double milesPerGallon;

    public Car(String make, String model, int year, double gallonsOfGas, double milesPerGallon) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.gallonsOfGas = gallonsOfGas;
        this.milesPerGallon = milesPerGallon;
    }

    public void drive(int numOfMiles) {

        System.out.println("Drove " + numOfMiles + " miles!");
        double gallonsUsed = 1.25;
        this.gallonsOfGas = 20 - 1.25;
    }

    public void refuel(int amount) {
        System.out.println("Refueled " + amount + " gallons!");
        this.gallonsOfGas = gallonsOfGas + amount;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGallonsOfGas() {
        return gallonsOfGas;
    }

    public void setGallonsOfGas(double gallonsOfGas) {
        this.gallonsOfGas = gallonsOfGas;
    }

    public double getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(double milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }
}
