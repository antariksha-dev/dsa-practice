import java.util.*;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 4, 4, 4, 5, 8, 8, 8};
        removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void removeDuplicates(int[] arr) {
        int i=0;
        int j=i+1;
        while(j < arr.length) {
            if(arr[i] != arr[j]) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            } else {
                j++;
            }
        }
        i++;
        while(i < arr.length) {
            arr[i] = -1;
            i++;
        }
    }
}