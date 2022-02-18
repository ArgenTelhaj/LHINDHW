package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PreviousJob {

    String jobPosition;
    String jobDescription;
    Date startDate;
    Date endDate;
    String company;

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.startDate = format.parse(startDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.endDate = format.parse(endDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "PreviousJob{" +
                "jobPosition='" + jobPosition + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", company='" + company + '\'' +
                '}';
    }
}
