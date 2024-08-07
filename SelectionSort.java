import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {4,3,5,6,2,3,2,3};
        for (int i = 0; i < array.length-1; i++) {
            int small = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j]<array[small]) {
                    small = j;
                }
            }
            int temp = array[small];
            array[small] = array[i];
            array[i] = temp;
        }
        for(int ele : array ){
            System.out.print(ele + " ");
        }
    }
}
