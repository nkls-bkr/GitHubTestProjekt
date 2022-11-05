package org.example;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        Car FordFiesta = new Car("silver", 4,3434.99);
        System.out.println("Your car is colored in " + FordFiesta.getColor() + ".");
    }
}