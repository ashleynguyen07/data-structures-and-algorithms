
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tramy
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validation route = new Validation(10000);

        System.out.println("Enter the amount of garbage at each station in order by quantity (kg) as follows:");
        while (scanner.hasNextInt()) {
            int garbage = scanner.nextInt();
            route.addGarbage(garbage);
        }

        int cost = route.estimateCost();
        System.out.println("The total cost is " + (int) Math.ceil(cost / 10000.0) * 10000 + " VND");

    }
}
