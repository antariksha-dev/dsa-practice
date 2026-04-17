import java.util.*;

public class MoveZeroesToEnd {

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroes(int[] arr) {
        int i = 0;
        int j = 0;
        while(j < arr.length) {
            if(arr[j] != 0 && i == j) {
                i++;
                j++;
            } else if(arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            } else {
                j++;
            }
        }
    }
}