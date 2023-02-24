package vehicle;


import java.util.Random;

public class Car {


    // Variables
    //-----------------------------------------------------------
    private static int inquiryCounter = 2000;

    private static final String CAR_FACTORY_ID = "Norwood";

    private String name;

    private String quoteID;

    private String color;

    private String factory;

    private int numberOfDoors;

    private double price;

    private int mileage;

    public String doYouLikeIt;
    //-----------------------------------------------------------


    // Constructors
    //-----------------------------------------------------------
    public Car(){
        Random rndGen = new Random();
        price = rndGen.nextInt(45000-35000+1)+35000;
        name = "specific name";
        quoteID = "VIN-" + CAR_FACTORY_ID + "-" + inquiryCounter;
        inquiryCounter++;
        factory = CAR_FACTORY_ID;
        numberOfDoors = 2;
        color = "specific color";
        mileage = 0;
        doYouLikeIt = "yes";
    }

    public Car(String name, String color, int numberOfDoors){
        this();
        this.name = name;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
    }

    public Car(String name, String color, int numberOfDoors, double price, int mileage){
        this(name, color, numberOfDoors);
        this.price = price;
        this.mileage = mileage;
    }
    //-----------------------------------------------------------


    // Getters and Setters
    //------------------------------------------------------------
    public static int getInquiryCounter(){
        return inquiryCounter;
    }

    public static void setVehicleCounter(int vehicleCounter){
        Car.inquiryCounter = vehicleCounter;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getQuoteID(){
        return quoteID;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getFactory(){
        return factory;
    }

    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }

    public double getPrice(){
        return price;
    }
    //-----------------------------------------------------------


    // Utility Methods
    //--------------------------------------------------------------
    public static void classDisplayInfo(){
        System.out.println("----------------------------------");
        System.out.println("Car Class Info");
        System.out.println("----------------------------------");
        System.out.println("inquiryCounter: \t\t" + inquiryCounter);
        System.out.println("CAR_FACTORY_ID: \t\t" + CAR_FACTORY_ID);
    }

    public void displayInfo(){
        System.out.println("----------------------------------");
        System.out.println("Car Info");
        System.out.println("----------------------------------");
        System.out.println("Name: \t\t\t\t\t" + name);
        System.out.println("QuoteID: \t\t\t\t"+ quoteID);
        System.out.println("Factory: \t\t\t\t" + CAR_FACTORY_ID);
        System.out.println("Number of Doors: \t\t" + numberOfDoors);
        System.out.println("Color: \t\t\t\t\t" + color);
        System.out.println("Mileage: \t\t\t\t" + mileage);
        System.out.printf("Price: \t\t\t\t\t$%.2f \n", price);
        System.out.println("Do you like it: \t\t" + doYouLikeIt);
    }
    //-----------------------------------------------------------

}
