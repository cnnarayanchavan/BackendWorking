public class ArraysEvenOdd {
    public static void main(String[] args) {
        int[] arr = {4,3,2,4,23,5,3,56,45,7};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Even elements:"+arr[i]);
            }else{
                System.out.println("Odd elements:"+arr[i]);
            }
        }
    }
}
