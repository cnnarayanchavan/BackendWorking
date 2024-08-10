import java.io.Serial;

public class ReverseStrings {
    public static void main(String[] args) {
        String str1 = "Kamal Hasan";
        reverstSrt(str1);
    }

    static void reverstSrt(String str){
        String Reverse_str1 = "";
        for(int i = str.length()-1; i>=0; i--){
            Reverse_str1 = Reverse_str1 + str.charAt(i);
        }
        System.out.println(Reverse_str1);
    }
}
