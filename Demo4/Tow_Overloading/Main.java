package Demo4.Tow_Overloading;

public class Main {
    public static void main(String[] args) {
        //creating an oj=bject

        //so here in early binding 
        //compiler will detect which method to be invoked at complile time 

        AdvCalc ac = new AdvCalc();
        ac.metOperation(34.45, 12);

        double ans = ac.metOperation(23.34, 45.45);
        System.out.println(ans);

        
        float ans2 = ac.metOperation(12, 34.5f);
        System.out.println(ans2);

        int ans3 = ac.metOperation(12, 12);
        System.out.println(ans3);

        String s1 = ac.metOperation("Additon", "Substraction");
        System.out.println(s1);

    }
}
