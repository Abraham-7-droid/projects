package com.calculations;

import javax.swing.*;

public class InputValidation
{
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog("Enter  a number b/w 1 to 100");
        int number=Integer.parseInt(input);
        while (number<1 || number>100)
        {
            JOptionPane.showMessageDialog(null," The The number is not valid");

            input=JOptionPane.showInputDialog("Please enter number in the range 1 through 100");
            number=Integer.parseInt(input);
        }
        JOptionPane.showMessageDialog(null,"That is correct");
    System.exit(0);
    }
}
