package methods.questions;
/*
Design a method which can accepts data in meters and print its results in kilometer.
 */
public class meterToKm {
    public static void main(String[] args) {
        meterToKilometer(10000);
        meterToKilometer(1000);
    }
    public static void meterToKilometer(int meter){
        double kilo = (double) meter/1000;
        System.out.println(kilo);
    }
}
