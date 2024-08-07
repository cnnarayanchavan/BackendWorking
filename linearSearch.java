public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {23,45,34,56,78};
        //linear search in array
        int element = 78;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==element) {
                System.out.println("Element found at index: "+i);
            }
        }
    }
}
