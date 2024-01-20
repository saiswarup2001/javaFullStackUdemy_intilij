//public class LongestSubstringWithoutRepeatingCharacters {
//    public static void main(String[] args) {
//        String str = new String("abcabcbb");
//        String substr = str.substring(3);
//        char []cstr = str.toCharArray();
//        char []csubStr = substr.toCharArray();
//        System.out.println(cstr);
//        System.out.println(csubStr);
//    }
//}


import java.util.Arrays;
class LongestSubstringWithoutRepeatingCharacters  {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        System.out.println("length is: "+ n);
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (checkRepetition(s, i, j)) {
                    res = Math.max(res, j - i + 1);
                    System.out.println("res: "+res);
                }
            }
        }

        return res;
    }

    private boolean checkRepetition(String s, int start, int end) {
        int[] chars = new int[128];

        for (int i = start; i <= end; i++) {
            char c = s.charAt(i);
            System.out.println("i: "+ i + "\n"+"char c: "+ c);
            chars[c]++;
            //System.out.println("char c ++: "+ Arrays.toString(chars));
            if (chars[c] > 1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        // Your code goes here
        LongestSubstringWithoutRepeatingCharacters  ob = new LongestSubstringWithoutRepeatingCharacters ();
        String s = "abab";
        System.out.println(ob.lengthOfLongestSubstring(s));
    }
}