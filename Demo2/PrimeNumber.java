public class PrimeNumber {
    public static void main(String[] args) {
        int number = 6;
        int count = 0;
        for(int i = 1; i<=number; i++){
            if (number % i ==0) {
                count++;
            }
        }
        // if (count == 2) {
        //     System.out.println("Prime number.");            
        // }else{
        //     System.out.println("not a prime number.");
        // }
        String ans = (count == 2) ? "Prime" : "Not Prime";
        System.out.println(ans);
    }

}

