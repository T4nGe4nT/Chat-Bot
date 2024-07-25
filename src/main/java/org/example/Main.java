package org.example;

import java.util.Scanner;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar now = Calendar.getInstance();

        greetUser();
        String name = askName(scanner);
        guessAge(scanner, now);
        countToNumber(scanner);
        testProgrammingKnowledge(scanner);
        tellStory(name);
        dayOfWeekPhrase(scanner);

        scanner.close();
    }

    public static void greetUser() {
        System.out.println("Hello! I'm your friendly chatbot.");
    }

    public static String askName(Scanner scanner) {
        System.out.print("What's your name? ");
        return scanner.nextLine();
    }

    public static void guessAge(Scanner scanner, Calendar now) {
        int currentYear = now.get(Calendar.YEAR);
        System.out.print("Enter your year of birth: ");
        int birthYear = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        int age = currentYear - birthYear;

        System.out.println("I guess you are " + age + " years old.");
    }

    public static void countToNumber(Scanner scanner) {
        System.out.print("Enter a number to count to: ");
        int number = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

    public static void testProgrammingKnowledge(Scanner scanner) {
        boolean correct = false;
        while (!correct) {
            System.out.println("What is the main method's return type in Java?");
            System.out.println("1. void");
            System.out.println("2. int");
            System.out.println("3. String");
            System.out.println("4. boolean");
            int answer = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (answer == 1) {
                System.out.println("Correct!");
                correct = true;
            } else {
                System.out.println("Try again.");
            }
        }
    }

    public static void tellStory(String name) {
        System.out.println("Once upon a time, there was a person named " + name + ". They wanted to fly to the moon.");
        System.out.println("When " + name + " made it to the moon they met an alien.");
        System.out.println("We are not sure if " + name + " made it back alive.");
    }


    public static void dayOfWeekPhrase(Scanner scanner) {
        System.out.print("Enter a number between 1 and 7 to get a day of the week phrase: ");
        int day = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        switch (day) {
            case 1:
                System.out.println("I'm a little buggy on Mondays.");
                break;
            case 2:
                System.out.println("Tuesdays are for tacos.");
                break;
            case 3:
                System.out.println("Wednesdays are for coding.");
                break;
            case 4:
                System.out.println("Thursdays are for thinking.");
                break;
            case 5:
                System.out.println("Fridays are for fun.");
                break;
            case 6:
                System.out.println("Saturdays are for relaxation.");
                break;
            case 7:
                System.out.println("Sundays are for resting.");
                break;
            default:
                System.out.println("Invalid number. Please enter a number between 1 and 7.");
                break;
        }
    }
}

