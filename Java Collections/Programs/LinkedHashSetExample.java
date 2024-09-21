import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<Person> personSet = new LinkedHashSet<>();
        Set<Integer> ageSet = new HashSet<>();

        Person person1 = new Person(25, "Hanumanth");
        Person person = new Person(23, "Sriram");
        Person person3 = new Person(25, "Hanumanth");
        ageSet.add(person1.getAge());
        ageSet.add(person.getAge());
        ageSet.add(person3.getAge());
        System.out.println(ageSet);
        personSet.add(person1);
        personSet.add(person);
        personSet.add(person3);
        System.out.println(personSet.size()); //3
       // personSet.remove(person3);
        System.out.println(personSet.size());//2
        System.out.println(personSet);
        ArrayList<Person> list = new ArrayList<>(personSet);
        System.out.println(list); // Hanumanth, sriram   3 values
        System.out.println(list.size());//2, 3

    }
}
