package com.java.controlstatements;

import java.util.Arrays;

public class ControlStatements {

    //static int age = 17;
    // if else staements
    static String gender = "XYZ";
    public static void main(String[] args) {
        if(gender.equals("Female")){
            System.out.println("She is women");
        }
        else if(gender.equals("Male")){
            System.out.println("He is a man");
        }else{
            System.out.println("Not a man and Women");

        }
        // switch
        int number = 1;
        switch (number){
            case 0:
                System.out.println("Number is 0");
                break;
            case 1:
                System.out.println("Number 1");

        }

        // While

        int number2 = 1;

        while (number2 <=9){  // true
            System.out.println(number2);
            number2++;
        }
     // do-while
      int i =1;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=10);



        for(int j =1; j <=10; j++ ){
        System.out.println(":  "  +j);
        }
        double balance[] = {1550, 1500.90, 20000}; // August 24-25
        for(int bal=0; bal<balance.length ;bal++ ){

            balance [0] = 1700;
            balance[1] = 1800;
            balance[2] = 1900;
            System.out.println("Updated balance: ");
        }
        double totalbalance = 0;
        for (double v : balance) {
            totalbalance += v;
        }

        String [] cars = {"Benz", "Ford", "BMW"};
        for(String car : cars ){
            System.out.println(car);
        }

        System.out.println(totalbalance);

        Employee [] emp = new Employee[1];
        emp[0] = new Employee(123, "John");
        for(Employee em: emp ){
            System.out.println("EmpId :"+em.getEmpId());
            System.out.println("EmpName:" +em.getName());
        }

        Arrays.stream(emp).toList().forEach(emp1->{
            ///

            emp1.setEmpId(56666);
        });
    }
    // for- ecah-loop





}
