import java.util.*;

public class InsertElementAtEndOfArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int val = 90;

        int[] result = insertAtEnd(arr, val);
        System.out.println(Arrays.toString(result));
    }

    public static int[] insertAtEnd(int[] arr, int val) {
        int newarr[] = new int[arr.length + 1];
        int i;
        for(i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }
        newarr[i] = val;
        return newarr;
    }
}