package Demo4.CLasses_Objects;
import Demo4.One_Overridden.*;

public class Main {
    public static void main(String[] args) {
        // use main method to create an instance of classes

        Human h1 = new Narayan("Narayan Chavan", 2, 4, 221, 190.0f);
        h1.method1Walk();
        h1.metho2Intro();

    }
}
