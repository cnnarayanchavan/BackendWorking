package ArraysJava;

import java.util.Scanner;

public class arr2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cows = sc.nextInt();
        int[][] arr = new int[rows][cows];


        //for printing 

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cows; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cows; j++) {
                System.out.println(arr[i][j] + " ");
            }
        }
        System.out.println();

        
    }
}
