package com.code.cmd.cmdrunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CmdRunnerApplication implements CommandLineRunner {

    final static String FIRST_MESSAGE = "Please type 'quit' to exit at anytime, press 'Enter' to continue";
    final static String SECOND_MESSAGE = "Select Application : \n * Press 1 to CAS RT \n * Press 2 to CAS BULK \n * Press 3 to CAS G3 \n * Type 'quit' to exit";
    final static String THIRD_MESSAGE = "Select Site \n 1) Site 1 \n 2) Site 2";

    public static void main(String[] args) {
        SpringApplication.run(CmdRunnerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println(FIRST_MESSAGE);

        String optionOne = scanner.nextLine();

        if (optionOne.equals("quit")) {

            System.exit(0);

        } else if (optionOne.isEmpty()) {

            System.out.println(SECOND_MESSAGE);

            if (scanner.hasNextLine()) {

                String optionTwo = scanner.nextLine();

                if (optionTwo.equals("1")) {

                    System.out.println(THIRD_MESSAGE);

                    if (scanner.hasNextLine()) {

                        String optionThree = scanner.nextLine();

                        System.out.println(optionThree);

                    }

                } else if (optionTwo.equals("2")) {

                    System.out.println(THIRD_MESSAGE);

                    if (scanner.hasNextLine()) {

                        String optionThree = scanner.nextLine();

                        System.out.println(optionThree);

                    }

                } else if (optionTwo.equals("3")) {

                    System.out.println(THIRD_MESSAGE);

                    if (scanner.hasNextLine()) {

                        String optionThree = scanner.nextLine();

                        System.out.println(optionThree);

                    }

                } else if (optionTwo.equals("quit")) {
                    System.exit(0);
                } else {
                    System.out.println("Bad Command .......");
                }

            }
        } else {
            System.out.println("Bad Command .......");
        }
    }
}
