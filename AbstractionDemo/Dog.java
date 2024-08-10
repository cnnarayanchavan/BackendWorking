package AbstractionDemo;

public class Dog extends Animal {


    @Override
    public void walk(){
        System.out.println("walks on 4 legs sometimes on 2 aslo..");
    }

    @Override
    public void habitit(){
        System.out.println("i am vegan an non-vegan too");
    }

    public Dog(int eyes, int legs){
        super(eyes, legs);
    }
}
