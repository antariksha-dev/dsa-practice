class FindMaxFixedSubArray {
    public static void main(String []args) {
        int arr[] = {1,5,6,9,8,7,4};

        int i, sum = 0, l=0, r, largest = 0;
        for(i = 0; i < 3; i++) {
            sum += arr[i];
        }
        largest = sum;
        for(r = i; r < arr.length; r++) {
            sum += arr[r] - arr[l];
            l++;
            if(sum > largest) {
                largest = sum;
            }
        }
        System.out.println("Largest sum of 3 subarray is: " + largest);
    }
}