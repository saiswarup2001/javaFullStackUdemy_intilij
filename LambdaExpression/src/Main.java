@FunctionalInterface
interface  Lambda{
    public void show();
}

public class Main {
    public static void main(String[] args) {
        //solution 1
//        Lambda lambda = new Lambda() {
//            @Override
//            public void show() {
//                System.out.println("Lambda show method override....");
//            }
//        };

        //solution 2
        Lambda lambda = () ->{
            System.out.println("Statement using Lambda Expression....");
        };
        lambda.show();
    }
}