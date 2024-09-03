//1.Write a Java program that performs the following operations using two pre-defined integers a and b:

import java.util.Arrays;

//Calculates and prints the sum, difference, product, quotient, and remainder of these two integers.
public class Main {
    public static void main(String[] args) {
       int a = 20;
       int b = 60;
       int sum = a+b;
       int diff= b-a;
       int product = a*b;
       int quot = b % a;
       int remainder = b/a;

       System.out.println("sum is "+sum);
        System.out.println("diff is "+diff);
        System.out.println("product is "+product);
        System.out.println(quot+" is quot");
        System.out.println("remainder is "+remainder);

        int[] ia = {32,54,56};
        int[] ib = {0,0,0};
        for (int i = 0;i<ia.length;i++){

            ia[i]=ia[i]+100;
            ib[i]=ia[i];
            System.out.println(ib[i]);
        }
        System.out.println(Arrays.toString(ib));

    }
}