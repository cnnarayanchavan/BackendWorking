public class ArraysSmallest {
    public static void main(String[] args) {
        int[] array = {45,343,456,3,44,56,32,4,6,43};
        int smallest = array[0];
        for (int i = 1; i<array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println("The smallest element from an array: "+smallest);
    }
}
