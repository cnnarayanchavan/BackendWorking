package ArraysJava;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(23);
        myList.add(45);
        myList.add(34);
        myList.add(245);


        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) +" ");   
        }
      

    }
}
