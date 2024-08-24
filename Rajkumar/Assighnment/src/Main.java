//1.Write a Java program that performs the following operations using two pre-defined integers a and b:

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


    }
}