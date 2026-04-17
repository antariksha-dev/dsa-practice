import java.util.*;
public class MaxAndSecondMaxInArray {

    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 9, 1, 4};
        int[] result = findMaxAndSecondMax(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findMaxAndSecondMax(int[] arr) {
        int max, secondMax;
        max = secondMax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if(arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        return new int[] {max, secondMax};
    }
}