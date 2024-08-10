package GetterSetter;

public class Account1 extends Bank {
    private int ifscCode;
    String Name = "Narayana";

     void method1(){
        System.out.println(Bank.BankName);
     }

     public int getIfsc(){
        return ifscCode;
     }

     public void setIfsc(int ifsc){
        this.ifscCode = ifsc;
     }

     
}
