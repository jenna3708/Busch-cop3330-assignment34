/*
 *  UCF COP3330 Fall 2021 Assignment 34 Solution
 *  Copyright 2021 Jenna Busch
 */

import java.util.Scanner;

public class exercise34 {

    public static void main(String[] args) {

        System.out.println("There are 5 employees:");
        String[] nameArray = new String[5];
        nameArray[0] = "David Qualls";
        nameArray[1] = "Carlos Duprey";
        nameArray[2] = "Ashley Lilly";
        nameArray[3] = "Brynn LaFrossia";
        nameArray[4] = "Philly Krunker";

        for(int i = 0; i < 5; i++)
        {
            System.out.println(nameArray[i]);
        }

        System.out.println("Enter an employee name to remove:");
        //create a scanner
        Scanner input = new Scanner(System.in);
        String remove = input.nextLine();

        //find the index of the name
        int index = -1;
        for(int i = 0; i < 5; i++)
        {

            if(remove.equals(nameArray[i]))
            {
                index = i;
            }
        }

        String[] nameArray2 = new String[4];
        for(int i = 0; i < 5; i++)
        {
            //check if the index has already been passed
            if(i > index)
            {
                nameArray2[i-1] = nameArray[i];
            }
            else if(i == index)
            {
                continue;
            }
            else
            {
                nameArray2[i] = nameArray[i];
            }
            //add element to list
        }


        System.out.println("There are 4 employees:");
        for(int i = 0; i < 4; i++)
        {
            System.out.println(nameArray2[i]);
        }
    }
}
