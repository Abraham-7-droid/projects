package com.input.scanner;

import java.util.Scanner;

public class ReadingInput
{
    public static void main(String[] args)
    {
        int first;
        int second;
        Scanner br =new Scanner(System.in);
        System.out.println("Enter first number");
        first=br.nextInt();
        System.out.println("Enter second number");
        second=br.nextInt();
        double average=(first+second)/2.0;
        System.out.println("Average= "+average);
        String name;
        br.nextLine();
        System.out.println("Enter your name");
        name=br.nextLine();
    }
}
