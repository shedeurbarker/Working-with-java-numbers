/*
Author: Anthony Barker
Student ID: 10981589
Git Handle: https://github.com/dcitbarker/dcit104

ASSIGNMENT: WRITE A FUNCTION THAT COMPUTES THE FACTORIAL OF A NUMBER

Description: I used a for loop initially but Sir Michael advised I used recursion instead - it worked like a charm
 */
public class number_factorial {
    public static void main(String[] arg) {
        int num = 10;
        System.out.println("Factorial of a given number is: " + factorial(num));
    }

    static int factorial(int number) {
        if(number > 0)
            return number * factorial(number - 1);
        else
            return 1;
    }
}

