package Demo4.CLasses_Objects;
import Demo4.One_Overridden.*;


public class Human extends A {
    String Name;
    int eyes;
    int limbs;  
    int nose;
    int age;
    float Iq;

    void method1Walk () {
        System.out.println("i walk on "+this.limbs+"legs");
    }

    void metho2Intro() {
        System.out.println("I am " +this.Name + " and i am " +this.age);
    }

    public Human(String Name, int eyes, int limbs, int age, float Iq) {
            this.Name = Name;
            this.eyes = eyes;
            this.limbs = limbs;
            this.age = age;
            this.Iq = Iq;
    }
}
