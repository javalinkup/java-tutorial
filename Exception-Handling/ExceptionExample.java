package com.java.javakeywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream= null;
        try {
            fileInputStream = new FileInputStream("C:/Users/HP/Documents/New folder/java-keywords3.txt");
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        int m ;
        try {
            if(fileInputStream!= null)
            while ((m = fileInputStream.read()) != -1) {
                System.out.println((char) m);
            }
        }catch (IOException io){
            System.out.println("Ioexception" +io);
        }

    }


}
