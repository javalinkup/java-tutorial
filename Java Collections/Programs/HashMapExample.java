import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Rajesh", "HR");
        Employee emp2 = new Employee(2, "Sridhar", "IT");
        Employee emp3 = new Employee(3, "Elon Musk", "Finance");
        Employee emp4 = new Employee(1, "Rajesh", "HR");
        Map<Employee, Integer> employeeMap = new java.util.HashMap<>();
        String department = "HR";
        employeeMap.put(emp1,1);
        employeeMap.put(emp2, 2);
        employeeMap.put(emp3,3);
        employeeMap.put(emp4, 10);
        for(Map.Entry<Employee, Integer> entry: employeeMap.entrySet()){
           Employee e = entry.getKey();
           if(department.equals(e.getDepartment())){
               System.out.println(e.toString());
           }
        }

    }

}
