package com.pluralsight;

public class UserInterface {

    private String dealership;

    public UserInterface(String dealership) {
        this.dealership = dealership;
    }

    public String getDealership() {
        return dealership;
    }

    public void setDealership(String dealership) {
        this.dealership = dealership;
    }

    public static void display(){
        // this is where we will have the menue loop
        // starting out by creating a welcome print statement
        System.out.println("Hello and welcome to the Dealership De tour! How can i help you?");
        //creating a is running statement and setting it to true
        boolean isRunning = true;
        while (isRunning){
            System.out.println("""
                    What would you like to do?
                    - (1)
                    - (2)
                    - (3) 
                    - (4) Exit Application""");
        }

    }


    public static void processGetByPriceRequest(){

    }
    public static void processGetByMakeModelRequest(){

    }
    public static void processGetByYearRequest(){

    }
    public static void processGetByColorRequest(){

    }
    public static void processGetByMileageRequest(){

    }
    public static void processGetByVehicleTypeRequest(){

    }
    public static void processGetAllVehicleRequest(){

    }
    public static void processAddVehicleRequest(){

    }
    public static void processRemoveVehicleRequest(){

    }

}
