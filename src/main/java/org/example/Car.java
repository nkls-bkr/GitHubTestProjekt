package org.example;

public class Car {
    //Main variable of the class
    private String serialNumber;
    private String name;
    private String color;
    private double price;


    //Constructor
    public Car(String serialNumber, String name, String color, double price) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


