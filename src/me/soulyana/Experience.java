package me.soulyana;

import java.util.ArrayList;

public class Experience {
    private String jobTitle, companyName, startDate, endDate;
    ArrayList<String> dutyArrayList = new ArrayList<String>();

    public Experience() {
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ArrayList<String> getDutyArrayList() {
        return dutyArrayList;
    }

    public void setDutyArrayList(ArrayList<String> dutyArrayList) {
        this.dutyArrayList = dutyArrayList;
    }

    public void setDuty(String s) {
        dutyArrayList.add(s);
    }
}

