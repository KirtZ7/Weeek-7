package scanner;

import java.util.Scanner;
public class Scanner_Class
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* System.out.println("Enter a String ");


        if (sc.hasNext("[A-Za-z]*")) {
            input = sc.next();
            System.out.println("You entered a string value " + input);
        } else {
            System.out.println("Please Enter a Valid Value");
        } */

        int number;
        do {
            System.out.println("Please enter a positive number!");
            while (!sc.hasNextInt()) { //check if int is entered
                System.out.println("That's not a number!"); //error message if not int
                sc.next(); // this is important! Tells program user needs to input new a entry
            }
            number = sc.nextInt();
        } while (number <= 0);
        System.out.println("Thank you! Got " + number);
    }
}
