package com.company;

public class University extends Education{

    String fieldOfStudy =" ";
    double gpa = 0;

//    public University(String fieldOfStudy, double gpa) {
//        this.fieldOfStudy = fieldOfStudy;
//        this.gpa = gpa;
//    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public  void setFieldOfStudyUn(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "University{" +
                "fieldOfStudy='" + fieldOfStudy + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
