public class ImmutableString {
    public static void main(String[] args) {
        // immutable means if the variable is declared we cannot change
        // its value
        String name = "sai"; // in stack constant with a address
                            // suppose sai --> 101
        name = name + " swarup"; // here it create a new spcae in memory
                                // for sai swarup --> 102
        System.out.println(name); // name --> 102

        String s1 = "Dog"; // s1 --> Dog <--- s2
        String s2 = "Dog";
        System.out.println(s1 == s2); // true
    }
}
