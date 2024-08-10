package GetterSetter;

public class Main {
    //understand getter and setters.
    //object of bank;
    public static void main(String[] args) {
        Account1 user1 = new Account1();
        user1.method1();
        user1.setIfsc(123423);
        int ifcs = user1.getIfsc();
        System.out.println("Ifcs is: "+ifcs);
    }
}


