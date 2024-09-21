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
        int sum=0;
        int[] numbers={1,4,8,9,3};
        for (int i =0;i< numbers.length;i++){
            sum = numbers[i]+sum;

        }
        System.out.println("sum is :"+sum);

    }
    static void largestElement(){
        int[] numbers = {45,87,23,98};
        int max =numbers[0];
        for (int i:numbers) {
            if (max<i){
                max=i;
            }

        }
        System.out.println("Maximum number is :"+max);


    }
    static void evenArray(){
        int[] numbers = {23,45,86,90,21};
        int rem;
        int even =0;
        for (int x:numbers) {
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

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 1; i < arr.length; i++) {
            rem = arr[i] % 2;
            if (rem == 0) {
                System.out.println(arr[i]);

            }


        }


    }
    static void oddNumbers(){
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        int rem;
        for(int i=0;i<num.length;i++){
            rem=num[i]%2;
            if(rem==1){
                System.out.println("odd numbers :"+num[i]);
            }

            else
                System.out.println();

        }
    }
 static  void sumOfArrays()   {
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 4, 5, 6 };
       // int[] array3 = new int[array1.length+array2.length];

        int j=0;
        int sum1=0;
        int sum2=0;
        int diff;
     for(int i=0;i<array1.length;i++){
         sum1= array1[i]+sum1;

     }
     for(int i =0;i<array2.length;i++){
         sum2= array2[i]+sum2;
     }

        System.out.println(sum2-sum1);
    }

    public static void main(String[] args){
      //  intArray();
      //  stringArray();
        sumOfArray();
      //  largestElement();
      //  evenArray();
      //  evenElement();
      //  numbersDivisibleBy10();
      //  oddNumbers();
        sumOfArrays();
    }
}
