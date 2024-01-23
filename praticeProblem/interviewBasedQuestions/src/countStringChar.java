public class countStringChar {
    public static void main(String[] args) {

        String x = "The Kiran Academy";
        int count = 0;
        for(int i=0; i<x.length(); i++){
            //if(x.charAt(i) != ' ')
            count++;
        }
        System.out.println("Count: "+ count);
    }
}
