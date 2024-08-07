import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: " );
        int Number = sc.nextInt();
        int ans = reverseNumber(Number);
        System.out.println("Reverse of given number is: "+ans);

    }

    public static int reverseNumber(int number){
        int ld = 0;
        int rn = 0;

        while (number >0) {
            ld = number % 10;
            rn = (rn * 10) + ld;
            number = number / 10;
        }
        return rn;
    }
}