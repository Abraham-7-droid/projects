package com.methods;

public class Methods
{
    public static void main(String[] args)
    {
        //A void method is one that simply perform a task and then terminates
        //System.out.println("This is a void method");

        //A value returning  method not only perform a task
        //but also send a value back to the code that called it
        //int number =Integer.parseInt("700");
      // printAverage(20,30);
       //double average=getAverage(30,30);
        //System.out.println("Average: "+average);
        //String fullName=fullName("abraham","george");
        //System.out.println(fullName);
        int value=200;
        if (isValid(value))
        {
            System.out.println("The value is in range");
        }
        else
        {
            System.out.println("The value is not inrange");
        }
    }

    /**
     * This method  print the average of two numbers
     * @param val1 first value
     * @param val2 second value
     */
    public static void printAverage(int val1,int val2)
    {
        double average =(val1+val2)/2.0;
        System.out.println("Average: "+average);
    }

    /**
     *
     * @param val1 first value
     * @param val2 second value
     * @return the average of 2 values
     */
    public static double getAverage (int val1,int val2)
    {
        double average=(val1+val2)/2.0;
        return average;
    }
    public static String fullName(String name,String surname)
    {
        String fullName=name+ " "+surname;
        return fullName;
    }
    //range between 1 and 100
    public static boolean isValid (int number)
    {
        boolean status;
        if (number >= 1 && number <= 100)
        {
            status = true;
        }
        else
        {
          status=false;
        }
        return status;
    }
}

