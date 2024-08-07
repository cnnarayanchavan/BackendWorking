public class SwapWithoutUsing3rdVar {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 24;
        //swap w/o using third var

        num1 = num1 + num2;
        num2 = num1 -num2;   //using addition & substraction
        num1 = num1 - num2;

        // num1 = num1^num2;
        // num2 = num1^num2;  //using creat Symbol
        // num1 = num1^num2;


        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);

    }
}
