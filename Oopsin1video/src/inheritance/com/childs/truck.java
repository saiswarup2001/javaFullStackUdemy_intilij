package inheritance.com.childs;

import inheritance.com.parent.vehicle;

public class truck extends vehicle {
    private String steering;
    private String musicSystem;
    private String airConditioner;
    private  int container;

    public truck(String steering, String musicSystem, String airConditioner, int container) {
        super();
        this.steering = "steering";
        this.musicSystem = "musicSystem";
        this.airConditioner = "airConditioner";
        this.container = 10;
    }

    public truck(String engine, String lights, int fuleTank, int seats, int wheels, String steering, String musicSystem, String airConditioner, int container) {
        super(engine, lights, fuleTank, seats, wheels);
        this.steering = steering;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.container = container;
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

    public int getContainer() {
        return container;
    }

    @Override
    public String toString() {
        return "engine =" + getEngine() + "\n" + "light = " + getLights() + "\n" + "fuelTank = " + getFuleTank() + "\n" + "Seats = " + getSeats() + "\n" +
                "Wheels = " + getSeats() + "\n" +
                "steering= " + steering  + "\n" +
                "musicSystem= " + musicSystem  + "\n" +
                "airConditioner= " + airConditioner  + "\n" +
                "container= " + container
                ;
    }

    @Override
    public void run() {
        System.out.println("Running Truck");
        System.out.println(toString());
    }
}
