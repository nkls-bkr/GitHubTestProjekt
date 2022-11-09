package org.example;

import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.opencsv.CSVReader;
public class CarParkManager
{
    static ArrayList<Car> listOfCarObjects = new ArrayList<Car>();

    public static List<String[]> readCSVwithCars()
    {
        List<String[]> listOfCarsWithValues;
        try
        {
            CSVReader reader = new CSVReader(new FileReader("src/main/resources/exampleCSV.csv"));

            listOfCarsWithValues = reader.readAll();
            return listOfCarsWithValues;
        }

        catch (Exception e)
        {
            System.out.println(e);
            return null;
        }

    }

    public static ArrayList<Car> writeCSVValuesIntoObjects(List<String[]> listOfCarsWithValues)
    {
        int lineIterator = 0;
        int valueIterator = 0;

        for(lineIterator=0;lineIterator < listOfCarsWithValues.size(); lineIterator++){
            String serialNumber = listOfCarsWithValues.get(lineIterator)[valueIterator];
            valueIterator++;

            String name = listOfCarsWithValues.get(lineIterator)[valueIterator];
            valueIterator++;

            String carColor = listOfCarsWithValues.get(lineIterator)[valueIterator];
            valueIterator++;

            double price = Double.valueOf(listOfCarsWithValues.get(lineIterator)[valueIterator]);

            listOfCarObjects.add(new Car(serialNumber, name, carColor, price));

            valueIterator = 0;
        }
        return listOfCarObjects;
    }
}

