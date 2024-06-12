package com.librarymanagementsystem;

import java.util.Scanner;

public class LoginMain {

    public static void main(String[] args) {
        String Username = "user";
        String Password = "1234";
        String Admin = "admin";
        String PasswordAdmin = "1234";
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Username: ");
        String user = input.next();

        System.out.println("Enter Password: ");
        String pass = input.next();

        if (user.equals(Username) && pass.equals(Password)) {
            System.out.println("Access Granted! Welcome, User!");
        } else if (user.equals(Admin) && pass.equals(PasswordAdmin)) {
            System.out.println("Access Granted! Welcome, Admin!");
        } else if (user.equals(Username) || user.equals(Admin)) {
            System.out.println("Invalid Password!");
        } else if (pass.equals(Password) || pass.equals(PasswordAdmin)) {
            System.out.println("Invalid Username!");
        } else {
            System.out.println("Invalid Username & Password!");
        }

        input.close();
    }
}
