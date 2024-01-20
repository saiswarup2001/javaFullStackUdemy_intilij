package inheritance.com.parent;

public class vehicle {

    private String engine;
    private String lights;
    private int fuleTank;
    private int seats;
    private int wheels;

    public vehicle() {
        this.engine = "petrol";
        this.wheels = 4;
        this.seats = 4;
        this.fuleTank = 35;
        this.lights = "LED";
    }

    public vehicle(String engine, String lights, int fuleTank, int seats, int wheels) {
        this.engine = engine;
        this.lights = lights;
        this.fuleTank = fuleTank;
        this.seats = seats;
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public String getLights() {
        return lights;
    }

    public int getFuleTank() {
        return fuleTank;
    }

    public int getSeats() {
        return seats;
    }

    public int getWheels() {
        return wheels;
    }

    public void run(){
        System.out.println("Running Vehicle");
    }
}



