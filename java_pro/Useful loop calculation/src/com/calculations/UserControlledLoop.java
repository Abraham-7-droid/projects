package com.calculations;

import javax.swing.*;

public class UserControlledLoop
{
    public static void main(String[] args)
    {
    int maxValue;
    String input= JOptionPane.showInputDialog("How high should i square the number");
    maxValue=Integer.parseInt(input);
    System.out.println("Number             Number Squared");
    System.out.println("---------------------------------");
    for (int i=1;i<=maxValue;i++)
    {
        System.out.println( i+ "  \t\t\t    " + i*i);
    }
    }
}
