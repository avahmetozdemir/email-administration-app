package emailapp;

import java.util.Scanner;

public class Email  {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    //Constructor: to receive the first and last name

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED "  + this.firstName+ " " +this.lastName);

        //Call a method asking for the department - and return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
    }


    //Ask for the department
    private String setDepartment(){
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department code : ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if(departmentChoice == 1){
            return "sales";
        } else if (departmentChoice == 2) {
            return "dev";

        } else if (departmentChoice == 3) {
            return "acct";
        }else {
            return "";
        }
    }

    //Generate a random password

    //Set the mailbox capacity

    //Set the alternate email


    //Change the password



}
