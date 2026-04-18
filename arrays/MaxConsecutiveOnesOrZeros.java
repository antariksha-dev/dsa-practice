import java.util.*;

public class MaxConsecutiveOnesOrZeros {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 1, 1};

        int result = maxConsecutive(arr);

        System.out.println("Maximum consecutive 0's or 1's: " + result);
    }

    public static int maxConsecutive(int[] arr) {
        if (arr.length == 0) return 0;
        int i=0;
        int n=arr.length;
        int count = 0;
        int max = 0;
        while(i+1<n) {
            if(arr[i] == arr[i + 1]) {
                count++;
            } else {
                count = 0;
            }
            max = Math.max(max, count);
            i++;
        }
        return max + 1;
    }
}