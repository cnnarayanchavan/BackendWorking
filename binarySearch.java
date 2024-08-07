import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {45,34,6,5,23,56,34};
        //  Sorted array// arr = {5,6,23,34,34,45,56};
        Arrays.sort(arr);
        int ele = 1;
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        boolean found = false;

        while (start <= end) {
            mid = (start + end) / 2;
            if (ele > arr[mid]) {
                start = mid+1;
            }
            else if (ele<arr[mid]) {
                end = mid-1;
            }else{
                found = true;
                break;
            }
        }
        String ans = (found) ? "Element found at index: "+mid : "Element is not present in array.";
        System.out.println(ans);
    }
}
