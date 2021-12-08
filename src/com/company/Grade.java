package com.company;


public class Grade {
    private GradeType gradeType;
    private int value;

    public Grade(GradeType gradeType, int value) {
        this.gradeType = gradeType;
        this.value = value;
    }


    public GradeType getGradeType() {
        return gradeType;
    }

    public void setGradeType(GradeType gradeType) {
        this.gradeType = gradeType;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
