package RecersiveApproach;

public class Recursion {
    public static void main(String[] args) {
        //print number 5 times without usin iterative way..
        int ans = fact(5);
        System.out.println(ans);
        iterativeWay(5);

    }

    //ITERATIVE WAY
    static int fact(int num){
        if (num == 0 || num ==1) {
            return 1;
        }
        else{
            return num * fact(num - 1);
        }
    }

    //STATIC WAY
    static void iterativeWay(int number){
        int factorial = 1;
        for(int i = 1; i<=number; i++){
            factorial *=i;
        }
        System.out.println(factorial);
    }
}
