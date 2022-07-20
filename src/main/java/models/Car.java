package models;

public class Car {
    private String brand;
    private String type;
    private int power;

    public Car(String brand, String type, int power) {
        this.brand = brand;
        this.type = type;
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getPower() {
        return power;
    }
}
