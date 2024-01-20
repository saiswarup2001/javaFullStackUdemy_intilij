package enumClass;

public class demo {
    public static void main(String[] args) {
        Learning learn = Learning.COREJAVA;

        switch(learn){

            case COLLECTIONS -> {
                System.out.println("step 2: Learning collection Framework");
            }
            case COREJAVA -> {
                System.out.println("step 1: Learning Core Java");
            }
            case GENERICS -> {
                System.out.println("step 3: Learning Generics");
            }
            case JSPANDSERVLETS -> {
                System.out.println("step 1: Learning JSP and Servlets");
            }
            case MULTITHREADING -> {
                System.out.println("step 1: Learning Multithreading");
            }
            default -> System.out.println("wrong choice.....");
        }
    }
}
