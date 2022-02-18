package com.company;

import javax.swing.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {


    public static void createEmp(List<Employee> employeeList) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        Employee emp = new Employee();
        PreviousJob previousJob= new PreviousJob();
        InputReader inputReader = new InputReader();
        inputReader.saveId(emp.id);
        inputReader.saveContact(emp.contact);
        inputReader.saveAddress(emp.address);
        System.out.println("Education" +
                "\n1: HighSchool" +
                "\n2: University");
      while (check) {
          switch (scanner.nextInt()) {
              case 1:
                  inputReader.saveEducationHs((HighSchool) emp.educationHs);
                  check= false;
                  break;
              case 2:
                  inputReader.saveEducation((University) emp.educationUn);
                  check = false;
                  break;
              default:
                  System.out.println("Enter correct input");
          }
      }
        check = true;
        while (check) {
            System.out.println("Add experience ? y/n");
            if (scanner.nextLine().equalsIgnoreCase("y") ) {
                inputReader.savePreviousJob(previousJob);
                emp.experience.addExp(previousJob);
            } else if (scanner.nextLine().equalsIgnoreCase("n")) {
                emp.experience.experienceCounter = emp.experience.list.size();
                check = false;
            } else {
                System.out.println("Enter Correct option! y/n");
            }
        }

        employeeList.add(emp);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean cont = true;
        int input;
        List<Employee> employeeList = new ArrayList<Employee>();

        InputReader reader = new InputReader();

        System.out.print("Employee System");

        while(cont) {
            System.out.println("Optons:\n" +
                    "1: View List\n" +
                    "2: Add emp\n" +
                    "3: Exit\n" +
                    "INPUT: ");

            input = scanner.nextInt();
            switch (input) {
                case 1:
                    for (Employee employee : employeeList) {
                        System.out.println(employee.toString());
                    }
                    break;
                case 2:
                    createEmp(employeeList);
                    break;
                case 3:
                    System.out.println("Exiting..");
                    cont = false;
                    break;
                default:
                    System.out.println("Enter correct number!");
            }
        }

    }
}



