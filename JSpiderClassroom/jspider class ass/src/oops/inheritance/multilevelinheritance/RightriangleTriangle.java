package oops.inheritance.multilevelinheritance;

public class RightriangleTriangle extends Triangle{
    public RightriangleTriangle(double base, double height) {
        super(base, height);
    }

    @Override
    void AreaCal() {
        super.AreaCal();
        //System.out.println((base*height)/2);
    }
}
