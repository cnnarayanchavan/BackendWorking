import java.util.Arrays;

public class ArraysDuplicateElements {
    public static void main(String[] args) {
        //write a program to find the remove the dplicate element from an array

        int[] arr ={1,2,3,3,3,4,5,5,6,6,7};
        //if the array is not sorted
        Arrays.sort(arr);
        int uniqueIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[uniqueIndex] != arr[i]) {
                uniqueIndex = uniqueIndex + 1;
                arr[uniqueIndex] = arr[i];
            }
        }
        for (int i = 0; i <=uniqueIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
