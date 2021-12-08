package com.company;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static List<Student> studentList = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Student Thomas = new Student("Thomas", "3");
        Thomas.addGrade(GradeType.AJ,3);
        Thomas.addGrade(GradeType.CJ,3);
        Thomas.addGrade(GradeType.MA,2);
        Student Anna = new Student("Anna","3");
        Anna.addGrade(GradeType.AJ, 1);
        Anna.addGrade(GradeType.CJ, 2);
        Anna.addGrade(GradeType.MA, 3);

        studentList.add(Thomas);
        studentList.add(Anna);

    }
}
