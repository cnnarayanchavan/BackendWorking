public class StringPalindrome {
    public static void main(String[] args) {
        String str1 = "Mam";
        String originalString = str1.toUpperCase();
        StringBuffer sb = new StringBuffer(originalString);
        String s2 = sb.reverse().toString();
        String ans = (originalString.equals(s2))?"it is palindrome":"it is not palindrome";
        System.out.println(ans);

    }
}
