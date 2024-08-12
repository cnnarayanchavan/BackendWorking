package ArraysJava;

import java.util.Arrays;
import java.util.Scanner;

public class arr1{
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int size = in.nextInt();
        int [] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }
}