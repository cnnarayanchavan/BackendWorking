public class ArraysLargest {
    public static void main(String[] args) {
        int[] arr = {43,4,23,65,23,56};
        //find the largest element 

        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest Element is: "+largest);
    }
    
}
