
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tramy
 */
public class Manager {

    private static final Scanner in = new Scanner(System.in);

    // display menu
    public static int Menu() {
        System.out.println("1. Normal calculator");
        System.out.println("2. Calculator BMI index");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = checkLimitInput(1, 3);
        return choice;
    }

    // check user input number limit
    public static int checkLimitInput(int min, int max) {

        // loop input user until correct
        while (true) {
            try {
                int input = Integer.parseInt(in.nextLine().trim());
                if (input < min || input > max)
                    throw new NumberFormatException();
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Please enter input in range [" + min + "," + max + "]");
                System.out.print("Enter again: ");
            }

        }
    }

    // allow user input double number
    public static double checkInputDouble() {

        // loop input user until correct
        while (true) {
            try {
                double input = Double.parseDouble(in.nextLine().trim());
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Must be input double!");
                System.out.print("Enter again: ");
            }
        }
    }

    //allow user input number
    public static double inputNumber() {
        System.out.print("Enter number: ");
        double input = checkInputDouble();
        return input;
    }

    // allow user input operator
    public static String checkInputOperator() {

        // loop input user until correct
        while (true) {
            String input = in.nextLine().trim();
            if (input.isEmpty()) {
                System.err.println("Not Empty!");
            } else if (input.equalsIgnoreCase("+") || input.equalsIgnoreCase("*") || input.equalsIgnoreCase("/")
                    || input.equalsIgnoreCase("^") || input.equalsIgnoreCase("="))                     {
                    return input;
            } else {
                System.err.println("Please enter operator (+,-,*,/,^)");
            }
            System.out.println("Enter again: ");
        }
    }

    public static void normalCalculator() {
        double memory;
        System.out.print("Enter number: ");
        memory = checkInputDouble();
        while(true) {
            System.out.print("Enter operator: ");
            String operator = checkInputOperator();
            if(operator.equalsIgnoreCase("+")) {
                memory += inputNumber();
                System.out.println("Memory: " + memory);
            } else if(operator.equalsIgnoreCase("-")) {
                memory -= inputNumber();
                System.out.println("Memory: " + memory);
            } else if(operator.equalsIgnoreCase("*")) {
                memory *= inputNumber();
                System.out.println("Memory: " + memory);
            } else if(operator.equalsIgnoreCase("/")) {
                memory /= inputNumber();
                System.out.println("Memory: " + memory);
            } else if(operator.equalsIgnoreCase("^")) {
                memory = Math.pow(memory, inputNumber());
                System.out.println("Memory: " + memory);
            } else if(operator.equalsIgnoreCase("=")) {
                System.out.println("Result: " + memory);
                return;
            }
        }
    }

    //display result BMI status
    public static String BMIStatus(double bmi) {
        if (bmi < 19) {
            return "Under-standard.";
        } else if (bmi >= 19 && bmi < 25) {
            return "Standard.";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight.";
        } else if (bmi >= 30 && bmi < 40) {
            return "Fat-should lose weight";
        } else {
            return "Very fat - should lose weight immediately";
        }
    }

    //allow user BMI calculator
    public static void BMICalculator() {
        System.out.print("Enter Weight(kg): ");
        double weight = checkInputDouble();
        System.out.print("Enter Height(cm): ");
        double height = checkInputDouble();
        double bmi = weight*10000 / (height*height);
        System.out.printf("BMI number: %.2f\n", bmi);
        System.out.println("BMI Status: " + BMIStatus(bmi));
    }
}
