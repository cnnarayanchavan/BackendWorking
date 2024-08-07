import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int rv = 0;
        while (number>0) {
            int ld = number % 10;
            rv = rv*10 + ld;
            number = number / 10;
        }
        System.out.println(rv);
    }
}
