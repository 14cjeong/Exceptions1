package com.company;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
//	int x = 98;
//	int y = 0;
//        System.out.println(divideLBYL(x, y));
//        System.out.println(divideEAFP(x, y));
//        System.out.println(divide(x, y));  // Should reveal an error.
        int x = getInt(); // -- here you can try getIntLBYL or getIntEAFP.
        System.out.println("X is " + x);
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    private static int getIntLBYL() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer ");
        String input = s.next();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }

        }
        if (isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int getIntEAFP() {
    Scanner s = new Scanner(System.in);
    System.out.println("Please enter an integer ");
    try {
        return s.nextInt();
    } catch(InputMismatchException e) {
        return 0;
    }
    }
    //LBYL vs. EAFP
    //Notice how this code is so much shorter. Whichever is more efficient is the one you should use.



    //This is the look before you leap method
    //Checks something before you execute
    private static int divideLBYL(int x, int y) {
        if(y != 0) {
            return x/y;
        } else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y) {
        try {
            return x/y;
        } catch(ArithmeticException e) {
            return 0;
        }
    }

    private static int divide(int x, int y) {
        return x / y;
    }

}

//More on exceptions here
//https://www.geeksforgeeks.org/exceptions-in-java/
