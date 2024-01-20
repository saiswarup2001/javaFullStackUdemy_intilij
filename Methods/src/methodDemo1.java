public class methodDemo1 {
    public static void main(String[] args) {
        loop(1, 10);
        System.out.println("-------------");
        loop(10, 20);
        System.out.println("-------------");
        loop(20, 30);
    }
    public static void loop(int steps, int final_Value){
        while(steps <=  final_Value){
            System.out.println(steps);
            steps++;
        }
    }
}

