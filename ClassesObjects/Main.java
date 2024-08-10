package ClassesObjects;

public class Main {
    public static void main(String[] args) {

        //first object with reference and object both are from "PARENT" calss.
        A a1 = new A(); 
        a1.show();
        a1.config();

        //so here we cannot invoke the method of child/sub class with object of parent calass
        // a1.print1();
        // a1.print2();

        //second object with reference of parent calss and object of SUBCLASS..
        A obj1 = new B();
        obj1.config();
        obj1.show();

        // so here the method to be invoked is depend on "REFERENCE" type not "OBJECT"  
        // obj1.print1();   
        // obj1.print2();   

        B b1 = new B();
        b1.config();
        b1.show();
        b1.print1();
        b1.print2();

        //but here if we have object with reference of subcalss adn the object is aslo sub class then we can have access to all the fields present in the classes in parant and chile



    }
}
