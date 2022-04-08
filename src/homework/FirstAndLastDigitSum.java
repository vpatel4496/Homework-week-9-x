package homework;

/*
*   First And Last Digit Sum
*   Write a method name sumFirstAndLastDigit with one parameter of type int called number.
*   The method needs to find the first and last digit of the parameter number passed to the method, using loop
*   and return the sum of first and last digit of that number.
*   If the number is negative the than method needs to return  -1 to indicate an invalid value.
*   Example Input/Output
*   * sumFirstAndLastDigit (252); = should return 4, the first digit is 2 and the last digit is 2 which gives us 2+2 and the sum is 4.
*   * sumFirstAndLastDigit (257); = should return 9, the first digit is 2 and the last digit is 7 which gives us 2+7 and the sum is 9.
*   * sumFirstAndLastDigit (0); = should return 0, the first digit and the last digit is 0 since we only have 1 digit, which give us 0+0 and the sum is 0.
*   * sumFirstAndLastDigit (5); = should return 10, the first digit and the last digit is 5 since we only have 1 digit, which give us 5+5 and the sum is 10
*   * sumFirstAndLastDigit (-10); = should return -1, Since the parameter is negative and need to be positive.
*   NOTE:   The method sumFirstAndLastDigit needs to be defined as public static.
*/

import java.util.Scanner;

public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }
        int r, rev = 0, fd, ld, s;
        ld = number % 10;
        while (number > 0){
            r = number % 10;
            rev = rev * 10 + r;
            number = number / 10;
        }
        fd = rev % 10;
        s = fd + ld;
        return s;
    }
    public static void main (String[] args){
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter any number: ");
        int a = scanner.nextInt();
        System.out.println("The sum of first & last digit is: " + sumFirstAndLastDigit(a));
        // Closing the scanner object
        scanner.close();
    }
}
