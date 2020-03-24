package com.more.classes;

import java.util.Objects;

public class Student
{
    private String studentName;
    private long studentNumber;

    public Student(String studentName, long studentNumber)
    {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }
    public Student(Student student)
    {
        this.studentName=student.studentName;
        this.studentNumber=student.studentNumber;
    }

    public boolean equals(Student object)
    {
        if (this.studentNumber==object.studentNumber&&this.studentName.equals(object.studentName))
            return true;
        else
            return false;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public long getStudentNumber()
    {
        return studentNumber;
    }

    public void setStudentNumber(long studentNumber)
    {
        this.studentNumber = studentNumber;
    }
    @Override
    public String toString()
    {
        return  "Student information: \n"+
                "Student name- "+studentName+"\n"+
                "Student numbers- "+studentNumber;
    }
}
