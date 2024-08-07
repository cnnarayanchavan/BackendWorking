public class Digits {
    public static void main(String[] args) {
        int num = 13234;
        int sum =0;

        //this is direct finding the digits using string method

        // int digits = String.valueOf(num).length();
        // System.out.println("Total number of digits are: "+digits);

        //using proper logic

        while (num>0) {
            num = num / 10;
            sum++;
        }
        System.out.println("total digits are: "+sum);
    }
}
