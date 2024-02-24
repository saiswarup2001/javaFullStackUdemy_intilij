public class Main {
    public static void main(String[] args) {
        GenericClassAsIntDoubleString<Integer> i = new GenericClassAsIntDoubleString<>(23);
        int t = i.getEnterEle();
        System.out.println(t);

        //String
        GenericClassAsIntDoubleString<String> str = new GenericClassAsIntDoubleString<>("Sai");
        System.out.println(str.getEnterEle());

        //Double
        GenericClassAsIntDoubleString<Double> Dbl = new GenericClassAsIntDoubleString<>(15.5);
        System.out.println(Dbl.getEnterEle());
    }
}