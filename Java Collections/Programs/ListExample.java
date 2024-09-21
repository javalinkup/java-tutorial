import java.util.*;
import java.util.Collection;

public class ListExample {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Hyderabad");
        cities.add("Secunderabad-1");//
        cities.add("Nalgonda");
        cities.add("Hyderabad");
        System.out.println(cities);
        System.out.println(cities.get(0));// to get the values at index
        //System.out.println(cities.lastIndexOf("Hyderabad"));
        System.out.println(cities.size());
        System.out.println(cities.remove(3));
        System.out.println(cities);
        System.out.println(cities.size());
        Collections.sort(cities); // natural sorting A,B,C , 1,2,3...
       // sort(cities);
        System.out.println(cities);
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(10);
        integerList.add(85);
        integerList.add(2);
        System.out.println(integerList);
        Collections.sort(integerList);
        System.out.println(integerList);
        Integer [] array = {10,89,2,23};
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<array.length; i++){
            list.add(array[i]);
        }
        System.out.println(list);
        List<Integer> list1 = Arrays.asList(array); // 1,2,3,4,5.... 2,20,23,89
        System.out.println(list1);
        sortNumbers(list);

    }

    public static void sortNumbers(List<Integer> numberList){
        int n = numberList.size();

        for(int i=0; i<n-1; i++){   // 10.89,2,23  10<89  2<10
            int minIndex = i;
            for(int j= i+1; j<n;j++){
                if(numberList.get(j) < numberList.get(minIndex)){
                    minIndex =j;
                }
            }
            // swap the found minimum element with fist array element 1
            int temp = numberList.get(minIndex);
            numberList.set(minIndex, numberList.get(i) );
            numberList.set(i, temp);

        }

    }

     public static void sort(List<String> list){
        int n = list.size();
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(list.get(j).compareTo(list.get(j+1))>0){
                    String temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
     }
}
