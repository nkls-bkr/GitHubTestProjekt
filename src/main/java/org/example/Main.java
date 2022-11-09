package org.example;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        CarParkManager.writeCSVValuesIntoObjects(CarParkManager.readCSVwithCars());
        printAllCars();
    }

    public static void printAllCars()
    {
        for(int i=0;i<CarParkManager.listOfCarObjects.size();i++)
        {
            System.out.println(CarParkManager.listOfCarObjects.get(i).getName());
        }
        System.out.println("**End of list**");
    }
}
