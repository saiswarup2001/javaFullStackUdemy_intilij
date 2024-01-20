import java.math.BigDecimal;

public class primitiveDataType {
    public static void main(String[] args) {

        /*
        int max = 2147483647;
        int min = -2147483648;
        Short shortMax = 32767;
        Short shortMin = -32768;
        long longMax = 9223372036854775807L;
        long longMin = -9223372036854775808L;
        byte byteMax = 127;
        byte byteMin = -128;
         */

        double x = 1.05;
        double y = 2.55;
        //bigDecimal provides us ultra precision as compared to double.
        //for Eg:
        BigDecimal d1 = new BigDecimal("1.05");
        BigDecimal d2 = new BigDecimal("2.55");
        System.out.println(x+y);
        System.out.println(d1.add(d2));
    }
}


/*NOTES-->
* BigDecimal d1 = new BigDecimal(1.05);
  BigDecimal d2 = new BigDecimal(2.55);
  System.out.println(d1.add(d2));  op:3.5999999999999998667732370449812151491641998291015625
* It creates more complication so as to reduce it we can use string variable as the input decleration.
* eg:
*   BigDecimal d1 = new BigDecimal("1.05");
    BigDecimal d2 = new BigDecimal("2.55");
    System.out.println(d1.add(d2));  op: 3.60
* */