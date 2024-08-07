public class ArraysSecondLaargest {
    public static void main(String[] args) {
        int[]  arr = {34,23,45,3,445,23,5,3};
    int largest = arr[0];
    int secondLargest = 0;  //or Integer.MIN_VALUE;

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > largest) {
            secondLargest = largest;
            largest = arr[i];
        }
    }
    System.out.println("The Second Largest Element From An Array Is: "+secondLargest+ " and largest is: "+largest);
    }
}
