package com.company;

public class HighSchool extends Education{


    String highSchoolName;
    double grade = -1;


//    public HighSchool(String highSchoolName, double grade) {
//        this.highSchoolName = highSchoolName;
//        this.grade = grade;
//    }

    public String getHighSchoolName() {
        return highSchoolName;
    }

    public void setHighSchoolNameHs(String highSchoolName) {
        this.highSchoolName = highSchoolName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }


    @Override
    public String toString() {
        return "HighSchool{" +
                "highSchoolName='" + highSchoolName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
