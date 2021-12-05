package com.company;

import java.util.Scanner;
public class GradeScale
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your grade here: ");
        int grade = input.nextInt();

        if(grade<25)
        {
            System.out.println("F");
        }

        else if((grade>=25)&&(grade<45))
        {
            System.out.println("E");
        }

        else if((grade>=45)&&(grade<50))
        {
            System.out.println("D");
        }

        else if((grade>=50)&&(grade<60))
        {
            System.out.println("C");
        }

        else if ((grade>=60)&&(grade<80))
        {
            System.out.println("B");
        }

        else if((grade>=80)&&(grade<=100))
        {
            System.out.println("A");
        }

        else
        {
            System.out.println("Error! You did not enter the correct grade!");
        }

    }// main method bracket
}// main class
