package com.company;

import java.util.Scanner;

//The purpose of this Example class is to teach you how to look at the call stack
//Run the code for example and purposely create an error, such as dividing by zero
//You will get an ArithmeticException. This is a way for helping you name the exceptions as well
//If you type in a string, you'll get InputMismatchException
//You'll also get a bunch of messages. This is the callstack. Starting from Main, if you go up,
//You'll be able to "trace" what the program tried to run. It goes deep into the scanner class.

public class Example {

    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }

    private static int divide() {
        int x = getInt();
        int y = getInt();
        System.out.println("x is " + x + ", y is " + y);
        return x/y;
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        return s.nextInt();
    }
}
