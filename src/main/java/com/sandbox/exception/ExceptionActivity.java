package com.sandbox.exception;
import java.util.Scanner;
public class ExceptionActivity {
    public static void main(String[] args) {
        // try-catch
        try {
            // happy path - all this executes if no exception thrown
        } catch (Exception e) {
            // sad path - exception thrown
            e.printStackTrace();
        }
// do more stuff

// try-catch-catch - order of catch blocks matters per hierarchy
        try {
            // Do something here
        } catch (NullPointerException e) {
            // we'll catch the NullPointerException here and handle it differently than other exceptions
        } catch (Exception e) {
            e.printStackTrace();
        }
// do more stuff

        try {
            // do something
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // always do something
        }
// do yet more stuff

        try {
            // do something we don't expect to throw exceptions
        } finally {
            // but if we do, always execute code here
        }
// more stuff here

// java 7 multi-try-catch
        try {
            // lets do something here
        } catch (ArithmeticException | NullPointerException e) {
            // when either of the exceptions are thrown, do this
            e.printStackTrace();
        }
// yep, you guessed it - more stuff
        try(Scanner scanner1 = new Scanner(System.in)){
            // do something with scanner1
        }

        Scanner scanner2 = null;
        try {
            scanner2 = new Scanner(System.in);
        } finally {
            if (scanner2 != null) {
                scanner2.close();
            }
        }

        try (Scanner scanner3 = new Scanner(System.in)) {
            // do something with scanner3
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
