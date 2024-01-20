package TightLoose_Coupling;

/*  Suppose there is a traveller ----> choice ---> banglore
* in first case it choose car as a choice to travel banglore
* in second case it choose bike as a choice to travel banglore
* in third case it choose Bus as a choice to travel banglore
* in fourth case it choose Flight as a choice to travel banglore */

// ================================================== loosly- coupled =============================================================

interface Vehicle{
    public void start();
}



// ================================================== tightly- coupled =============================================================
//dependency object - no:1
class car implements Vehicle{
    public void start(){
        System.out.println("Travel with car to Banglore..");
    }
}

//dependency object - no:2
class bike implements Vehicle{
    public void start(){
        System.out.println("Travel with bike to Banglore..");
    }
}
public class Traveller {

    // ================================================== tightly- coupled =============================================================

   // static car c = new car(); //hardcoding (or) creating object to call that car class

    //this time e doesn't want to go with car rather than bike.

   // static  bike b = new bike();
    // so here what happen the traveller totally depend upon the car and bike, bus, flight class to move forward. and we have to hardcode it again and again


//    public static void main(String[] args) {
//        b.start();
//    }
    // ================================================== tightly- coupled =============================================================
    static Vehicle v; //loosely coded 
    
    //setter method for vehicle
    public void setVehicle(Vehicle v){
        this.v = v;
    }
    public static void main(String[] args) {
        Traveller t = new Traveller();
        t.setVehicle(new car()); //going with car
        v.start();
        t.setVehicle(new bike()); //going with bike
        v.start();

    }
}
// ================================================== Loosely- coupled =============================================================