/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tramy
 */

public class Validation {
    
    private int totalGarbage;
    private int totalTime;
    private GarbageTruck truck;
    private int dumpCost;
    private int dumpCount;

    public Validation(int dumpCost) {
        this.dumpCost = dumpCost;
        this.truck = new GarbageTruck(10000);
        this.dumpCount = 0;
    }

    public void addGarbage(int garbage) {
        if (garbage > truck.getCapacity()) {
            return;
        }
        if (totalGarbage + garbage > truck.getCapacity()) {
            dumpGarbage();
        }
        totalGarbage += garbage;
        totalTime += 8;
        truck.addGarbage(garbage);
    }

    public int estimateCost() {
        if (totalGarbage > 0) {
            dumpGarbage();
        }

        double timeInHours = (double) totalTime / 60;
        int laborCost = (int) Math.ceil(timeInHours * 120000);
        return laborCost + dumpCost * dumpCount;
    }

    private void dumpGarbage() {
        totalTime += 30;
        truck.empty();
        dumpCount++;
    }
}