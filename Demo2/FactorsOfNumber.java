public class FactorsOfNumber {
    public static void main(String[] args) {
        //code for finding factors of number in java
        int num = 90;
        for (int i = 1; i < num; i++) {
            if (num % i ==0) {
                System.out.println("Factors of number " +num + " is: "+i);
            }
        }
    }
}
