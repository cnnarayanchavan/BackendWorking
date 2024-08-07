public class NumberPalindrome {
    public static void main(String[] args) {
        int num = 121;
        int original = num;
        int reverseNumber= 0;
        while (num>0) {
            int ld = num % 10;
            reverseNumber = (reverseNumber * 10) + ld;
            num = num / 10;
        }
        String op = (original == reverseNumber) ? "It is a Palindrome" : "It is not a Palindrome";
        System.out.println(op);
    }
}
