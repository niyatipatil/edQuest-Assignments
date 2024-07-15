
//package com.example.demo;
import java.util.Scanner;

public class BasicJavaLoop {

    // Main method - entry point of the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable declaration and initialization
        System.out.println("Enter Your Name: ");
        String name = scanner.nextLine();

        // Method call with parameter and receiving return value
        String greetingMessage = createGreeting(name);

        // Displaying the output
        System.out.println(greetingMessage);

        // Demonstrating control flow with a loop
        System.out.println("Enter a number to display its multiplication table: ");
        int number = scanner.nextInt();
        printMultiplicationTable(number);

        scanner.close();
    }

    public static String createGreeting(String name) {
        return "Hello, " + name + "! Welcome to the Basic Java Program.";
    }

    public static void printMultiplicationTable(int number) {
        System.out.println("Multiplication table for " + number + " :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}