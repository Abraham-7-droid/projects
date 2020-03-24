package com.textfiles;

import java.io.IOException;
import java.io.PrintWriter;

public class WritingToFiles
{
    public static void main(String[] args) throws IOException
    {
        /*
        Creates the file and opens it
        if the file exist it will replace it
        */
        PrintWriter OutputFile=new PrintWriter("Output.txt");
        OutputFile.println("This is  line 1");
        OutputFile.println("This is  line 2");
        OutputFile.println("This is  line 3");
        OutputFile.close();
    }
}
