import java.util.Scanner;

public class ReverseStringUsingStringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter astring: ");
        String str1 = sc.nextLine();
        StringBuffer sb = new StringBuffer(str1);
        System.out.println(sb.reverse());
    }
}
