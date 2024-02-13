package Constructor.taskParameterizedConstructor;

class Movie{
    String name;
    int price;

    Movie(int price, String name){
        this.price = price;
        this.name = name;
    }

    void show(){
        System.out.println("Movie name: "+ name);
        System.out.println("Price: "+ price);
    }
}
public class Movies {
    public static void main(String[] args) {
        Movie m1 = new Movie(200, "Fighter");
        Movie m2 = new Movie(150, "12th Fail");
        m1.show();
        m2.show();
    }
}
