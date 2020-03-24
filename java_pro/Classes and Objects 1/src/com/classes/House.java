package com.classes;

public class House
{
    //private String typeOfWall;
    int noOfWindows;
    int noOfDoors;
    String typeOfRoof;
    String typeOfWall;

public House()
   {
       noOfDoors=0;
       noOfWindows=0;
       typeOfRoof=null;
       typeOfWall=null;
   }
public House(final int noOfWindows,final int noOfDoors,final String typeOfRoof,final String typeOfWall)
   {
    this.noOfWindows =noOfWindows;
    this.noOfDoors=noOfDoors;
    this.typeOfRoof=typeOfRoof;
    this.typeOfWall=typeOfWall;
   }
public int getnoOfWindows()
   {
       return noOfWindows;
   }
public void setnoOfWindows(final int noOfWindows)
   {
       this.noOfWindows=noOfWindows;
   }

    public static void main(final String[] args)
    {
       System.out.println("success");

    }
}
