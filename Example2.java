package com.company;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

//The purpose of this Example class is to teach you how to look at the call stack
//Run the code for example and purposely create an error, such as dividing by zero
//You will get an ArithmeticException. This is a way for helping you name the exceptions as well
//If you type in a string, you'll get InputMismatchException
//You'll also get a bunch of messages. This is the callstack. Starting from Main, if you go up,
//You'll be able to "trace" what the program tried to run. It goes deep into the scanner class.

public class Example2 {

    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        } catch (ArithmeticException | NoSuchElementException e) {
            //After adding in the bitwise operator | and then "NoSuchElementException e"
            // I was able to comment the catches at the bottom in method divide
            //Also the notice the need for only one e
            System.out.println(e.toString()); //reads out the exception in a string. No Red! =)
            System.out.println("Unable to perform division");
            //The above code will be read IN ADDITION to the
            //throw "Attempted to divide by zero."
        }

    }


    private static int divide() {
        int x, y;
  //      try {
            x = getInt();
            y = getInt();
            System.out.println("x is " + x + ", y is " + y);
            return x / y;
     /*   } catch(NoSuchElementException e) {
            throw new NoSuchElementException("no suitable input");
        } catch(ArithmeticException e) {
            throw new ArithmeticException("Attempted to divide by zero");
        }*/
        //What these throws do is actually give you a message when the
        //exception is caught. Note that you have to be specific in
        //what the exception is.
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        //The following allows user another chance to put in an integer.
        //If I was making a program, I'd love to have something like this
        //Possibly, insert something like this in my web application
        while(true) { //doing a while(true) is an infinite loop
            try {
                return s.nextInt();
            } catch(InputMismatchException e) {
                //go round again. Read past the end of the line in the input first.
                s.nextLine();
                System.out.println("Please enter a number using only the digits 0 to 9 ");
            }
        }


    }
}

//Throwable calls the fullstack trace
// Ctrl + D makes the NoSuchElementException happen