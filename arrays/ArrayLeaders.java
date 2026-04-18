import java.util.*;
public class ArrayLeaders {
    public static void main(String[] args) {
        int[] arr = {10, 4, 2, 4, 1};
        int[] result = findLeaders(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findLeaders(int[] arr) {
        int max;
        int newarr[] = new int[arr.length];
        Arrays.fill(newarr, -1);
        int j = newarr.length-1;
        max = newarr[j] = arr[arr.length-1];
        j--;
        for(int i=arr.length-2; i>=0; i--) {
            if(arr[i] >= max) {
                max = arr[i];
                newarr[j] = max;
                j--;
            }
        }
        return newarr;
    }
}

// Or store in arraylist then convert back to int[]