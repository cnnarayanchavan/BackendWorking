import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        //sort using bubble sort
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]) {

                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp; 
                }
            }
        }
        // for( int ele : arr){
        //     System.out.print(ele + " ");
        // }
        System.out.println(Arrays.toString(arr));
    }
}
