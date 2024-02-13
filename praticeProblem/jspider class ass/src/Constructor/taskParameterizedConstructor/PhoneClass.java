package Constructor.taskParameterizedConstructor;


class PhoneData{
    int ram;
    int rom;
    String brand;

    PhoneData(int ram, int rom, String brand){
        this.ram = ram;
        this.rom = rom;
        this.brand = brand;
    }

    void display(){
        System.out.println("Ram: "+ ram+ "GB"+", Rom: "+ rom + "GB"+", Brand: "+ brand);
    }
}
public class PhoneClass {
    public static void main(String[] args) {

        PhoneData p1 = new PhoneData(6,256, "OnePlus");
        PhoneData p2 = new PhoneData(8,64, "Redmi 11 pro");
        p1.display();
        p2.display();
    }
}
