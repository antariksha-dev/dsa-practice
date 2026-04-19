import java.util.*;

// Recheck the soln.
public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5};
        int result = findMissing(arr);
        System.out.println("Missing Number: " + result);
    }

      public static int findMissing(int[] arr) {
        int n = arr.length + 1;
        int actualSum = 0;
        int expectedSum = 0;

        for(int num: arr) {
            actualSum += num;
        }
        expectedSum = n * (n + 1) / 2;
        return expectedSum - actualSum;
    }
}