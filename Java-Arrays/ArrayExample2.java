package com.java.arrays;

import java.util.Arrays;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] i = {23,45,86,90,21};
        int [] result = evenArray(i);
        for(int j : result){
           System.out.println(j);
        }
        // occurance of element
        int[] countNumbers = {20,10,5,25,10,5};
        System.out.println(countOccurrence(countNumbers, 10));
        int[] singleOccurence = getSingleOccurance(countNumbers);
        for(int j: singleOccurence){
            System.out.println(j);
        }


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

    // Counting the occurance of an element
    //int numbers []= {20,10,5,25,10,5};
    //int number = 10

    static int countOccurrence(int[]numbers, int number){
       int count = 0;


        for(int num : numbers){
            if(num==number){ //10==10
                 count++;

            }
        }
        return count;

    }

    static int[] getSingleOccurance(int[] numbers){
        //int count =0;
        int [] count = new int[numbers.length]; //10,20,25 , 2,1,2
        for(int i=0;i< numbers.length;i++){
            for(int j=0;j< numbers.length; j++){
                if(numbers[i]== numbers[j]){
                    count[i]++;  //1,2,3,2,2 20,25
                }
            }
        }
      // count the number of single occuramce
       int singleCount=0;
        for(int c: count){
           if(c==1){
               singleCount++;
           }
        }
       int [] singleOccurance= new int[singleCount];
        int index =0;
        /*for(int n: numbers){
            if(n=)
            singleOccurance[index++] = numbers[n];
        }*/
        for(int i=0; i<numbers.length; i++){
            if(count[i] ==1){
                singleOccurance[index++] = numbers[i];
            }
        }
        return singleOccurance;

    }

}
