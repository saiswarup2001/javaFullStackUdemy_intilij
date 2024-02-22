package Constructor;

class MarkerTest {
    MarkerTest(){
        System.out.println("Marker Constructor..");
        System.out.println("Hello!!!!");
    }
}
class Marker{
    public static void main(String[] args) {
        MarkerTest m1 = new MarkerTest();
        System.out.println("+++++++++++++++++");
        MarkerTest m2 = new MarkerTest();
    }
}


