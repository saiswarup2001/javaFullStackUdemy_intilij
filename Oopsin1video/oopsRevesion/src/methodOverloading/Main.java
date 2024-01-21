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

/*
Method Overloading
--> In the same class, we can define 2 or more method with same name but the arguments and return types must be different.

Rules:
-> Arguments must be different
-> number of arguments is different

*/