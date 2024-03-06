package ExceptionClass;

public class ExceptionCls {
    public static void main(String[] args) {
        try{
            int[] a = {10, 20, 30};
            for (int i = 0; i <= a.length; i++) {
//                int element = a[i]; // Index Out of Bounds Exception
//                System.out.println(element);
                System.out.print(a[i]+" ");
            }
        }catch(Exception e){
//            System.out.println(e);
            e.printStackTrace();
        }
    }
}
