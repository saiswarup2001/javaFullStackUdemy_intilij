package polymorhism;

public class Hello {
    public static void main(String[] args) {

        //pojo method - plain old java objects
//        phone iphone = new phone("iPhone 14");
//        System.out.println(iphone.getModel());
//        iphone.features();
//
//        SamsungNote8 note8 = new SamsungNote8("Note 8");
//        System.out.println(note8.getModel());
//        note8.features();
        //phone - parent class
        //SamsungNote8 - child class
        phone note8 = new Hello().phone(2);
        System.out.println(note8.getModel());
        note8.features();

        phone nokia3310 = new Hello().phone(1);
        System.out.println(nokia3310.getModel());
        nokia3310.features(); //due to polymorphism
    }

    public phone phone(int dailyDriver){
        switch(dailyDriver){
            case 1: return new nokia("Nokia 3310");
            case 2: return new Samsung("Note 5");
        }
        return null;
    }
}
