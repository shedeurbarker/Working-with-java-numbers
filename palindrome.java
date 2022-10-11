/*
Author: Anthony Barker
Student ID: 10981589
Git Handle: https://github.com/dcitbarker/dcit104

ASSIGNMENT: WRITE A PROGRAM T CHECK IF A WORD IS A PALINDROME

Description: I simply decided to spell it backwards and compare with the original. Simple.
 */
public class palindrome {
    public static void main(String[] arg) {
        String word = "racecar";
        StringBuilder backward = new StringBuilder();
        String[] breakup = word.split("");

        int total = breakup.length;

// write the word backwards with a reverse index of the string array
        for(int i=1; i<=total; i++) {
                backward.append(breakup[total - i]);
        }

        if(word.equalsIgnoreCase(backward.toString()))
            System.out.println("The Word " + word + " is a Palindrome");
        else
            System.out.println("The Word " + word + " is NOT a Palindrome");
    }
}

