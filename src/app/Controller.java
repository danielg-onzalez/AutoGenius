package app;

import vehicle.Car;

public class Controller {


    //-------------------------------------------------------------------
    public static void main(String[] args) {

        Car c1 = new Car("Randall","Yellow",3,23000,15000);
        c1.displayInfo();

        System.out.println();
        Car.classDisplayInfo();

        Car c2 = new Car("Nicole","White", 4,40000,10000);
        c2.displayInfo();
        System.out.println();

        Car c3 = new Car("Luis","Black",2,15000,40000);
        c3.displayInfo();
        System.out.println();

        Car c4 = new Car("Anita","Blue",4,25500, 20000);
        c4.displayInfo();

        System.out.println();
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("Modifying certain details based on user's input");
        System.out.println("----------------------------------");

        c4.setColor("Green");
        c4.setNumberOfDoors(2);
        c4.displayInfo();

        System.out.println();
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("Modifying certain details based on user's input");
        System.out.println("----------------------------------");
        System.out.println();

        c2.setColor("Purple");
        c2.displayInfo();
        c2.setNumberOfDoors(2);
        c2.setColor("White");
        c2.displayInfo();

        System.out.println();
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("Clarifying the car's details to the user");
        System.out.println("----------------------------------");
        System.out.println();


        System.out.printf("%s has chosen the color: \t\t\t\t\t\t\t\t\t %s \n",c1.getName(), c1.getColor());
        System.out.println();

        System.out.printf("The Quote ID of %s's car selection: \t\t\t\t\t\t %s \n", c2.getName(), c2.getQuoteID());
        System.out.println();

        System.out.printf("The amount of money that %s is willing to pay: \t\t\t\t %.2f \n",c2.getName(), c2.getPrice());
        System.out.println();

        System.out.printf("%s's latest color input is linked to the following Quote ID:\t %s \n", c4.getName(), c4.getQuoteID());
    }
    //-------------------------------------------------------------------


} // end Controller
