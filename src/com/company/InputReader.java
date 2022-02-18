package com.company;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class InputReader {

    static Scanner scanner= new Scanner(System.in);


//    String idName;
//    String idLName;
//    String nationality;
//    String cityOfBirth;
//    String personalIdNumber;
//
//    String email;
//    String number;
//    String facebook;
//    String instagram;
//    String linkedIn;
//
//    String qyteti;
//    String rruga;
//    int pallati;
//    int hyrja;
static Employee emp = new Employee();

//add regEx
    public static void saveEmployee(Employee emp){

    }
    public static void saveId(IDCard id){
        if (id.idName == null) {
            System.out.println("Enter employee name: ");
            id.setIdName(scanner.nextLine());
        }
        while (id.idLName == null) {
            System.out.println("Enter employee last name: ");
            id.setIdLName(scanner.nextLine());
        }
        while (id.nationality == null) {
            System.out.println("Enter employee nationality: ");
            id.setNationality(scanner.nextLine());
        }
        while (id.cityOfBirth == null) {
            System.out.println("Enter employee City of birth: ");
            id.setCityOfBirth(scanner.nextLine());
        }
        while (id.personalIdNumber == null) {
            System.out.println("Enter employee Personal ID  number: ");
            id.setPersonalIdNumber(scanner.nextLine());
        }

    }

    public static void saveContact(Contact contact){

        var checker = 'n';

        while (contact.email == null) {
            System.out.println("Enter employee email");
            contact.setEmail(scanner.nextLine());
        }

        while (contact.number == null) {
            System.out.println("Enter employee phone number");
            contact.setNumber(scanner.nextLine());
            while(contact.number.length()>10){
                System.out.println("Number must less than 10 digits");
                contact.setNumber(scanner.nextLine());
            }
        }

        System.out.println("Enter Facebook y/n?");


        if (scanner.nextLine().equals('y')) {
            while (contact.facebook == null) {
                System.out.println("Enter employee facebook");
                contact.setFacebook(scanner.nextLine());
            }
        }
        System.out.println("Enter Instagram y/n?");

        if (scanner.nextLine().equals('y')) {
            while (contact.instagram == null) {
                System.out.println("Enter employee instagram");
                contact.setInstagram(scanner.nextLine());
            }
        }

        System.out.println("Enter linkedIn y/n?");

        if (scanner.nextLine().equals('y')) {
            while (contact.linkedIn == null) {
                System.out.println("Enter employee linkedIn");
                contact.setLinkedIn(scanner.nextLine());
            }
        }


    }

    public static void saveAddress(Address address){


            while (address.qyteti == null) {
                System.out.println("Enter employee city: ");
                address.setQyteti(scanner.nextLine());
            }


        while (address.rruga == null) {
            System.out.println("Enter employee road: ");
            address.setRruga(scanner.nextLine());
        }


        while (address.pallati == -1) {
            System.out.println("Enter employee building: ");
            address.setPallati(scanner.nextInt());
        }


        while (address.hyrja == -1) {
            System.out.println("Enter employee apartment: ");
            address.setHyrja(scanner.nextInt());
        }
    }



    // TODO: 2/16/2022 Check inheritance **tbd
    public static void saveEducation( University edu){

        //while (edu.fieldOfStudy == null) {
            System.out.println("Enter employee field of study: ");
            edu.setFieldOfStudyUn(scanner.nextLine());
        //}
       // while (edu.gpa == -1) {
            System.out.println("Enter employee university GPA: ");
            edu.setGpa(scanner.nextDouble());
      //  }
    }

    public static void saveEducationHs( HighSchool edu){


            System.out.println("Enter High school Name: ");
            edu.setHighSchoolNameHs(scanner.nextLine());


            System.out.println("Enter employee Grade: ");
            edu.setGrade(scanner.nextDouble());

    }

    // TODO: 2/16/2022 fix dis: not adding experience counter and jobs wont display **Fixed
    public static void savePreviousJob(PreviousJob pj)  {

        while (pj.jobPosition == null) {
            System.out.println("Enter employee previous job position: ");
            pj.setJobPosition(scanner.nextLine());
        }

        while (pj.jobDescription == null) {
            System.out.println("Enter employee previous job description : ");
            pj.setJobDescription(scanner.nextLine());
        }

        while (pj.startDate == null) {
            System.out.println("Enter employee previous starting date: ");
            pj.setStartDate(scanner.nextLine());
        }

        while (pj.endDate == null) {
            System.out.println("Enter employee previous ending date: ");
            pj.setEndDate(scanner.nextLine());
        }

        while (pj.company == null) {
            System.out.println("Enter employee previous Company name: ");
            pj.setCompany(scanner.nextLine());
        }
    }




//    public static void createEmp(Employee emp){
//
//        System.out.println("Enter City of birth");
//        emp.id.setCityOfBirth(scanner.nextLine());
//
//        System.out.println("Last Name");
//        emp.id.setIdLName(scanner.nextLine());
//
//        System.out.println("First Name");
//        emp.id.setIdName(scanner.nextLine());
//
//        System.out.println("Personal Number");
//        emp.id.setPersonalIdNumber(scanner.nextLine());
//
//        System.out.println("Enter Nationality");
//        emp.id.setNationality(scanner.nextLine());
//    }

}
