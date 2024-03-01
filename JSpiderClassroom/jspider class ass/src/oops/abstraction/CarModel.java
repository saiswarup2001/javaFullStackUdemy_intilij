package oops.abstraction;

public interface CarModel {
    void model();
}

interface CarPower{
    void power();
}

class Decode implements CarPower, CarModel{

    @Override
    public void model() {
        System.out.println("Lambo Gt");
    }

    @Override
    public void power() {
        System.out.println("Horse Power 1000 rpm");
    }
}

class Main{
    public static void main(String[] args) {
        Decode d = new Decode();
        d.model();
        d.power();
    }
}