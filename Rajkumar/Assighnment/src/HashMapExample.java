import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapExample {
    public static void main(String[] args) {
        Company cmp = new Company("Mahesh",102,"HR",56000.00);
        Company cmp2 = new Company("Suresh",456,"IT",90000);
        Company cmp3 = new Company("Rakesh",234,"Admin",65400);
        Company cmp4 = new Company("Rajesh",456,"Finanace",34000);
        Company cmp5 = new Company("Abhilash",654,"Account",5000);
        Company cmp6 = new Company("Balu",112,"Maintanance",4000);
        Company cmp7 = new Company("sukesh",567,"HR",67543);
        Map<Integer,Company> companyMap=new ConcurrentHashMap<>();
        companyMap.put(1,cmp);
        companyMap.put(2,cmp2);
        companyMap.put(3,cmp3);
        companyMap.put(4,cmp4);
        companyMap.put(5,cmp5);
        companyMap.put(6,cmp6);
        companyMap.put(7,cmp7);
     //   companyMap.remove(2);
     //   companyMap.put(7,null);
     //   companyMap.put(null,cmp2);
        System.out.println(companyMap);// hashmap is fail fast,concurrent hashmap is fail safe
        Map<String,Integer> companyMap1 = new HashMap<>();
        for (Map.Entry<Integer,Company> entry:companyMap.entrySet()) {
            Company c = entry.getValue();
            String department = c.getDept();
            if (companyMap1.containsKey(department)){

            companyMap1.put(department,companyMap1.get(department)+1);
            }
            else {
                companyMap1.put(department,1);

            }
        }

        System.out.println("The count of dept employess :"+companyMap1);


     //   System.out.println("HR people are :"+count_1);

        // to remove  "HR" object
        for (Map.Entry<Integer, Company> entry:companyMap.entrySet()) {
            Company c = entry.getValue();
            int count=0;
            String dept ="HR";


            if (dept.equals(c.getDept())){
                Integer i = entry.getKey();
                companyMap.remove(i);

            }
            if (c.getSalary()>10000){
                System.out.println("Employee salary greater than 10000"+c.getEmplName());
                if (c.getSalary()>50000 && c.getSalary()<75000){
                    System.out.println("Employee salary between 50k and 75k"+c.toString());
                }
            }



        }

        System.out.println("Removed hr:"+companyMap);



    }
}
