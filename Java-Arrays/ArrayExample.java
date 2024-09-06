package com.java.arrays;

public class ArrayExample {
    public static void main(String[] args) {
        //declaration
        int [] eggs = {25,15,5,20,4,35, 'c'};
        int [] eggs2 = {25,15,5,20,35,20,6,90};
        int number =  printMinimumNumber(eggs);
        int number2 =  printMinimumNumber(eggs2);
        System.out.println(number+ " "+number2);
        largestElement();

        int [] numbers = new int[5];
        //initilization
        numbers[0]= 1;
        numbers[1]= 2;
        numbers[2]= 3;
        numbers[3]= 4;
        numbers[4]= 5;
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }



        System.out.println(eggs.length);//length
        // for(datatype variable: array)
        for(int x:eggs){
            System.out.println("keeping on plate" +x);
        }
        //0,1,2,3,4,5,6,7,8,9 indexes

        printCars();
    }
    static int printMinimumNumber(int [] numbers){
        int min =numbers[0];

        for(int value : numbers){
            if(min < value ){
              min =   value;
            }
        }
        return min;

    }

    static void printCars(){
        String [] cars= {"Volvo", "BMWF", "Mercedez", "ford", "Ferrari"};
        System.out.println(cars[6]);
       // String [] fCars = new String[cars.length];
        for(String car: cars ){
            if(car.toLowerCase().startsWith("f")){
              System.out.println(car);
            }
        }

    }
    static void largestElement() {
        int[] e = {45, 87, 23, 98};
        int max = e[0];
        for (int i : e) {
            if (max < i) {
                max = i;
            }

        }
        System.out.println("Maximum number is :" + max);
    }
    static int[] evenArray(int[] i){

        int even =0;

        for (int x:i) {
            if (x % 2 == 0) {
                /*even=x;*/
                even++;

            }
        }
            int eveNnumbers [] = new int[even];

            // store the evennumbers in new array
            int index =0;
             for(int x : i ){  //0-86 ,1-90
                 if(x% 2==0){
                     eveNnumbers[index++]=x;
                 }

             }
             return eveNnumbers;
        }


}
