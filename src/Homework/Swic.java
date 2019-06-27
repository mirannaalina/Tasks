package Homework;
/*
What will be printed by the following code?
        String command = "x";

        switch (command) {

        case "LS":
        System.out.println("list");
        return;

        case "CD":
        System.out.println("change directory");

default:
        System.out.println("wrong command");

        case "RUN":
        System.out.println("run command");

        case "RM":
        System.out.println("remove");
        }
        */
public class Swic {
    public static void main(String[] args) {


    String command = "x";

    switch (command) {

        case "LS":
            System.out.println("list");
            return;

        case "CD":
            System.out.println("change directory");

        default:
            System.out.println("wrong command"); //without break is moving to the next case.

        case "RUN":
            System.out.println("run command");

        case "RM":
            System.out.println("remove");


        }

    }

}
