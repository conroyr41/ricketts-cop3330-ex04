/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Conroy Ricketts
 */

import java.util.Scanner;

public class MyClass
{
    public static void main(String[] args)
    {
        System.out.println("Enter a noun!");

        Scanner scan = new Scanner(System.in);
        String noun = scan.next();

        System.out.println("Enter a verb!");

        scan = new Scanner(System.in);
        String verb = scan.next();

        System.out.println("Enter an adverb!");

        scan = new Scanner(System.in);
        String adverb = scan.next();

        System.out.println("Enter an adjective!");

        scan = new Scanner(System.in);
        String adjective = scan.next();

        System.out.println(String.format("%s %s to the store rather %s with his %s dog.", noun, verb, adverb, adjective));
    }
}
