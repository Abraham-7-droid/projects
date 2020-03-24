package com.more.classes;

public class Subject
{
    private String subjectCode;
    private String subjectName;
    public Subject(String subjectCode,String subjectName)
    {
        this.subjectCode=subjectCode;
        this.subjectName=subjectName;
    }
    public Subject(Subject subject)
    {
        this.subjectCode=subject.subjectName;
        this.subjectName=subject.subjectName;
    }
    public boolean equals(Subject object)
    {
        if (this.subjectCode.equals(object.subjectName)&&this.subjectName.equals(object.subjectCode))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getSubjectCode()
    {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode)
    {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName()
    {
        return subjectName;
    }

    public void setSubjectName(String subjectName)
    {
        this.subjectName = subjectName;
    }

   /* public static void main(String[] args)
    {

    }

    */

    @Override
    public String toString() {
        return "Subject{" +
                "subjectCode='" + subjectCode + '\'' +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
