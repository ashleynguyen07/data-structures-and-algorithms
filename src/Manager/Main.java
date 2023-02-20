/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import Entity.History;
import Entity.Worker;
import java.util.ArrayList;

/**
 *
 * @author tramy
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Worker> lw = new ArrayList<>();
        Worker w1 = new Worker("1", "my", 19, 1000, "home");
        Worker w2 = new Worker("4", "bao", 19, 500, "home");
        lw.add(w1);
        lw.add(w2);

        ArrayList<History> lh = new ArrayList<>();
        //loop until user want to exit
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Manager.addWorker(lw);
                    break;
                case 2:
                    Manager.changeSalary(lw, lh, 1);
                    break;
                case 3:
                    Manager.changeSalary(lw, lh, 2);
                    break;
                case 4:
                    Manager.printListHistory(lh);
                    break;
                case 5:
                    return;
            }
        }
    }
}
