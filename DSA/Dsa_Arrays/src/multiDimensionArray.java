public class multiDimensionArray {
    public static void main(String[] args) {

        int nums[][] = new int[3][4];

        //random values using Math class
        System.out.println("Printing arrays with random values");
        for(int i=0; i<3; i++){
            for (int j=0; j<4; j++){
               nums[i][j] = (int)(Math.random()*10);
                System.out.print(nums[i][j] + " ");
            }
        }
        //using nested for loop
        System.out.println();
        System.out.println("===========================");
        for(int i=0; i<3; i++){
            for (int j=0; j<4; j++){
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }

        //using for each loop
        System.out.println("=====================");
        for(int n[]: nums){ //n = parent array
            for(int m: n){
                System.out.print(m +" "); // m = child array which print elements
            }
            System.out.println();
        }

    }
}
