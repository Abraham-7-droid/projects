package com.more.classes;

public class Driver
{
    public static void main(String[] args)
    {
    Subject subject1=new Subject("TPG10ab","technical programming 1");
  /*  Subject subject2=new Subject("TPG10ab","technical programming 1");

        if (subject1.equals(subject2))
        System.out.println("THe are same");
        System.out.println(subject1);

   */
        Student student1=new Student("Chuck Morris",123045);
        ExamPaper  paper =new ExamPaper(student1,subject1,100);

     //   System.out.println(paper);
        System.out.println("Subject code: "+paper.getSubject().getSubjectCode());
        System.out.println("Student number: " + paper.getStudent().getStudentNumber());
    }
}
