import java.util.ArrayList;
import java.util.List;

public class ListExample2 {
    public static void main(String[] args) {
        List<Integer>  integerList = new ArrayList<>(5);
        integerList.add(89); //0
        integerList.add(15);//1
        integerList.add(78);//2 10  ->  11
        integerList.add(89); //0
        integerList.add(15);//1
        integerList.add(78);
        integerList.add(89); //0
        integerList.add(15);//1
        System.out.println(integerList.hashCode());
        integerList.add(78);
        System.out.println(integerList.hashCode());
        integerList.add(68);
        System.out.println(integerList.hashCode());
        integerList.add(78);// 9th index
        integerList.add(68); //10 th index
        System.out.println(integerList.hashCode());
        integerList.add(78); //11th index
        System.out.println(integerList.hashCode());
        System.out.println(integerList.contains(15));
        System.out.println(integerList.isEmpty());
        if(!integerList.isEmpty() && integerList.contains(15)){
            integerList.add(23);
            integerList.add(2, 67);
            integerList.set(2, 89);
            System.out.println(integerList.size()); //rajkunar->9, sindhu-5, naveen-5
            integerList.clear();
            System.out.println(integerList.size()); // 10->naveen,sindhu-5, raz-9

        }
        System.out.println(integerList);

    }
}
