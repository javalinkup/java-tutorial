import java.util.TreeSet;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Abhi",123,9875.50);
        Person p2 = new Person("bablu",345,56734.50);
        Person p3 = new Person("Johny",213,56738.90);
        Person p4 = new Person("Rocky",456,34500.00);

        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.add(p2);
        treeSet.add(p1);
        treeSet.add(p3);
        treeSet.add(p4);

        System.out.println(treeSet);
    }
}
