package Objects;

public class Mainmethod {
    public static void main(String[] args) {
        Books b1 = new Books();
        b1.title="titanic";
        b1.price=120;
        b1.details();

        Books b2 = new Books();
        b2.price =300;
        b2.title = "Harry Poter";
        b2.details();

        Books b3 = new Books();
        b3.price=250;
        b3.title="Bhagavad Gita ";
        b3.details();

    }
}
