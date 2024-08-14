package LinkList;
public class Main {
        public static void main(String[] args) {
        Student s1 = new Student(12, 90.009,null);
        Student s2 = new Student(22, 78.90, s1);
        Student s3 = new Student(222, 90.90, s2);
        s3.traverseObject();
        

        int a = 10;
        int ans = changeVar(a);
        System.out.println("value of a is: "+a);


        B b1 = new B();
        b1.name = "Narayana";
        System.out.println(b1.name);
        changeName(b1);
        System.out.println(b1.name);

        
    }

    public static void changeName(B b1){
        b1.name = "Chavannnnnnnnnnn's";
    }

   
    public static int changeVar(int a) {
        a = 100;
        return a;
    }
}

class Student {

    int age;
    double marks;
    Student newStd;

    void printDatails () {
        System.out.println("My marks and age is -> " + this.age +" & "+ this.marks);
    }

    public Student (int age, double marks,Student newStd) {
        this.age = age;
        this.marks = marks;
        this.newStd = newStd;
        printDatails();
    }

    // mrthod to travese from object

    public void traverseObject (){
        Student cureent = this;
        while (cureent != null) {
            cureent.printDatails(); 
            cureent = cureent.newStd;
        }
    }
}

class B {
    String name;
}

