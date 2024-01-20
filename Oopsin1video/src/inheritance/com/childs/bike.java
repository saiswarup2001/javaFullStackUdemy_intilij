package inheritance.com.childs;

import inheritance.com.parent.vehicle;

public class bike extends vehicle {
    private String handel;

    public bike() {
        super();
        this.handel = "short";
    }

    public bike(String handel,String engine, String lights, int fuleTank, int seats, int wheels) {
        super(engine, lights, fuleTank, seats, wheels);
        this.handel = handel;
    }

    public String getHandel() {
        return handel;
    }

    @Override
    public String toString() {
        return  "handel =" + handel + "\n"  + "engine =" + getEngine() + "\n" + "light = " + getLights() + "\n" + "fuelTank = " + getFuleTank() + "\n" + "Seats = " + getSeats() + "\n" +
                "Wheels = " + getSeats() + "\n" ;
    }

    @Override
    public void run() {
        System.out.println("Running Bike");
        System.out.println(toString());
    }
}
