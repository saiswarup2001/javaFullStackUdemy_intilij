import java.util.Scanner;

public class NumberOfEmployeeMetTarget {
    public static void main(String[] args) {
        int []hours = {1,2,3,4};
        int target;
        int emp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target: ");
        target = sc.nextInt();
        int len = hours.length;


        System.out.println("target met:");
//        for(int i=0; i<len;i++){
//            if (hours[i] >= target){
//                emp++;
//            }
//        }
        for (int i : hours) {
            if (i >= target) {
                emp++;
            }
        }
        System.out.println(emp);
    }
}
