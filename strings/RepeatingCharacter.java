import java.util.*;

public class RepeatingCharacter {

    public static void main(String[] args) {
        String s = "geeksforgeeks";

        int result = firstRepeatingIndex(s);
        System.out.println(result);
    }

    public static int firstRepeatingIndex(String s) {
        int freq[] = new int[256];
        for(int i=0; i<s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        for(int i=0; i<s.length(); i++) {
            if(freq[s.charAt(i)] > 1) {
                return i;
            }
        }
        return -1;
    }

    public static int firstRepeatingIndex1(String s) {
        for(int i=0; i<s.length(); i++) {
            for(int j=i+1; j<s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    return i;
                }
            }
        }
        return -1;
    }
}