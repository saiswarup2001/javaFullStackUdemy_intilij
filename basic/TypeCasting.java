public class TypeCasting {
    public static void main(String[] args) {
        short x = 5;
        int y = x;
        System.out.println(x+y); //implicit typecasting

        int z = 10;
        short a = (short)z; //Explicit TypeCasting
        System.out.println(a+z);

        float v1 = 10.0f;
        double v2 = v1;
        System.out.println(v2);


        double z1 = 20.0d;
        float z2 = (float)z1;
        System.out.println(z2);
    }
}


/*
* Implicit TypeCasting: means type casting occurs by itself internally.
* eg:   short x = 5;
        int y = x;
        System.out.println(x+y);

* Explicit TypeCasting: Done by user to change datatype
* eg:   int z = 10;
        short a = (short)z; //Explicit TypeCasting
        System.out.println(a+z);
* */