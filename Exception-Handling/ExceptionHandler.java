package com.java.exceptionhandler;

public class ExceptionHandler {
    public static void main(String[] args) throws Exception {

        try {
            int age = 17;
            if(age<18){
                throw new NotEligibleException("Not eligibility for Voting: ", age);
            }
        } catch (NotEligibleException e) {
          System.out.println(e.getMessage());
        }
    }
}