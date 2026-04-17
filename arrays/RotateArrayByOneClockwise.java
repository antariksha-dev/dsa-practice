import java.util.*;

public class RotateArrayByOneClockwise {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateByOne(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateByOne(int[] arr) {
        int lastElement = arr[arr.length - 1];
        for(int i=0; i<arr.length-1; i++) {
            arr[arr.length - 1 - i] = arr[arr.length - 2 - i];
        }
        arr[0] = lastElement;
    }
}