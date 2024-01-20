package basics;

public class getter_setters {
    private String driver;
    private String engine;
    private String doors;
    private int speed;

    //constructors(default)


//    public getter_setters() {
//        driver = "seated";
//        doors = "open";
//        engine = "on";
//        speed = 100;
//    }

    //parameterized Constructors
    public getter_setters(String driver, String engine, String doors, int speed) {
        this.driver = driver;
        this.engine = engine;
        this.doors = doors;
        this.speed = speed;
    }

    public String getDriver() {
        return driver;
    }

    public String getEngine() {
        return engine;
    }

    public String getDoors() {
        return doors;
    }

    public int getSpeed() {
        return speed;
    }

    public String run(){
        if(doors.equals("closed") && driver.equals("seated") && engine.equals("on") && speed > 10){
            return "Running";
        }else{
            return "Not Running";
        }
    }
}
