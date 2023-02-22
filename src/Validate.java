
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tramy
 */
public class Validate {

    private static final Scanner in = new Scanner(System.in);

    public static String checkInputString() {
        //loop until user input true value
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty.");
            } else {
                return result;
            }
        }
    }

    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                if (result <= 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException ex) {
                System.err.println("Input must be digit.");
            }
        }
    }

    public static double checkInputSalary() {
        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine());
                if (result < 0) {
                    System.err.print("Salary is greater than zero");
                } else {
                    return result;
                }
            } catch (NumberFormatException ex) {
                System.err.println("You must input digit.");
                System.out.print("Please input salary: ");
            }
        }
    }

    public static int checkInputNumberStudent() {
        System.out.print("Enter number student: ");
        int n = checkInputInt();
        return n;
    }

    public static Person inputPersonInfo() {
        System.out.println("Input Information of Person");
        System.out.print("Please input name: ");
        String name = checkInputString();
        System.out.print("Please input address: ");
        String address = checkInputString();
        System.out.print("Please input salary: ");
        double salary = checkInputSalary();
        return new Person(name, address, salary);
    }

    public static void swap(PersonWrapper person1, PersonWrapper person2) {
        Person temp = person1.p;
        person1.p = person2.p;
        person2.p = temp;
    }

    public static void sortBySalary(Person[] persons, PersonWrapper[] listPersonWrapper) {
        int n = persons.length;

        for (int i = 0; i < persons.length; i++) {
            listPersonWrapper[i] = new PersonWrapper(persons[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (listPersonWrapper[i].p.salary > listPersonWrapper[j].p.salary) {
                    swap(listPersonWrapper[i], listPersonWrapper[j]);
                }
            }
        }
        System.err.println("Sort sussess.");
        System.out.println("\n");

        return;
    }
}
