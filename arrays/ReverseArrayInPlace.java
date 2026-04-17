import java.util.*;
public class ReverseArrayInPlace {

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};

        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int temp;
        while(left <= right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}