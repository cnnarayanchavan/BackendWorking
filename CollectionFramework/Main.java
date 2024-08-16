package CollectionFramework;

public class Main {
    public static void main(String[] args) {
        Linklist list = new Linklist();
        list.insert(1);
        list.insert(1);
        list.insert(1);
        list.insert(1);
        list.insert(1);
        list.addAtFirst(12);
        list.displayNodes();
    }
}
