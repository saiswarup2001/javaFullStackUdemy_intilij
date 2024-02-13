package Constructor.constChaning;


class Demo{

    Demo(){
        this(10);
        System.out.println("This is no arg const...");
    }

    Demo(int i){
        System.out.println("This is argument const...");
    }
}
public class DemoTest {
    public static void main(String[] args) {
        Demo d = new Demo();

    }
}
