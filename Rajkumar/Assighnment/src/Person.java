import java.util.Objects;

public class Person implements Comparable<Person>{
   private String pName;
  private   int pId;
   private double pSalary;

    public Person(String pName, int pId, double pSalary) {
        this.pName = pName;
        this.pId = pId;
        this.pSalary = pSalary;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public double getpSalary() {
        return pSalary;
    }

    public void setpSalary(double pSalary) {
        this.pSalary = pSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return pId == person.pId && Double.compare(pSalary, person.pSalary) == 0 && Objects.equals(pName, person.pName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pId);
    }

    @Override
    public String toString() {
        return "Person{" +
                "pName='" + pName + '\'' +
                ", pId=" + pId +
                ", pSalary=" + pSalary +
                '}';
    }


    @Override
    public int compareTo(Person o) {
        return this.pName.compareToIgnoreCase(o.pName);
    }
}
