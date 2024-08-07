public class ReverseString {
    public static void main(String[] args) {

        //THIS IS USING INBUILD METHOD

        // StringBuffer sb = new StringBuffer("Hello World!");
        // sb.reverse();
        // System.out.println(sb);

        //THIS IS USING LOGIC
        String s1 = "Narayana is a good boy.";
        String s2 = "";  //empty string for storing reverse string
        for(int i = s1.length()-1; i>=0; i-- ){
            s2 = s2 + s1.charAt(i);
        }
        System.out.println("Reverse String is: "+s2);
    }
}
