class CombineTwoSortedArrays {

    public static int[] combineTwoSortedArrays(int arr1[], int arr2[]) {
        int i, j, k;
        i=j=k=0;

        int newarr[] = new int[arr1.length + arr2.length];

        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                newarr[k] = arr1[i];
                i++;
            } else {
                newarr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i < arr1.length) {
            newarr[k] = arr1[i];
            i++; k++;
        }

        while(j < arr2.length) {
            newarr[k] = arr2[j];
            j++; k++;
        }

        return newarr;
    }

    public static void main(String arr[]) {
        int arr1[] = {1,4,5,6};
        int arr2[] = {2,3,7};

        int newarr[] = combineTwoSortedArrays(arr1, arr2);

        for(int num:newarr) {
            System.out.print(num + " ");
        }

    }
}