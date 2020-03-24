package com.joptionpane;

import javax.swing.*;

public class ReadJOptionpane
{
    public static void main(String[] args)
    {
        String name;
        String surname;
        name= JOptionPane.showInputDialog("Please input your name: ");
        surname=JOptionPane.showInputDialog("Please input your surname: ");
        JOptionPane.showMessageDialog(null, name + " " + surname);
        //JOptionPane.showMessageDialog();
        int first;
        int second;
        String input;
        input=JOptionPane.showInputDialog("Enter the first number");
        first=Integer.parseInt(input);
        input=JOptionPane.showInputDialog("Enter the second number");
        second=Integer.parseInt(input);
        double average=(first+second)/2.0;
        JOptionPane.showMessageDialog(null,"Average: "+average);
    }
}
