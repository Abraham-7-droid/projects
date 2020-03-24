package com.calculations;

import javax.swing.*;

public class SentinalValues
{
    public static void main(String[] args)
    {
        int value;
        int doubleValue;
        String input= JOptionPane.showInputDialog("Enter the value to be doubled (0 to stop)");
        value=Integer.parseInt(input);
        while (value!=0)
        {
            doubleValue=value*2;
            JOptionPane.showMessageDialog(null,""+value+" doubled is "+doubleValue);
            input= JOptionPane.showInputDialog("Enter the value to be doubled (0 to stop)");
            value=Integer.parseInt(input);
        }
        System.exit(0);
    }
}
