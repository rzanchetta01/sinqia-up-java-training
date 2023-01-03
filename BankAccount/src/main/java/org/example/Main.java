package org.example;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bank Account creation system, please enter your name, agency, account number and initial balance");
        int accountNumber;
        sc.nextInt();

        String name;
        sc.nextLine();

        String agency;
        sc.nextLine();

        BigDecimal balance;
        sc.nextBigDecimal();

        sc.close();

        Arrays.stream(args).forEach(System.out::println);


    }
}