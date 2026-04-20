import java.util.*;

class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {14, 13, 10, 11, 12};
        int[] result = sort(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sort(int[] arr) {
        int i = 0;
        int n = arr.length;
        while(i < n) {
            int correctIndex = arr[i] - 10;
            if(arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
        return arr;
    }
}