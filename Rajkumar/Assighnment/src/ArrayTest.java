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
    static void numbersDivisibleBy10(){
        int[] num = {10,34,50,60,56,87};
        int rem;
        for (int i =0;i< num.length;i++){
            rem=num[i]%10;
            if (rem==0){
                System.out.println("Numbers divisible by 10 :"+num[i]);
            }
        }

    }
    static void evenElement() {
        int rem;
        int count=0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 1; i < arr.length; i++) {
            rem = arr[i] % 2;
            if (rem == 0) {
                System.out.println(arr[i]);
                count++;

            }
            else
                System.out.println();

        }


    }

    public static void main(String[] args){
        intArray();
        stringArray();
        sumOfArray();
        largestElement();
        evenArray();
        evenElement();
        numbersDivisibleBy10();
    }
}
