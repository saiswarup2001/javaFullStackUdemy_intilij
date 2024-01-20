package encapsulation;

public class Hello {
    public static void main(String[] args) {

        person puja = new person("Puja", 25, "Female");
        System.out.println(puja);
        puja.setAge(15);
        System.out.println(puja);
    }
}
