import java.sql.SQLOutput;
import java.util.Scanner;

//Print the average of three numbers entered by user by creating a class named 'Average'having a method to calculate and print the average
public class AverageCalculation{
    private int x, y, z;
    AverageCalculation(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int AverageCalculation(){
        int avg = (this.x+this.y+this.z)/3;
        return (avg);
    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 number to find the average: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        AverageCalculation Avg = new AverageCalculation(a,b,c);
        System.out.println("Average is: "+ Avg.AverageCalculation());
    }
}

