import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence you want to reverse:");
        String str1 = sc.nextLine();
        String Str2 = "";  //for stroring reverse string
        for (int i = str1.length()-1; i >= 0; i--) {
            Str2 = Str2 + str1.charAt(i);
        }
        System.out.println("Reverse Sentence is: "+Str2);
    }
}
