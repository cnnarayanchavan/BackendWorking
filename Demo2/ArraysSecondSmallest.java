public class ArraysSecondSmallest {
    public static void main(String[] args) {
        int[] arr ={34,45,23,45,23,45,6,4,64,2};
        int smallest = arr[0];
        int secondSmallest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
        }
        System.out.println("Second Smallest: "+secondSmallest + " & " + "Smallest: "+smallest );
    }
}
