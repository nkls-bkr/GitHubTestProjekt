package org.example;

public class Car
{
    //Main variable of the class
    private String color;
    private int numberOfWheels;
    private double price;

    //Constructor
    public Car(String color, int numberOfWheels, double price)
    {
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        this.price = price;
    }
    //Getter
    public int getNumberOfWheels()
    {
        return this.numberOfWheels;
    }

    public double getPrice()
    {
        return this.price;
    }

    public String getColor()
    {
        return this.color;
    }

    //Setter
    public void setColor(String newColor)
    {
        this.color = newColor;
        return;
    }

    public void setPrice(double newPrice)
    {
        this.price = newPrice;
        return;
    }


}
