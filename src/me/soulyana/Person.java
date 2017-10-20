package me.soulyana;

import java.util.ArrayList;

public class Person {
    private String firstName, lastName, email;
    private ArrayList<Education> edArrayList;
    private ArrayList<Experience> expArrayList;
    private ArrayList<Skills> skillsArrayList;

    //constructor that creates arraylist objs
    public Person() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        edArrayList = new ArrayList<Education>();
        expArrayList = new ArrayList<Experience>();
        skillsArrayList = new ArrayList<Skills>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Education> getEdArrayList() {
        return edArrayList;
    }

    public void setEdArrayList(ArrayList<Education> edArrayList) {
        this.edArrayList = edArrayList;
    }

    public ArrayList<Experience> getExpArrayList() {
        return expArrayList;
    }

    public void setExpArrayList(ArrayList<Experience> expArrayList) {
        this.expArrayList = expArrayList;
    }

    public ArrayList<Skills> getSkillsArrayList() {
        return skillsArrayList;
    }

    public void setSkillsArrayList(ArrayList<Skills> skillsArrayList) {
        this.skillsArrayList = skillsArrayList;
    }

    //methods to add to different sections of resume
    public void addEd(Education aEd) {
        edArrayList.add(aEd);
    }

    public void addExp(Experience aExp) {
        expArrayList.add(aExp);
    }

    public void addSkill(Skills aSkill) {
        skillsArrayList.add(aSkill);
    }
}
