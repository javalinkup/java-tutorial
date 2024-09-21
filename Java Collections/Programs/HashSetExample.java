import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> data = new HashSet<>();
        data.add("Capgemini");
        data.add("HCL");
        data.add("WIPRO");
        data.add("HCL");
        data.add("HCL");
        data.add("HCL");
        System.out.println(data);
        Set<Employee> employees = new HashSet<>();
        /*Employee emp1 = new Employee(1, "Rajesh");
        Employee emp2 = new Employee(2, "Sridhar");
        Employee emp3 = new Employee(3, "Elon Musk");
        Employee emp4 = new Employee(1, "Rajesh");
        //Employee emp1 = new Employee(1, "Rajesh");
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        System.out.println(employees);
        Set<Employee> employeeSet = new LinkedHashSet<>();
        employeeSet.add(emp1);
        employeeSet.add(emp2);
        employeeSet.add(emp3);
        employeeSet.add(emp4);
*/
        //System.out.println(employeeSet);

    }
}
