import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(123);
        vector.addElement(345);
        vector.addAll(Arrays.asList(89, 100));
        Collections.addAll(vector, 789, 900);
        System.out.println(vector);
        System.out.println(vector.remove(Integer.valueOf(345)));
        System.out.println(vector);
    }
}
