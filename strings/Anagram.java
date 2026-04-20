import java.util.*;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

        boolean result = isAnagram(s1, s2);
        System.out.println(result);
    }

    public static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        int freq[] = new int[26];
        for(int i=0; i<s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        for(int n: freq) {
            if(n != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram1(String s1, String s2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(char ch: s1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for(char ch: s2.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }
        return map1.equals(map2);
    }
}