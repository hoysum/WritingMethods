package com.company;
// Write a separate method to handle the division of the number and call that method in main.
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your number");
        int yourNumber = keyboard.nextInt();//store keyboard entry into yourNumber
        int result = divideNumber(yourNumber); //declare variable to hold value that is being passed back from method "divide Number"

        System.out.println("You entered " + yourNumber + ". Your number divided by 3 equals " +
                "" + result);

    }
//Create a method to handle the divide
    public static int divideNumber(int yourNumber) {
        int result = yourNumber/3; //formula
        return result; //passes back value of result to line 14

}

 }







        //int newNumber2 = (anyNumber / 3);
