package com.example;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(9);
        fizzBuzz(25);
        fizzBuzz(15);
        fizzBuzz(4);
    }


    public static void fizzBuzz(int n)
    {
   
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FizzBuzz");
        }


        else if (n % 3 == 0) {
            System.out.println("Fizz");
        }


        else if (n % 5 == 0) {
            System.out.println("Buzz");
        }


        else {
            System.out.println(n);
        }
    }
}