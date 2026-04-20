import java.util.*;

public class SubsequenceCheck {

    public static void main(String[] args) {
        String s1 = "gksrek";
        String s2 = "geeksforgeeks";

        boolean result = isSubsequence(s1, s2);
        System.out.println(result);
    }

    public static boolean isSubsequence(String sub, String str) {
        int j,i;
        j = i = 0;
        int sublength = sub.length();
        int strlength = str.length();
        for(i=0; i<strlength && j<sublength; i++) {
            char ch1 = str.charAt(i);
            char ch2 = sub.charAt(j);
            if(ch1 == ch2) {
                j++;
            }
        }
        return j==sublength;
    }
}