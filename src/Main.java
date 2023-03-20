/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tramy
 */

public class Main {

    public static void main(String[] args) {

        PersonalManagement menu = new PersonalManagement();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose operation: ");
            System.out.println("Add employee (enter: ae)");
            System.out.println("Add customer (enter: ac)");
            System.out.println("Display employee information (enter: dae)");
            System.out.println("Display customer information (enter: dac)");
            System.out.println("Customer statistics (enter: cs)");
            System.out.println("Exit the program (enter: ea)");

            String input = scanner.nextLine();
            switch (input) {
                case "ae":
                    menu.addEmployee();
                    break;
                case "ac":
                    menu.addCustomer();
                    break;
                case "dae":
                    menu.displayEmployee();
                    break;
                case "dac":
                    menu.displayCustomer();
                    break;
                case "cs":
                    menu.customerStatistics();
                    break;
                case "ea":
                    menu.exitProgram(scanner);
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }
}