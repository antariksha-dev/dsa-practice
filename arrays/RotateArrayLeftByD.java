import java.util.*;

public class RotateArrayLeftByD {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        rotateLeft(arr, d);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }

    public static void reverse(int arr[], int left, int right) {
        while(left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}