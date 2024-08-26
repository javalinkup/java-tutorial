package com.java.javakeywords;

import com.java.aamzon.BankEmployee;
import com.java.aamzon.Employee;

import java.util.ArrayList;

public class JavaKeywords {


    public static void main(String[] args) {
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
    }



    final static void run() {
        System.out.println("Final method running");
    }

    FinalClass finalClass = new FinalClass();
    /*finalClass.run();*/
    // Instance if
}
