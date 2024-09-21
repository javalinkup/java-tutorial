import java.util.Objects;

public class Employee implements Comparable<Employee>{
   private int empId;
   private String empName;
   private int salary;

    public int getEmpId() {
        return empId;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(int empId, String empName, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {

        return Integer.compare(this.salary,o.salary);
    }
}
