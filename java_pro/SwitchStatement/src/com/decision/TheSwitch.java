package com.decision;

import javax.swing.*;

public class TheSwitch
{
    public static void main(String[] args)
    {
     int number;
     String input = JOptionPane.showInputDialog("Please enter 1,2 or 3");
     number=Integer.parseInt(input);
     switch (number)
     {
         case 1:
             JOptionPane.showMessageDialog(null,"You entered 1");
             break;
         case 2:
             JOptionPane.showMessageDialog(null,"You entered 2");
             break;
         case 3:
             JOptionPane.showMessageDialog(null,"You entered 3");
             break;
         default:
             JOptionPane.showMessageDialog(null,"You did not enter 1,2 or 3!!");

     }
     char letter;
     input=JOptionPane.showInputDialog("Please enter a,b or c");
     letter=input.charAt(0);
       switch (letter)
       {
           case 'a':
           case 'A':
               JOptionPane.showMessageDialog(null,"You  entered a !!");
               break;
           case 'b':
           case 'B':
               JOptionPane.showMessageDialog(null,"You entered b !!");
               break;
           case 'c':
           case 'C':
               JOptionPane.showMessageDialog(null,"You entered c !!");
               break;
           default:
               JOptionPane.showMessageDialog(null,"You did not enter a,b or c!!");



       }
     System.exit(0);
    }
}
