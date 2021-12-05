package com.company;

import java.util.Scanner;// import scanner class
public class GradeScale
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your grade here: ");// prompt the user to enter their grade
        int grade = input.nextInt();// get the user's input and store it in a variable

        if(grade<25)
        {// if user's grade is less than 25, run the following statement
            System.out.println("F");// output "F" as the user's mark
        }// if statement closing bracket

        else if((grade>=25)&&(grade<45))
        {// else, if user's grade is greater than OR equal to 25, AND less than 45, run the following statement
            System.out.println("E");// output "E" as the user's mark
        }// else if statement closing bracket

        else if((grade>=45)&&(grade<50))
        {// else, if the user's grade is greater than OR equal to 45, AND less than 50, run the following statement
            System.out.println("D");// output "D" as the user's mark
        }// else if statement closing bracket

        else if((grade>=50)&&(grade<60))
        {// else, if the user's grade is greater than OR equal to 50, AND less than 60, run the following statement
            System.out.println("C");// output "C" as the user's mark
        }// else if statement closing bracket

        else if ((grade>=60)&&(grade<80))
        {// else, if the user's grade is greater than OR equal to 60, AND less than 80, run the following statement
            System.out.println("B");// output "B" as the user's mark
        }// else if statement closing bracket

        else if((grade>=80)&&(grade<=100))
        {// else, if the user's grade is greater than OR equal to 80, AND less than OR equal to 100, run the following statement
            System.out.println("A");// output "A" as the user's mark
        }// else if statement closing bracket

        else
        {// else, if user's input does not match any of the conditions above, run the followung statement
            System.out.println("Error! You did not enter the correct grade!");// output error message
        }// else statement closing bracket

    }// main method bracket
}// main class
