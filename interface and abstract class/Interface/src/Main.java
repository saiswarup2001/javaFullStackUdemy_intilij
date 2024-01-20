
interface bicycle{  //interface class was made with declaring interface keyword
    void applyBreak(int decrement);
    void speedUp(int increment);
    //the method are declared without body and body must be declared when it implements by the subclass
}

class avonCycle implements bicycle{

    public void blowHorn(int speed){
        if(speed >= 15)
        System.out.println("pee peee......");
    }
    @Override
    public void applyBreak(int decrement) {
        System.out.println("Slow Down....");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Speed Up....");
    }
}
public class Main {
    public static void main(String[] args) {
        avonCycle a = new avonCycle();
        a.applyBreak(20);
        a.blowHorn(15);
        a.speedUp(10);
    }
}
