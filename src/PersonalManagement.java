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
public class PersonalManagement {

    ArrayList<Employee> employees = new ArrayList<>();
    ArrayList<Customer> customers = new ArrayList<>();
    int employeeCount = 0;
    int customerCount = 0;

    public void addEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        String name = scanner.nextLine();
//        System.out.println("Enter employee gender (male/female): ");
//        String gender = scanner.nextLine();
//        while (!gender.equals("male") && !gender.equals("female")) {
//            System.out.println("Invalid input. Please enter employee gender (male/female): ");
//            gender = scanner.nextLine();
//        }
//lua chon gioi tinh
        System.out.print("Enter employee gender (male/female): ");
        String gender = scanner.nextLine();
        while (!ListOption.GENDER.contains(gender)) {
            System.err.print("Invalid input. Please enter employee gender (male/female): ");
            gender = scanner.nextLine();
        }
        System.out.println("Enter employee date of birth (dd/mm/yyyy): ");
        String dob = scanner.nextLine();
//        while (dob.length() != 10) {
//            System.out.println("Invalid input. Please enter employee date of birth (dd/mm/yyyy): ");
//            dob = scanner.nextLine();
//        }
// Split date of birth string into day, month, year
        String[] parts = dob.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

// Check if month is valid
        if (month < 1 || month > 12) {
            System.err.println("Invalid input. Please enter employee date of birth (dd/mm/yyyy): ");
            dob = scanner.nextLine();
        } // Check if day is valid based on the month
        else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day < 1 || day > 31)) {
            System.err.println("Invalid input. Please enter employee date of birth (dd/mm/yyyy): ");
            dob = scanner.nextLine();
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day < 1 || day > 30)) {
            System.err.println("Invalid input. Please enter employee date of birth (dd/mm/yyyy): ");
            dob = scanner.nextLine();
        } else if ((month == 2) && (day < 1 || day > 28)) {
            System.err.println("Invalid input. Please enter employee date of birth (dd/mm/yyyy): ");
            dob = scanner.nextLine();
        }

        while (dob.length() != 10) {
            System.err.print("Invalid input. Please enter employee date of birth (dd/mm/yyyy): ");
            dob = scanner.nextLine();
        }
//        System.out.println("Enter employee degree (intermediate/college/university): ");
//        String degree = scanner.nextLine();
//        while (!degree.equals("intermediate") && !degree.equals("college") && !degree.equals("university")) {
//            System.out.println("Invalid input. Please enter employee degree (intermediate/college/university): ");
//            degree = scanner.nextLine();
//        }
//lua chon bang cap
        System.out.print("Enter employee degree (intermediate/college/university): ");
        String degree = scanner.nextLine();
        while (!ListOption.DEGREE.contains(degree)) {
            System.err.print("Invalid input. Please enter employee degree (intermediate/college/university): ");
            degree = scanner.nextLine();
        }
        employeeCount++;
        Employee employee = new Employee("e" + employeeCount, name, gender, dob, degree);
        employees.add(employee);
        System.out.println("Employee added: " + employee);
    }

    public void addCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer name: ");
        String name = scanner.nextLine();
//        System.out.println("Enter customer gender (male/female): ");
//        String gender = scanner.nextLine();
//        while (!gender.equals("male") && !gender.equals("female")) {
//            System.out.println("Invalid input. Please enter customer gender (male/female): ");
//            gender = scanner.nextLine();
//        }
//lua chon gioi tinh
        System.out.print("Enter employee gender (male/female): ");
        String gender = scanner.nextLine();
        while (!ListOption.GENDER.contains(gender)) {
            System.err.print("Invalid input. Please enter employee gender (male/female): ");
            gender = scanner.nextLine();
        }
        System.out.println("Enter customer date of birth (dd/mm/yyyy): ");
        String dob = scanner.nextLine();
//        while (dob.length() != 10) {
//            System.out.println("Invalid input. Please enter customer date of birth (dd/mm/yyyy): ");
//            dob = scanner.nextLine();
//        }
// Split date of birth string into day, month, year
        String[] parts = dob.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

// Check if month is valid
        if (month < 1 || month > 12) {
            System.err.println("Invalid input. Please enter employee date of birth (dd/mm/yyyy): ");
            dob = scanner.nextLine();
        } // Check if day is valid based on the month
        else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day < 1 || day > 31)) {
            System.err.println("Invalid input. Please enter employee date of birth (dd/mm/yyyy): ");
            dob = scanner.nextLine();
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day < 1 || day > 30)) {
            System.err.println("Invalid input. Please enter employee date of birth (dd/mm/yyyy): ");
            dob = scanner.nextLine();
        } else if ((month == 2) && (day < 1 || day > 28)) {
            System.err.println("Invalid input. Please enter employee date of birth (dd/mm/yyyy): ");
            dob = scanner.nextLine();
        }

        while (dob.length() != 10) {
            System.err.print("Invalid input. Please enter employee date of birth (dd/mm/yyyy): ");
            dob = scanner.nextLine();
        }

//        System.out.println("Enter customer type (new/member/vip): ");
//        String type
//                = scanner.nextLine();
//        while (!type.equals("new") && !type.equals("member") && !type.equals("vip")) {
//            System.out.println("Invalid input. Please enter customer type (new/member/vip): ");
//            type = scanner.nextLine();
//        }
//lua chon loai khach hang
        System.out.print("Enter customer type (new/member/vip): ");
        String type = scanner.nextLine();
        while (!ListOption.CUSTOMER_TYPE.contains(type)) {
            System.err.print("Invalid input. Please enter customer type (new/member/vip): ");
            type = scanner.nextLine();
        }

        customerCount++;
        Customer customer = new Customer("c" + customerCount, name, gender, dob, type);
        customers.add(customer);
        System.out.println("Customer added: " + customer);
    }

    public void displayEmployee() {
        if (employees.isEmpty()) {
            System.out.println("There are no employees.");
        } else {
            System.out.println("Employee list:");
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }

    public void displayCustomer() {
        if (customers.isEmpty()) {
            System.out.println("There are no customers.");
        } else {
            System.out.println("Customer list:");
            for (Customer customer : customers) {
                System.out.println(customer);
            }
        }
    }

    public void customerStatistics() {
        int newCount = 0;
        int memberCount = 0;
        int vipCount = 0;

        for (Customer customer : customers) {
            switch (customer.getCustomerType()) {
                case "new":
                    newCount++;
                    break;
                case "member":
                    memberCount++;
                    break;
                case "vip":
                    vipCount++;
                    break;
                default:
                    break;
            }
        }

        System.out.println("Customer statistics:");
        System.out.println("New customers: " + newCount);
        System.out.println("Member customers: " + memberCount);
        System.out.println("VIP customers: " + vipCount);
    }

    public void exitProgram(Scanner scanner) {
        System.out.println("Do you want to exit the program (y/n)?");
        String input = scanner.nextLine();
        if (input.equals("y")) {
            System.out.println("Goodbye!");
            System.exit(0);
        }
    }

}
