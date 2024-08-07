public class CountWordsFromString {
    public static void main(String[] args) {
        String str1 = "";
        countWords(str1);
    }

    public static void countWords (String s) {
        if (s.trim().isEmpty()) {
            System.out.println("String is empty");
            return;
        }

        int count = 0;
        boolean check = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && !check) {
                count++;
                check = true;
            }else if (s.charAt(i)==' ' && check==true) {
                check = false;
            }
        }
        System.out.println("Total words in string are: "+count);
    }
}
