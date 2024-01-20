public class arrayWithForEachLoop {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6,7,8,9,10};
        String[] arr = {"Chand", "Sai", "Mia", "Jhon"};

        for(int i=0; i<4; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("===========================");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("========================");
        for(String s : arr) {
            System.out.print(s + " ");
        }

        System.out.println();
        System.out.println("=======Array======");
        for(int i: ar){
            System.out.print(i + " ");
        }


        //max mark using for each loop
        System.out.println();
        System.out.println("======Max Ele Find======");
        int a[] = {11, 90,25,88,10,95};
        int maxMarks = maximum(a);
        System.out.println("maxMarks is = "+ maxMarks);

    }
    public static int maximum(int a[]){
        int max = a[0];

        for(int i : a){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
}
