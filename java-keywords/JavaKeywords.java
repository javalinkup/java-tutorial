package com.java.javakeywords;

import com.java.aamzon.BankEmployee;
import com.java.aamzon.Employee;

import java.util.ArrayList;

public class JavaKeywords {
    // null keyword
    String s = null;
    public int salary;
   static Employee e;

    public JavaKeywords() {
        this(2000);

    }
    public JavaKeywords(int salary) {
        System.out.println(salary);
    }



    public static void main(String[] args) {
        JavaKeywords javaKeywords = new JavaKeywords();
        //Catch
        try {
            int i = 50 / 0;

            char c = 'c';
        } catch (Exception e) {
            System.out.println("Catching the exception something went wrong");

        }






        // continue
        int i = 1;
        while (i <= 10) {
            if (i == 5) {
                i++;
                continue; //it will skip the rest of statment
            }
            System.out.println(i);
            i++;
        }

        // final keyword
        final int j = 100;
        JavaKeywords.run();

        //finally
        try {
            System.out.println("It is try block");
            // int value = 10/0;

        } finally {
            System.out.println("Its finally block");
        }
        // float
        float f = 10.5f; //default size is 4 bytes
        // Instance of
        JavaKeywords jk = new JavaKeywords();
        System.out.println(jk instanceof JavaKeywords);
        // new keyword
        Employee employee = new Employee();
        employee.getEmployeeName();
        System.out.println(e);
        m1();

    }


    final static void run() {
        System.out.println("Final method running");
    }

    FinalClass finalClass = new FinalClass();
    /*finalClass.run();*/

    // null keyword
    void getName() {
        salary = 220000;
        s = "John";
        if (s.equals("John")) {
            s = "John Werock";
        }
       // Null keyword
        if (e == null) {
            e = new Employee();
            // seet the values and get the values
        }

    }

    //private keyword
    private String name = "John";
    private void getEmployeeName(){

    }
    /*private JavaKeywords(){

    }*/
    // protected keyword
    protected  String companyName = "Amazon";
   // this keyword
   public void method1(JavaKeywords javaKeywords){
       this.getEmployeeName();
       getEmployeeName();
   }
    public void method2(){

        method1(this);
    }

    //throw
   static void m1(){
       int number=200;
       if(number> 100)
       throw new ArithmeticException("It si not valid number");
   }

}
