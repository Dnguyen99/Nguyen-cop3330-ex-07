/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dylan Nguyen
 */

package com.company;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the room in feet? ");
        int length = input.nextInt();
        System.out.println("What is the width of the room in feet?" );
        int width = input.nextInt();
        System.out.println("You entered dimensions of " +length+ " by " +width+ ".");

        int area = length * width;
        System.out.println("The area is \n" +area+ " feet");

        double conversionFactor = area * 0.09290304;
        System.out.println(String.format("%.3f", conversionFactor)+ " square meters.");
    }
}
