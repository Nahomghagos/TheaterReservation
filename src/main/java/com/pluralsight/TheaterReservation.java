package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class mts {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("please enter your full name?");
        String input= myScanner.nextLine().trim();
        int inputIndex= input.indexOf(" ");
        String fullName = " ";
        if (inputIndex == -1) {
            System.out.println("please write your name again");

        }else {
            String firstName = input.substring(0,inputIndex);
            String lastName = input.substring(inputIndex+ 1).trim() ;
            fullName= lastName.substring(0,1) + ", " + " " + firstName ;
            System.out.println(fullName);
        }
        System.out.println("when would you like thesse tickets? (MM/yyyy/dd)");
        String dateInput= myScanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy/dd");
        LocalDate reservDate= LocalDate.parse(dateInput,formatter);
        System.out.println(reservDate);

        System.out.println("how many tickets do you need?");
        String tickets = myScanner.nextLine();
        int tTickets = Integer.parseInt(tickets);
        String ifTickets= (tTickets > 1) ? tickets : "tickets";

        System.out.println(ifTickets+ " reserved for " + reservDate + " "+ "under" +" "+ fullName);








    }
}
