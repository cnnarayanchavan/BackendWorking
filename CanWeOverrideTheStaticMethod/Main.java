package CanWeOverrideTheStaticMethod;

public class Main {
    public static void main(String[] args) {       
        Bird duck = new Duck();
        duck.fly();
        duck.walk();
        duck.swim();
        duck.eat();      //default method in interfaces
        duck.sleep("Duck");       //default method in interfaces  

        Bird.randomBirdBehaviour("Narayana's Eagel");     //this is static method of an interface

        Bird eagel = new Eagel();
        eagel.sleep("Eagel");
        eagel.eat();
        eagel.fly();
        eagel.sleep("Eagel");
        eagel.walk();
        eagel.swim();

        
        
    }   
}

interface Bird {

    void fly();
    void walk();
    void swim();

    default void eat(){
        System.out.println("bird eats..!");
    }

    default void sleep(String nameOfAnimal){
        System.out.println(nameOfAnimal+" bird sleeps..!");
    }

    static void randomBirdBehaviour(String nameBird) {
        System.out.println(nameBird+" I feel wired sometime...");
    }
}


//Interface 1
class Duck implements Bird{

    public void fly(){
        System.out.println("i fly at normal range not high sky...");
    }

    public void walk(){
        System.out.println("I walk mostly..");
    }

    public void swim(){
        System.out.println("I mostly swims..");
    }

    public void duckMethod(String str){
        System.out.println("My name is :"+str);
    }
}


//Interface 2
class Eagel implements Bird{

    public void fly(){
        System.out.println("I fly high sky..");
    }

    public void walk(){
        System.out.println("Eagels rarely walks...");
    }

    public void swim(){
        System.out.println("Dangg!!! eages dive dont swim");
    }
}


