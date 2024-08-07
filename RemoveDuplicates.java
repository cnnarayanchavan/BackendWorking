
import java.util.Arrays;


   public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {56,45,78,34,56,78,67,56,90,78,90,78,12,13,12,13,14,15};
        
        Arrays.sort(array);
        
        int randomIndex = 0;
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[randomIndex]) {
                randomIndex++;
                array[randomIndex] = array[i];
            }
        }
        for (int i = 0; i <=randomIndex; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

