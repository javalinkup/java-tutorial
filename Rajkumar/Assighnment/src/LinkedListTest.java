import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(9);
        list.add(1,45);
        list.addFirst(1);
        list.addLast(4);
        System.out.println(list);
       System.out.println(list.get(0));
        List<Integer> list1 = new LinkedList<>(list);
        boolean isTrue =list1.contains(list);
        System.out.println("does list1 contains list obj: "+isTrue);

        Employee emp1 = new Employee(1,"Raju",900);
        Employee emp2 = new Employee(2,"Naveen",700);
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(emp1);
        employees.add(emp2);
        System.out.println(employees);

    }
}
