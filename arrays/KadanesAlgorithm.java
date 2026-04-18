import java.util.*;

public class KadanesAlgorithm {

    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int result = maxSubarraySum(arr);
        System.out.println("Maximum Subarray Sum: " + result);
    }

    // before kadanes
    public static int maxSubarraySum1(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            int currSum = 0;
            for(int j=i+1; j<arr.length; j++) {
                currSum += arr[j];
                sum = Math.max(sum, currSum);
            }
        }
        return sum;
    }


    public static int maxSubarraySum(int[] arr) {
        int max, currMax;
        max = currMax = 0;
        for(int i=0; i<arr.length; i++) {
            currMax += arr[i];
            currMax = Math.max(arr[i], currMax);
            max = Math.max(currMax, max);
        }
        return max;
    }
}