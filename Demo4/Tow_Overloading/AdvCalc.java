package Demo4.Tow_Overloading;

public class AdvCalc {
    public int metOperation(int num1, int num2){
        return num1 + num2;
    }

    public Double metOperation(Double num1, Double num2){
        return num1 + num2;
    }

    public float metOperation(int num1, float num2){
        return num1 + num2;
    }

    public String metOperation(String s1, String s2){
        return s1+ s2;
    }

    public void metOperation(Double num1, int num2){
        System.out.println("my num1 is : "+num1+" and is this "+num2);
    }
}
