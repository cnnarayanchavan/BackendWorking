import java.util.Arrays;

public class SelectionSort2 {
    public static void main(String[] args) {
        int [] arr = {34,56,45,78,87};
        selectionSo(arr);
    }    

    static void selectionSo(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[smallest]) {
                    smallest = j;
                }
            }
            //swap 
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i]= temp;
            System.out.println(Arrays.toString(arr));
        }
    }
}



