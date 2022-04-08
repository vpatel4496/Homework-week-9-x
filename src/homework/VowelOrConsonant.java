package homework;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void checkVowelOrConsonant(String letter) {
            //checks length of String
            //if user enters more than 1 character an error message is printed
            if (letter.length() > 1) {
                System.out.println("Error. Not a single character");
                //if user enters a symbol
            } else if (!(isItALetter(letter))) {
                System.out.println("Error. Not a letter. Enter uppercase or lowercase letter");
            } else if (letter.equals("a") || letter.equals("e") || letter.equals("i")
                    || letter.equals("o") || letter.equals("u")) {
                System.out.println("Input letter is a vowel");
            } else {
                System.out.println("Input letter is a consonant");
            }
        }

        //This method will check is it a letter or not?
        public static boolean isItALetter(String l) {
            return l.charAt(0) > 96 && l.charAt(0) < 123;
        }

        public static void main(String[] args) {
            //Scanner declaration for reading input form console
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any character: ");
            String str = scanner.next().toLowerCase();
            //calling static method directly
            checkVowelOrConsonant(str);
            // closing the scanner object
            scanner.close();
        }
    }
