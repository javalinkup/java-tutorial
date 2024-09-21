import java.util.Iterator;
import java.util.TreeSet;

public class ExampleTreeset {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101,"Ramesh",34000);
        Employee emp2 = new Employee(104,"Mahesh",7890);
        Employee emp3 = new Employee(234,"Rajesh",45000);
        Employee emp4 = new Employee(54,"Somesh",6789);
        /*
            Sort by Salary of an Set of employees  Natuaral
         */
        TreeSet <Integer>treeSet= new TreeSet<>();
        treeSet.add(emp1.getSalary());
        treeSet.add(emp2.getSalary());
        treeSet.add(emp3.getSalary());
        treeSet.add(emp4.getSalary());

        System.out.println(treeSet);

        /*
        Sort by Employee name. set of employees
         */

        TreeSet <String> treeSet1 = new TreeSet<>();
        treeSet1.add(emp1.getEmpName());
        treeSet1.add(emp4.getEmpName());
        treeSet1.add(emp2.getEmpName());
        treeSet1.add(emp3.getEmpName());

        System.out.println(treeSet1);

        /*
        Sort by Salary of employee using default sorting order by descdending order.
         */
       // TreeSet <Integer> treeSet2 = new TreeSet<>(treeSet);
        TreeSet<Employee> itr1 = new TreeSet<>();
        itr1.add(emp1);
        itr1.add(emp2);
        itr1.add(emp3);
        itr1.add(emp4);

        Iterator<Employee> itr = itr1.descendingIterator();
      //  TreeSet<Integer> treeSet2 = new TreeSet<>(treeSet);
        //treeSet2.

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
       // System.out.println(itr);

      //  System.out.println(treeSet2.descendingIterator());

    }
}
