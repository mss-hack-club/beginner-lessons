package com.company;

import java.util.Scanner;// import scanner class
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number from 0-10");// prompt the user to enter a number from 1 to 10
        int i = input.nextInt();// get user's input and store it in a variable

        while(i<=10)
        {// as long as user's number is less than OR equal to 10, run the following loop
            System.out.println(i);// print out the vlaue stored in variable "i"
            i = i +1;// increment the value stored in "i" and update the variable 
        }// while loop bracket

    }// main method bracket
  
}// main class
