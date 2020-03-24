package com.calculations;

import javax.swing.*;
import java.text.DecimalFormat;

public class RunningTotals
{
    public static void main(String[] args)
    {
        int days;
        double sales;
        double totalsales=0.0;
        String input= JOptionPane.showInputDialog("For how many days do you have sales" +"figures?");
        days=Integer.parseInt(input);
        DecimalFormat dollar=new DecimalFormat("#####.00");
        for(int count=1;count<=days;count++)
        {
            input=JOptionPane.showInputDialog("Enter the sales for the day " + count);
            sales=Double.parseDouble(input);
            totalsales=totalsales+sales;
        }
        JOptionPane.showMessageDialog(null,"The total sales are $ :"+dollar.format(totalsales));
        System.exit(0);
    }
}
