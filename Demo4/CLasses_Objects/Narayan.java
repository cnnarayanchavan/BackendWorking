package Demo4.CLasses_Objects;

public class Narayan extends Human {

    public Narayan(String Name, int eyes, int limbs, int age, float Iq) {
        super(Name, eyes, limbs, age, Iq);
    }

    @Override
    void method1Walk() {
        System.out.println("I walk on "+limbs+" Limbs in A NArayanaaa");
    }

    @Override
    void metho2Intro() {
        System.out.println("I am "+this.Name +" and i am "+this.age +" In A Narayanaaaa");
    }
    
}
