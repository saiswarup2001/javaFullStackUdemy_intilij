public class usingThread {
    public static void main(String[] args) {

        new Thread(() -> {
            System.out.println("Inside Thread");
            System.out.println("hi One more time...");
        }).start();
    }
}
