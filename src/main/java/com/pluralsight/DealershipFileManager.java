package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class DealershipFileManager {

    public static void getDealership(){
        // creating the buffer reader statement
        try{
            BufferedReader bufreader = new BufferedReader(new FileReader("transaction.csv"));

            bufreader.readLine();

            // using readVehicle as a placeholder variable untill I find a better name for it
            String readVehicle = bufreader.readLine();
            while((readVehicle = bufreader.readLine()) != null){
                // creating a variable to store the info after splitting it
                String[] vehicleSplit = readVehicle.split("\\|");
                //i might write this wrong but going to try it anyways
                // im not sure if i can call on an arraylist from a different class but we will find out soon lol
                Vehicle vehicleL = new Vehicle();
                // this will add to the vehicleinventory.csv file
                Vehicle.add(vehicleL);
            }
        } catch (Exception e) {
            // this is the catch of the try/catch in the buffer reader
            // this will automatically exit the program if there is an error in the code
            // i dont know what throw new runtime exception is but need to ask for it later
            System.out.println("Sorry trouble loading information. Please try again.");
            system.exit(0);
            throw new RuntimeException(e);
        }
    }
    public static void saveDealership(Dealership){

    }

}
