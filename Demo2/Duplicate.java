import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {45,56,56,67,78,89,89,89,90,90,89,89};
        Arrays.sort(arr);
        int ui = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[ui] != arr[i]) {
                ui++;
                arr[ui] = arr[i];
            
            }
        }
        for (int j = 0; j <= ui; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
