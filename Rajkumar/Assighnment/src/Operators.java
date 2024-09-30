//1.Write a Java program that performs the following operations using two pre-defined integers a and b:

import java.util.Arrays;

//Calculates and prints the sum, difference, product, quotient, and remainder of these two integers.
public class Operators {
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
//Whether x is greater than, less than, or equal to y.
//Whether x is not equal to y
//Create a Java program that compares two pre-defined integers x and y and prints:
        if (a!=b){
            if (b>a){
                System.out.println("b is greater than a");
            }else
                 System.out.println("a is less than b");

        }
        else
            System.out.println("a is equal to b");
    // condition to check whether the number is even or odd
      String s =  (a % 2 == 0) ? "even" : "odd";
      int c =56;
      System.out.println(a);
        System.out.println(b);
      System.out.println((a+b)*c);
        // a+b*c





    }
}