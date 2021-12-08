package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student{

    private Map<GradeType, List<Integer>> studentsGrades;
    private String name;
    private String clazz;

    public Student(String name, String clazz) {
        this.studentsGrades = new HashMap<>();
        this.name = name;
        this.clazz = clazz;
    }

    public void addGrade(GradeType gradeType, int grade){
        if(!studentsGrades.containsKey(gradeType)){
            studentsGrades.put(gradeType, new ArrayList<>());
        }
        studentsGrades.get(gradeType).add(grade);
    }

    public Map<GradeType, List<Integer>> getStudentsGrades() {
        return studentsGrades;
    }

    public void setStudentsGrades(Map<GradeType, List<Integer>> studentsGrades) {
        this.studentsGrades = studentsGrades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
