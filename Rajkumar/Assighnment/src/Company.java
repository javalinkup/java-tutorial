public class Company {
    private String emplName;
    private int emplId;
    private String dept;
    private double salary;

    public Company(String emplName, int emplId, String dept, double salary) {
        this.emplName = emplName;
        this.emplId = emplId;
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Company{" +
                "emplName='" + emplName + '\'' +
                ", emplId=" + emplId +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getEmplName() {
        return emplName;
    }

    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    public int getEmplId() {
        return emplId;
    }

    public void setEmplId(int emplId) {
        this.emplId = emplId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
