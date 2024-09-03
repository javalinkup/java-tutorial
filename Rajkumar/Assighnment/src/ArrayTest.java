import java.util.Arrays;
import java.util.OptionalInt;

public class ArrayTest {
    static void intArray(){
        int[] arr = {5,8,0,1,2};
        for (int x: arr) {
            System.out.println(x);
        }
    }
    static void stringArray(){
        String[] str ={"Apple","Banana","Pineapple","Mango"};
        for (String y:str) {
            System.out.println(y);
        }
    }
    static void sumOfArray(){
        int i;
        int[] j={1,4,8,9,3};
        i=j[0]+j[1]+j[2]+j[3]+j[4];
        System.out.println("sum is :"+i);
    }
    static void largestElement(){
        int[] e = {45,87,23,98};
        int max =e[0];
        for (int i:e) {
            if (max<i){
                max=i;
            }

        }
        System.out.println("Maximum number is :"+max);


    }
    static void evenArray(){
        int[] i = {23,45,86,90,21};
        int rem;
        int even =0;
        for (int x:i) {
            rem = x%2;
            if (rem!=1){
                even=x;//doubt how can i put two numbers
            }
        }
        System.out.println("even number is :"+even);
    }
    public static void main(String[] args){
        intArray();
        stringArray();
        sumOfArray();
        largestElement();
        evenArray();
    }
}
