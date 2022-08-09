/*
Author: Anthony Barker
Student ID: 10981589
Git Handle: https://github.com/dcitbarker/dcit104

ASSIGNMENT: WRITE A PROGRAM TO CALCULATE THE PEOPLE STANDARD DEVIATION OF AN ARRAY ARR OF SIZE 10

Description: I used 2 for loops, one for getting the sum of the number for the mean calculation and the other one for
calculating the sum of the deviations after they have been squared
 */
public class standard_deviation {
    static double sum_of_deviation, standard_deviation, mean_value, sum = 0; //same datatype and initial so declare together

    public static void main(String[] arg) {
        int[] arr = {2, 6, 4, 5, 10, 5, 10, 8, 6, 2};       // sample data
        for (int j : arr) {                                 // for getting the mean
            sum += j;
        }
        mean_value = sum/arr.length;

        for (int j : arr) {                                 // for getting the square of the mean deviation
            double each_deviation = j - mean_value;
            sum_of_deviation += (each_deviation * each_deviation);      // multiply by itself to get an absolute value
        }
        double summation = sum_of_deviation/arr.length;
        standard_deviation = Math.sqrt(summation);                      // Use Java method for taking the square
        System.out.println("Standard Deviation: " + (float)standard_deviation);
    }
}
