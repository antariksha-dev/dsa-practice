import java.util.*;

public class LongestSubstringWithoutRepeating {

    public static void main(String[] args) {
        String s = "pwwkew";
        int result = lengthOfLongestSubstring(s);
        System.out.println("Length of Longest Substring: " + result);
    }

    public static int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int max = 0;
        String maxStr = "";
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            while(set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }
            if(right - left + 1 > max) {
                max = right-left+1;
                maxStr = s.substring(left, right+1);
            }
            set.add(ch);
            right++;
        }
        System.out.println(maxStr);
        return max;
    }
}