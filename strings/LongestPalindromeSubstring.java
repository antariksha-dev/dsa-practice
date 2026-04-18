class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String str = "babad";
        String longest = longestSubstring(str);
        System.out.println(longest);
    }

    // O(n)
    public static String longestSubstringOptimized(String str) {
        int left;
        int right;
        int n = str.length();
        int max = 0;
        String maxStr = "";
        // even length
        for(int i=0; i<n; i++) {
            left = i;
            right = i;
            while(left >= 0 && right < n && str.charAt(left) == str.charAt(right)) {
                if(right - left + 1 > max) {
                    max = right - left + 1;
                    maxStr = str.substring(left, right+1);
                }
                left--;
                right++;
            }
        }
        // odd length
        for(int i=0; i<n; i++) {
            left = i;
            right = i + 1;
            while(left >= 0 && right < n && str.charAt(left) == str.charAt(right)) {
                if(right - left + 1 > max) {
                    max = right - left + 1;
                    maxStr = str.substring(left, right+1);
                }
                left--;
                right++;
            }
        }
        return maxStr;
    }

    // O(n^3)
    public static String longestSubstring(String str) {
        int max = 0;
        String maxStr = "";
        String sub = "";
        int len = 0;
        int n = str.length();
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                sub = str.substring(i, j);
                len = sub.length();
                if(len > max && isPalindrome(sub)) {
                    max = len;
                    maxStr = sub;
                }
            }
        }
        return maxStr;
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while(left <= right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}