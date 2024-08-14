package LinkList;
public class Main {
        public static void main(String[] args) {
        Student s1 = new Student(12, 90.009,null);
        Student s2 = new Student(22, 78.90, s1);
        Student s3 = new Student(222, 90.90, s2);
        s3.traverseObject();
        
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

