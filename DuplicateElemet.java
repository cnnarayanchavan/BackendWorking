import java.util.Arrays;

public class DuplicateElemet {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,5,6,7,8,9,7,8,5,3};
        removeDuplicate(arr);
    }

    static void removeDuplicate(int[] array){
        Arrays.sort(array);
        int uniqueIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[uniqueIndex] != array[i]) {
                uniqueIndex++;
                array[uniqueIndex] = array[i];
            }
        }
        for(int i = 0; i<=uniqueIndex; i++){
            System.out.print(array[i]+ " ");
        }
    }

}
