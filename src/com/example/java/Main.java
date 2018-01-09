package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String actualPassword = "chicken";
        String enteredPassword;

        System.out.println("PLEASE ENTER THE PASSWORD:");

        Scanner input = new Scanner(System.in);
        enteredPassword = input.nextLine();

        if(actualPassword.equals(enteredPassword)){
            System.out.println("You entered the right password!");
        } else {
            System.out.println("BEZZZ INCORRECT!");
        }

        int number = 5;
        int Number = 6;
    }
}
