public class average_of_even_numbers {
/*
Author: Anthony Barker
Student ID: 10981589
Git Handle: https://github.com/dcitbarker/dcit104

ASSIGNMENT: WRITE A PROGRAM TO CALCULATE THE AVERAGE OF ALL EVEN INTEGERS BETWEEN 1 AND 10,000

Description: I used a simple for-loop and an if-condition to check if the number is divisible by 2 without a
remainder. I used another variable to hold the total even numbers found to calculate for the average
 */
    public static void main(String[] arg) {
        int sum = 0;
        int total = 0;
        for(int i = 1; i < 10000; i++) {
            if(i%2 == 0) {
                total++;                // track the total even numbers found - for the average
                sum += i;
            }
        }
        int average = sum / total;
        System.out.println("Average of all even numbers from 1 - 10,000: " + average);
    }
}
