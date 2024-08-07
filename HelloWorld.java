
class HelloWorld {
    public static void main(String[] args) {
        int number = 2;
        int originalNumber = number;
        int sum = 0;
        int ld=0;
        int digits = String.valueOf(number).length();
        System.out.println(digits);
        
        while (number > 0) {
            ld = number % 10;
            sum += Math.pow(ld, digits);
            number /= 10;
        }

        
            String op = (sum==originalNumber)? "it is armstrong" : "it is not";        
            System.out.println(op);

    }
}

