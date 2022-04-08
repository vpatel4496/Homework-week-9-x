package homework;

import java.util.Scanner;

/*  Palindrome Number
*   Write a method called isPalindrome with one int parameter called number.
*   The method needs to return a boolean.
*   It should return true if the number is a plindrome number otherwise it should return false.
*   Check the tips below for more info about palindromes.
*   Example Input/Output
*   isPalindrome (-1221); -> should return true
*   isPalindrome (707); -> should return true
*   isPalindrome (11212); -> should return false because the reverse is 21211 and that is not equal to 11212.
*   Tip: What is a palindrome number? A palindrome number is a number which when reversed is equal to the original n
*   for example: 121, 12321, and 1001 etc.
*   Tip: Logic to check a palindrome number
*   Find the reverse of the given number. Store it in some variable, say reverse. Compare the number with the reverse.
*   If both are the same then the number is a palindrome otherwise it is not.
*   Tip: LOGIC TO REVERSE A NUMBER
*   Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
*   Extract the last digit of the given number by performing the modulo division (remainder).
*   Store the last digit to some variable say lastDigit = num % 10.
*   Increase the place value of reverse by one.
*   To increase place value multiply the reserve variable by 10 e.g. reverse = reverse * 10.
*   Add lastDigit to reverse.
*   Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10.
*   Repeat steps until the number is not equal to ( or grater than) zero.
*   A while loop would be good for this coding exercise.
*   Tip: Be careful with negative number, you will need a parameter for comparing a reversed number
*   Tip: Be careful with reversing a number, you will need a parameter for comparing a reversed number
*   with the starting number (parameter).
*   NOTE: The method isPalindrome needs to be defined as public static
*
* */
public class PalindromeNumber {
    public static boolean isPalindrome(int number){
        // convert negative number to positive number
        if (number < 0){
            number = -number;
        }
        int lastDigit, reverse = 0, temp;
        temp = number;
        while (number > 0){
            // Stores the last digit
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        return reverse == temp;
    }
    public static void main(String[] args){
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter any number: ");
        int a = scanner.nextInt();
        boolean check = isPalindrome(a);
        // Check number is Palindrome or not
        if(check)
            System.out.println("Number is Palindrome");
        else;
        System.out.println("Number is not Palindrome");
        scanner.close();
    }
}
