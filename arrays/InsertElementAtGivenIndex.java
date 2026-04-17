import java.util.*;

public class InsertElementAtGivenIndex {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 2;
        int val = 90;

        int[] result = insertAtIndex(arr, index, val);
        System.out.println(Arrays.toString(result));
    }

    public static int[] insertAtIndex(int[] arr, int index, int val) {

        int newarr[] = new int[arr.length + 1];
        int i;
        int temp = index;
        for(i=0; i<index; i++) {
            newarr[i] = arr[i];
        }

        for(i=index+1; i<newarr.length; i++) {
            newarr[i] = arr[temp++];
        }
        newarr[index] = val;
        return newarr;
    }
}