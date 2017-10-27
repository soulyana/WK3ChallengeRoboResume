package me.soulyana;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creates scanner to capture user input
        Scanner scan = new Scanner(System.in);

        //variables to hold user input
        String ans;

        //counter to keep track of inputs in each category
        int counter = 0;

        //creates arraylists to hold user inputs
        ArrayList<Person> personArrayList = new ArrayList<Person>();
        ArrayList<Education> educationArrayList = new ArrayList<Education>();
        ArrayList<Experience> experienceArrayList = new ArrayList<Experience>();
        ArrayList<Skills> skillsArrayList = new ArrayList<Skills>();

        do {
            //creates a person object to hold all user input
            Person p = new Person();

            //prompts user to put in info
            System.out.println("What is your first name?");
            p.setFirstName(scan.nextLine());
            System.out.println("What is your last name?");
            p.setLastName(scan.nextLine());
            System.out.println("What is your email?");
            p.setEmail(scan.nextLine());
            personArrayList.add(p);

            //Prompts user for education input
            do {
                System.out.println("Would you like to add education? (Y)es or (N)o");
                ans = scan.nextLine();
                if (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n")) {
                    System.out.println("Invalid entry. Please only enter Y for yes & N for no!");
                }
            } while (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n"));
            while (ans.equalsIgnoreCase("y") && (counter < 10)){
                Education ed = new Education();
                counter++;

                System.out.println("~~~~~Education~~~~~");
                System.out.println("Enter degree (acronym) earned: ");
                ed.setDegree(scan.nextLine());
                System.out.println("Enter major: ");
                ed.setMajor(scan.nextLine());
                System.out.println("Enter college/university: ");
                ed.setSchool(scan.nextLine());
                System.out.println("Enter graduation year: ");
                ed.setGradYear(scan.nextInt());

                //clears scanner
                scan.nextLine();

                educationArrayList.add(ed);

                do{
                    System.out.println("Would you like to add more education? (Y)es or (N)o");
                    ans = scan.nextLine();
                    if (counter > 9) System.out.println("Sorry, you've reached maximum limit to enter educational achievements!");
                    if (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n")) {
                        System.out.println("Invalid entry. Please only enter Y for yes & N for no!");
                    }
                } while (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n"));
            }

            //Prompts user for experience input
            do {
                System.out.println("Would you like to add experience? (Y)es or (N)o");
                ans = scan.nextLine();
                if (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n")) {
                    System.out.println("Invalid entry. Please only enter Y for yes & N for no!");
                }
            } while (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n"));
            while (ans.equalsIgnoreCase("y") && (counter < 10)) {
                Experience exp = new Experience();
                counter++;

                System.out.println("~~~~~Experience~~~~~");
                System.out.println("Enter job title: ");
                exp.setJobTitle(scan.nextLine());
                System.out.println("Enter company name: ");
                exp.setCompanyName(scan.nextLine());
                System.out.println("Enter start date (Month/Year): ");
                exp.setStartDate(scan.nextLine());
                System.out.println("Enter end date (Month/Year): ");
                exp.setEndDate(scan.nextLine());
                do {
                    System.out.println("Enter duty: ");
                    exp.setDuty(scan.nextLine());
                    do {
                        System.out.println("Would you like to add another duty? (Y)es or (N)o");
                        ans = scan.nextLine();
                        if (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n")) {
                            System.out.println("Invalid entry. Please only enter Y for yes & N for no!");
                        }
                    } while (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n"));
                } while (ans.equalsIgnoreCase("y"));

                experienceArrayList.add(exp);

                do {
                    System.out.println("Would you like to add more experiences? (Y)es or (N)o");
                    ans = scan.nextLine();
                    if (counter > 9) System.out.println("Sorry, you've reached maximum limit to enter work experiences!");
                    if (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n")) {
                        System.out.println("Invalid entry. Please only enter Y for yes & N for no!");
                    }
                } while (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n"));
            }

            //Prompts user for skills input
            do {
                System.out.println("Would you like to add skills? (Y)es or (N)o");
                ans = scan.nextLine();
                if (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n")) {
                    System.out.println("Invalid entry. Please only enter Y for yes & N for no!");
                }
            } while (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n"));

            while (ans.equalsIgnoreCase("y") && (counter < 20)) {
                Skills skills = new Skills();
                counter++;

                System.out.println("~~~~~Skills~~~~");

                System.out.println("Enter your skill: ");
                skills.setSkill(scan.nextLine());
                System.out.println("Enter your skill proficiency: ");
                skills.setSkillRanking(scan.nextLine());

                skillsArrayList.add(skills);

                do {
                    System.out.println("Would you like to add another skill? (Y)es or (N)o");
                    ans = scan.nextLine();
                    if (counter > 19) System.out.println("Sorry, you've reached maximum limit to enter skills!");
                    if (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n")) {
                        System.out.println("Invalid entry. Please only enter Y for yes & N for no!");
                    }
                } while (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n"));
            }

            //Validates user input for Yes or No to continue or end program
            do {
                System.out.println("Would you like to add another person to your Robo Resume? (Y)es or (N)o");
                ans = scan.nextLine();

                if (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n")) {
                    System.out.println("Invalid entry. Please only enter Y for yes & N for no!");
                }
            } while (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n"));
        } while(ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n"));


        //Display Robo Resume if user ends program
        if(ans.equalsIgnoreCase("n")) {
            System.out.println();
            System.out.println("=============================================================");

            for (Person eachPerson : personArrayList) {
                System.out.println(eachPerson.getFirstName() + " " + eachPerson.getLastName());
                System.out.println(eachPerson.getEmail());
                System.out.println();
                System.out.println("Education");

                for (Education eachEd : educationArrayList) {

                    System.out.println(eachEd.getDegree() + " in " + eachEd.getMajor() + ",");
                    System.out.println(eachEd.getSchool() + ", " + eachEd.getGradYear());
                    System.out.println();
                }

                System.out.println("Experience");
                for (Experience eachExp : experienceArrayList) {

                    System.out.println(eachExp.getJobTitle());
                    System.out.println(eachExp.getCompanyName() + ", " + eachExp.getStartDate() + " - "
                            + eachExp.getEndDate());
                    for(String eachDuty : eachExp.getDutyArrayList()) { //fix number of duties to be displayed
                        System.out.println("- Duty: " + eachDuty);
                    }
                    System.out.println();
                }
                System.out.println("Skills");
                for (Skills eachSkill : skillsArrayList){

                    System.out.println(eachSkill.getSkill() + ", " + eachSkill.getSkillRanking());
                }
            }
        }
    }
}