import java.util.Arrays;

public class Even_odd_element_in_array {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,10};
        Arrays.stream(arr).filter(n -> n %2 == 0).forEach(n->System.out.println(n));
    }  
}
