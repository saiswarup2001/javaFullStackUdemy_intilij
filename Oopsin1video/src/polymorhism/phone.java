package polymorhism;

public class phone {

    private  String model;

    public phone(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void features(){
        System.out.println("This is a Feature Phone");
    }
}
