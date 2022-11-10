package emailapp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        System.out.println("Enter worker's first name and last name : ");
        Scanner firstname = new Scanner(System.in);
        Scanner lastname = new Scanner(System.in);
        Email email = new Email(firstname.nextLine(), lastname.nextLine());
        System.out.println(email);
    }
}
