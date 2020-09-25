package com.fizzbuzz;
import java.util.Scanner;

public class Fizzbuzz {
    Scanner scaner = new Scanner(System.in);


    public void checkNumber(){
        int number =input();
        for(int i =1;i<=number;i++){
            if(i%15==0) System.out.println(i+"\tFizzBuzz");
            else if(i%3==0) System.out.println(i+"\tFizz");
            else if(i%5==0) System.out.println(i+"\tBuzz");
            else System.out.println("Number: "+i);

        }


    }

    public int input(){
        System.out.println("Number: ");
        while (!scaner.hasNextInt() )scaner.next();
        return scaner.nextInt();
    }

}
