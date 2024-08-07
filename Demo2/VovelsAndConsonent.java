import java.util.Arrays;

public class VovelsAndConsonent {
    public static void main(String[] args) {
        String str = "good";
        char[] strArray = str.toCharArray();
        System.out.println(Arrays.toString(strArray));
        int countVo = 0;
        int countCo = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i] == 'a'||strArray[i] == 'e'||strArray[i] == 'i'||strArray[i] == 'o'||strArray[i] == 'u') {
                countVo++;  
            }else{
                countCo++;
            }
        }
        System.out.println("Total vovels and Consonant in string are: "+countVo+" : "+countCo);
    }
}
