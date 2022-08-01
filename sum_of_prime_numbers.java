/*
Author: Anthony Barker
Student ID: 10981589
Git Handle: https://github.com/dcitbarker/dcit104
Description: Code to calculate the sum of all prime numbers from 1 to a given number
Note: I decided to take the number from the user. No checks were done for entering valid numbers yet.
I also used held everything in a while loop to keep the program running unless the user terminates it.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sum_of_prime_numbers {
    public static void main(String[] arg) throws IOException {

        boolean tryAgain = true;
        System.out.print("Enter Any Positive Whole Number: ");
        while(tryAgain) {
            int sum = 0;
            StringBuilder primes_found = new StringBuilder();
            InputStreamReader read = new InputStreamReader(System.in);  // take number from user
            BufferedReader br = new BufferedReader(read);
            int number = Integer.parseInt(br.readLine());
            if(number == 0) {
                tryAgain = false;
                System.out.println("Thank You!");
            }
            else {
                for(int i = 1; i <= number; i++) {          // iterate through the number
                    if(isPrime(i)) {
                        sum += i;
                        primes_found.append(" - ").append(i);
                    }
                }
                System.out.println("The Sum of Prime Numbers from 1 to " + number + " is: " + sum);
                System.out.println("Prime Numbers Found: " + primes_found);
                System.out.print("\nEnter Another Number or 0 to exit: ");
            }
        }
    }

    // for clarity, I created a function to hold the checks on the prime number
    private static boolean isPrime(int num) {
        if(num < 2)                              //Eliminate 1 and zero - no negative numbers allowed also
            return false;

        if (num % 2 == 0)                        // Account for 2, though even number is a prime
            return num == 2;                     // FALSE if it is divisible by 2 but TRUE if it is 2

// this part of the code will only run if it is an odd number
// if the number can be divided by any number except 1 and itself, it is an odd number but not a prime number
        for (int i = 3; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;        // definitely a PRIME NUMBER
    }
}
