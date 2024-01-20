package polymorhism;

public class Samsung extends phone{

    public Samsung(String model) {
        super(model);
    }

    @Override
    public void features(){
        System.out.println("This is a Android Phone");
    }

}
