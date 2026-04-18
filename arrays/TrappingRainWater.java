import java.util.*;

public class TrappingRainWater {

    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 0, 4, 0, 2};
        int result = trapWater(arr);
        System.out.println("Water Trapped: " + result);
    }

    public static int trapWater(int[] arr) {
        int pf[] = new int[arr.length];
        int sf[] = new int[arr.length];

        pf[0] = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > pf[i-1]) {
                pf[i] = arr[i];
            } else {
                pf[i] = pf[i-1];
            }
        }
        sf[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--) {
            if(arr[i] > sf[i+1]) {
                sf[i] = arr[i];
            } else {
                sf[i] = sf[i+1];
            }
        }
        int min = 0;
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            min = Math.min(pf[i], sf[i]);
            sum += min - arr[i];
        }
        return sum;
    }
}