package org.sai.phone;

public class Main {
    public static void main(String[] args) {

        phone phone = new IPhone8();
        System.out.println("Processor: "+ phone.processor());
        System.out.println("OS: "+ phone.OS());
        System.out.println("Space: "+ phone.spaceInGb() +"GB");
    }
}