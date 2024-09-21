import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); //default size 16: 0-15 |123|34|45|||||....15
       //hashcaode generate Bucket -->key value pairs   index = hascode(key)*sizeofArray
        map.put("Srinivas", 2);
        map.put("Thirupathi", 3);
        map.put("Rakesh2", 1);
        map.put("Rakesh2", 89);
        int hashCode = map.get("Rakesh2").hashCode();   //^ XOR  two
        int index =  (hashCode ^(hashCode >>>16)) % 14;  //Shifts the bits of the hashcode to the right by 16 postions
         int num1 = 5;
         int num2= 4;
         int resultXOR = num1 ^ num2;  //  0101 : 0100 = 0001  0011 ^ 0100 = 0111:  7
         //System.out.println(resultXOR);
        System.out.println("Index: " +index);
        System.out.println(map);
        System.out.println(map.get("Rakesh"));
        map.remove("Srinivas");
        System.out.println(map.size());
        Employee emp1 = new Employee(1, "Rajesh", "HR");
        Employee emp2 = new Employee(2, "Sridhar", "IT");
        Employee emp3 = new Employee(3, "Elon Musk", "Finance");
        Employee emp4 = new Employee(1, "Rajesh", "HR");
        Map<Employee, Integer> employeeMap = new HashMap<>();
        employeeMap.put(emp1,1);
        employeeMap.put(emp2, 2);
        employeeMap.put(emp3,3);
        employeeMap.put(emp4, 10);
        System.out.println(employeeMap);
        System.out.println(emp1.hashCode()+ " :" + emp4.hashCode());
        if(employeeMap.containsKey(emp1)){
            emp1.setName("Adani Groups");
             employeeMap.put(emp1,12);
            System.out.println(emp1.hashCode());
        }
        System.out.println(employeeMap);





    }
}
