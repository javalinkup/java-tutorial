import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();
        set.add("HDFC");
        set.add("ICICI");
        set.add("AMERICAN BANK");
        System.out.println(set); //AM,HD,IC
        Person person = new Person(26, "Rajesh");
        Person person1 = new Person(25, "Hanumanth");
        Person person2 = new Person(23, "Sriram");
        Person person3 = new Person(25, "Hanumanth");

        SortedSet<Person> personSortedSet = new TreeSet<>();
        personSortedSet.add(person);
        personSortedSet.add(person1);
        personSortedSet.add(person2);
        personSortedSet.add(person3);
        System.out.println(personSortedSet);


    }
}
