package methodOverloading;

import static methodOverloading.Calculator.cal;

public class Main {
    public static void main(String[] args) {
        cal(12, 13); //int int
        cal(155, 65d); //int double
        cal(15.5f, 555.5f); // float float
        cal(10l, 20l); //long long

    }
}
