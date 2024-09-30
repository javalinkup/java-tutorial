import java.util.ArrayList;
import java.util.List;

public class ArraylistExample {
    public static void main(String[] args) {
        /*findMax();
        findMin();
        removeDuplicates();
       removeThirdElement();*/
        printDuplicateElements();
    }

    private static void findMin() {
        List<Integer> intList = new ArrayList<>();
        intList.add(90);
        intList.add(56);
        intList.add(45);
        intList.add(23);
        intList.add(123);

        int min=intList.get(0);
        for (int i =0;i<intList.size();i++) {
            if (intList.get(i)<min) {
                min=intList.get(i);
            }
        }
        System.out.println("minimum number is :" + min);
    }


    private static void findMax() {
        List<Integer> intList = new ArrayList<>();
        intList.add(90);
        intList.add(56);
        intList.add(45);
        intList.add(23);
        intList.add(123);

        int max=intList.get(0);
        for (int i =0;i<intList.size();i++) {
            if (intList.get(i)>max) {
                max=intList.get(i);
            }
        }
        System.out.println("maximum number is :" + max);
    }

   static void removeDuplicates(){
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(98);
        list.add(12);
        list.add(89);
        list.add(98);
        int duplicate= list.get(0);
        for (int i=0;i<list.size();i++){
            if (duplicate==list.get(i)){
                list.remove(i);
                duplicate++;
            }
        }
        System.out.println(list);
    }

   static void removeThirdElement(){
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(23);
        list.add(32);
        list.add(41);
        list.add(50);

        list.remove(2);
        System.out.println(list);
    }

    static void printDuplicateElements(){
        List<Integer> list = new ArrayList<>();
        list.add(90);
        list.add(98);
        list.add(23);
        list.add(23);
        list.add(89);
        list.add(90);
        list.add(98);

        int duplicate = list.get(0);
        List<Integer> trackList = new ArrayList<>();

        List<Integer> dupList = new ArrayList<>();

        for (int i =0;i<list.size();i++){
            int current =list.get(i);
            if (trackList.contains(current)) {
                dupList.add(current);

            }
            else {
                trackList.add(current);
            }
        }
        System.out.println(dupList);
    }
}
