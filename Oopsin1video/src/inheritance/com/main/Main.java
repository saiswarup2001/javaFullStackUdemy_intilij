package inheritance.com.main;

import inheritance.com.childs.bike;
import inheritance.com.childs.car;
import inheritance.com.childs.truck;



public class Main {
    public static void main(String[] args) {
        System.out.println("========================bike features=========================");
        bike bi = new bike("Long","Diesel","LED",40,1,2);
        //using to string method
       // System.out.println(bi);

        //override method
        bi.run(); //using override method

        //using constructor and getter setter method
//        System.out.println("Handel type: "+ bi.getHandel());
//        System.out.println("Engine Type: "+ bi.getEngine());
//        System.out.println("HeadLamp Type: "+ bi.getLights());
//        System.out.println("FuleTank Capacity: "+ bi.getFuleTank());
//        System.out.println("Number of seats: "+ bi.getSeats());
//        System.out.println("Number of Wheels: "+ bi.getWheels());


        System.out.println();
        System.out.println("------------------------------car Features ----------------------------");
        car c = new car("Diesel","BS-4 LED'S ",60,6,4,"Power","Android","AC","Small","LCD");
        //toString()
        //System.out.println(c);

        //override method
        c.run();

        //using constructor and getter setter method
//        System.out.println("Steering type: "+ c.getSteering());
//        System.out.println("Engine Type: "+ c.getEngine());
//        System.out.println("HeadLamp Type: "+ c.getLights());
//        System.out.println("FuleTank Capacity: "+ c.getFuleTank());
//        System.out.println("Number of seats: "+ c.getSeats());
//        System.out.println("Number of Wheels: "+ c.getWheels());
//        System.out.println("Entertainment System: "+c.getEntertainmentSystem());
//        System.out.println("Music System: "+c.getMusicSystem());
//        System.out.println("Air Conditioner: "+ c.getAirConditioner());
//        System.out.println("Fridge Type: "+c.getFridge());


        System.out.println();
        System.out.println("=======================Truck Features==============================");
        truck t = new truck("Petrol", "Fogg lights", 80, 2, 6, "Power Steering","Dollby ","Normal Ac", 15);
        //toString()
        //System.out.println(t);

        //override method
        t.run();

        //using constructor and getter setter method
//        System.out.println("Steering type: "+ t.getSteering());
//        System.out.println("Engine Type: "+ t.getEngine());
//        System.out.println("HeadLamp Type: "+ t.getLights());
//        System.out.println("FuleTank Capacity: "+ t.getFuleTank());
//        System.out.println("Number of seats: "+ t.getSeats());
//        System.out.println("Number of Wheels: "+  t.getWheels());
//        System.out.println("Music System: "+    t.getMusicSystem());
//        System.out.println("Air Conditioner: "+ t.getAirConditioner());
//        System.out.println("Container type: "+t.getContainer());
    }
}
