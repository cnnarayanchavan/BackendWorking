package Demo5;

import java.sql.Struct;

public class Main {
    public static void main(String[] args) {
       
        Student Narayan = new Student();

        Student Nitin = new Student("Nitin" , 12 , 45.0f, true );
        
        Student random = new Student(Narayan);

        System.out.println(random.name);
        System.out.println(random.age);

        System.out.println(Nitin.age);
        System.out.println(Nitin.name);
        System.out.println(Nitin.marks);
        System.out.println(Nitin.status);


        // Narayan.changeName("Narendra");
        // Narayan.greeting();


        System.out.println(Narayan.age);
        System.out.println(Narayan.name);
        System.out.println(Narayan.marks);
        System.out.println(Narayan.status);
    }
}

class Student{
    String name;
    int age;
    float marks;
    boolean status;

    Student () {
        this.name = "Narayan";
        this.age = 21;
        this.marks = 71.90f;
        this.status = true;
    }

    Student (String name, int age, float marks, boolean status) {
        this.name = name;
        this.age =  age;
        this.marks = marks;
        this .status = status;
    }

    Student (Student other){
        this.name = other.name;
        this.age = other.age;
    }

    void greeting(){
        System.out.println("Hello my name is "+name);
    }

    void changeName(String newName){
        name = newName;
    } 
}


//first it will check into the object for value if not found go to the class
