import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("Oracle");
        Object [] array = list.toArray();
        String [] arr=  list.toArray(new String[0]);
        for(Object obj: array){
            System.out.println(obj);
        }
        for(String str: arr){
            System.out.println(str);
        }
        List<Integer> intList = new ArrayList<>();
        intList.add(90);
        intList.add(123);
        intList.add(56);
        intList.add(45);
        intList.add(23);

        int max=intList.get(0);
        for (int i =0;i<intList.size();i++) {
            if (intList.get(i)>max) {
                max=intList.get(i);
            }
        }
        System.out.println("maximum number is :" + max);

        List<Integer> integers=new ArrayList<>();
        integers.add(21);
        integers.add(65);
        integers.add(33);
        integers.add(14);
        integers.add(27);
        integers.add(21);
        System.out.println(integers);
        int maxValue=integers.get(0);
        for(int i=1;i< integers.size();i++){
            if (integers.get(i)>maxValue)
                maxValue= integers.get(i);

        }
        System.out.println(maxValue);

        List<Integer> integers1=new ArrayList<>();
        integers1.add(21);
        integers1.add(33);
        integers1.add(14);
        integers1.add(27);
        integers1.add(38);
        integers1.add(21);
        System.out.println(integers1);
        List<Integer> integers2=new ArrayList<>();
        integers2.add(21);
        integers2.add(33);
        integers2.add(14);
        integers2.add(27);
        integers2.add(38);
        integers2.add(21);
        System.out.println(integers2);
        System.out.println(integers2.remove(2));
//        int minvalue=integers2.get(0);
        for(int i=0;i< integers2.size();i++){
            for (int j=i+1;j<integers2.size();j++){
                if (integers2.get(i).equals(integers2.get(j))){
                    integers2.remove(j);
                }
            }
        }
        System.out.println(integers2);
        List<Integer> list6 = new ArrayList<>();
        list6.add(12);
        list6.add(98);
        list6.add(12);
        list6.add(89);
        list6.add(98);
        int duplicate= list6.get(0);
        for (int i=0;i<list6.size();i++){
            if (duplicate==list6.get(i)){
                list6.remove(i);
                duplicate++;
            }
        }
        System.out.println(list6);
        List<String> strings = Arrays.asList("USA","India");
        System.out.println(strings);

        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Sharath"));
        people.add(new Person(1, "Sharath"));
        System.out.println(people);

    }


    }


