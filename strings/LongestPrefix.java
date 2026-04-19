class LongestPrefix {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "fly"};
        String longest = longestPrefix(str);
        System.out.println(longest);
    }

    public static String longestPrefix(String[] str) {
        String longest = str[0];
        for(int i=1; i<str.length; i++) {
            while(str[i].indexOf(longest) != 0) {
                longest = longest.substring(0, longest.length()-1);
                if(longest.isEmpty()) {
                    return "";
                }
            }
        }
        return longest;
    }
}