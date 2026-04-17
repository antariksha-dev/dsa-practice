public class MaximumIndexDifference {

    public static void main(String[] args) {
        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};

        int result = maxIndexDiff(arr);
        System.out.println(result);
    }

    public static int maxIndexDiff(int[] arr) {

        int rmax[] = new int[arr.length];
        int lmin[] = new int[arr.length];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            min = Math.min(min, arr[i]);
            lmin[i] = min;
        }
        for(int i=arr.length-1; i>=0; i--) {
            max = Math.max(max, arr[i]);
            rmax[i] = max;
        }
        int i, j;
        i=j=0;
        int ans = Integer.MIN_VALUE;
        while(i < arr.length && j < arr.length) {
            if(lmin[i] < rmax[j]) {
                ans = Math.max(ans, j-i);
                j++;
            } else {
                i++;
            }
        }
        return ans;
    }
}