import java.util.*;

public class IteratoExanmple {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Rajesh", "HR");
        Employee emp2 = new Employee(2, "Sridhar", "IT");
        Employee emp3 = new Employee(3, "Elon Musk", "Finance");
        Employee emp4 = new Employee(1, "Rajesh", "HR");
        var list = Arrays.asList(emp1,emp2, emp3, emp4);
        Vector<Employee> vectormap = new Vector<>();
        vectormap.add(emp1);
        vectormap.add(emp2);
        vectormap.add(emp3);
        vectormap.add(emp4);
        Enumeration<Employee> enums = vectormap.elements();
        while(enums.hasMoreElements()){
            System.out.println(enums.nextElement());
        }
       // Iterator<Employee> employeeIterator = list.iterator();
        ListIterator<Employee> listIterator = list.listIterator(list.size());
        while(listIterator.hasNext()){
            Employee employee = listIterator.previous();
            System.out.println(employee);
            System.out.println(listIterator.previousIndex());

        }
       // Enumeration<Employee> enum1 = list
    }
}
