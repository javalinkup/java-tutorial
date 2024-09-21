public class Collection{
    public static void main(String[] args) {
        String [] array = {"Hyderabad", "Secinderabad"};

        for(int i=0; i< array.length;i++){
            System.out.println(array[i]);
        }

        Employee [] employees = new Employee[2];
        /*employees[0] = new Employee(1,"Elon Musk");
        employees[1] = new Employee(2,"John Kennedy");*/
        for(int i=0; i< employees.length;i++){
            System.out.println(employees[i].getId() + "" +employees[i].getName());
        }

    }
}
