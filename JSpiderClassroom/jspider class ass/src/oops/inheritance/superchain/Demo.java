package oops.inheritance.superchain;

class DemoClass {
    int age;
    String name;

    // Parameterized constructor
    public DemoClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Method to display data
    void data() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class DemoRun extends DemoClass {
    int cls;

    // Parameterized constructor
    public DemoRun(int age, String name, int cls) {
        super(age, name);
        this.cls = cls;
    }

    // Override data() method to include class information
    @Override
    void data() {
        super.data(); // Call the superclass method
        System.out.println("Class: " + cls);
    }
}

public class Demo {
    public static void main(String[] args) {
        // Use DemoRun reference instead of DemoClass
        DemoRun dc = new DemoRun(12, "sai", 2);
        dc.data(); // This will correctly call the overridden method
    }
}
