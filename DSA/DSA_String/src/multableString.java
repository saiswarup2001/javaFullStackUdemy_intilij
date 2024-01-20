public class multableString {
    public static void main(String[] args) {
        //we can change the value after declaration also
        // StringBuffer
        StringBuffer sb = new StringBuffer("Sai");
        System.out.println("Capacity of String: "+sb.capacity());
        System.out.println("Length of String: "+sb.length());
        System.out.println("Append String: "+ sb.append(" Swarup"));
        System.out.println("Inster String: "+ sb.insert(0,"Java "));
    }
}
