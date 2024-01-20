package inheritance.com.childs;

import inheritance.com.parent.vehicle;

 public class car extends vehicle {

     private String steering;
     private String musicSystem;
     private String airConditioner;
     private String fridge;
     private String entertainmentSystem;

     //Default constructor
     public car(String steering, String musicSystem, String airConditioner, String fridge, String entertainmentSystem) {
         super();
         this.steering = "Power";
         this.musicSystem = "Android";
         this.airConditioner = "AC";
         this.fridge = "LC";
         this.entertainmentSystem = "LED";
     }

     //parameterized constructor
     public car(String engine, String lights, int fuleTank, int seats, int wheels, String steering, String musicSystem, String airConditioner, String fridge, String entertainmentSystem) {
         super(engine, lights, fuleTank, seats, wheels);
         this.steering = steering;
         this.musicSystem = musicSystem;
         this.airConditioner = airConditioner;
         this.fridge = fridge;
         this.entertainmentSystem = entertainmentSystem;
     }

     public String getSteering() {
         return steering;
     }

     public String getMusicSystem() {
         return musicSystem;
     }

     public String getAirConditioner() {
         return airConditioner;
     }

     public String getFridge() {
         return fridge;
     }

     public String getEntertainmentSystem() {
         return entertainmentSystem;
     }

     @Override
     public String toString() {
         return  "engine =" + getEngine() + "\n" + "light = " + getLights() + "\n" + "fuelTank = " + getFuleTank() + "\n" + "Seats = " + getSeats() + "\n" +
                 "Wheels = " + getWheels() + "\n" + "steering= " + steering + "\n" + "musicSystem= " + musicSystem + "\n" +
                 "airConditioner= " + airConditioner + "\n" + "fridge= " + fridge + "\n" + "entertainmentSystem= " + entertainmentSystem + "\n";
     }

     @Override
     public void run() {
         System.out.println("Running Car");
         System.out.println(toString());
     }
 }
