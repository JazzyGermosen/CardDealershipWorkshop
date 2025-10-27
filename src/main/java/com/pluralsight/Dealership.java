package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    // instantiating the objects for the dealership class (name, address, and phone)
    private String name;
    private String address;
    private String phone;

    // instantiating the arraylist
    public static ArrayList<Vehicle> vehicleL = new ArrayList<>();

    // generated the constructor method for each of the objects
    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    // generated both getter and setter methods for each of the objects
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // greating a method that will search for the information by the various types of vehicle information
    public static void getVehiclesByPrice(){

    }
    public static void getVehiclesByMakeModel(){

    }
    public static void getVehiclesByYear(){

    }
    public static void getVehiclesByColor(){

    }
    public static void getVehiclesByMileage(){

    }
    public static void getVehicleByType(){

    }
    public static void getAllVehicles(){

    }
    public static void addVehicle(){

    }
    public static void removeVehicle(){

    }
}
