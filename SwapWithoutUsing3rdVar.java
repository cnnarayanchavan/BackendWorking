public class SwapWithoutUsing3rdVar {
    public static void main(String[] args) {
        int a = 12;
        int b = 24;
        //swap w/o using third var

        a = a + b;
        b = a -b;   //using addition & substraction
        a = a - b;

        // a = a^b;
        // b = a^b;  //using creat Symbol
        // a = a^b;


        System.out.println("a: "+a);
        System.out.println("b: "+b);

    }
}
