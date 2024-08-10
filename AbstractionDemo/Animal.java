package AbstractionDemo;

public abstract class Animal {
    int eyes;
    int legs;

    abstract void walk();

    abstract void habitit();


    //non-abstract method / concrite methods in abstract classes
    public void eat(){
        System.out.println("Animal Eats");
    }

    public Animal(int eyes, int legs){
        this.eyes = eyes;
        this.legs = legs;
        System.out.println("Has "+this.eyes +" eyes and "+this.legs+ " legs");
    }
    
}
