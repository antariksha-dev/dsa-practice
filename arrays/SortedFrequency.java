import java.util.*;

public class SortedFrequency {

    public static void main(String[] args) {
        int[] arr = {3, 3, 2, 2, 1, 4};
        printSortedFrequency(arr);
    }

    public static void printSortedFrequency(int[] arr) {
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i=0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map);
    }

    public static void printSortedFrequencyTest(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++) {
            if(!set.contains(arr[i])) {
                set.add(arr[i]);
            } else {
                continue;
            }
            int count = 1;
            for(int j=i+1; j<arr.length;j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }
}