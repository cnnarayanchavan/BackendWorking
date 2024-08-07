public class ArmStrongNumber {
    public static void main(String[] args) {
        int num = 25;
        int original = num;
        int digits = String.valueOf(num).length();
        int sum = 0;
        while (num > 0) {
            int ld = num % 10;
            sum += Math.pow(ld, digits);
            num = num / 10;
        }
        String ans = (original == sum) ? " It is Armstrong" : "It is not Armstrong";
        System.out.println(ans);
    }
}
