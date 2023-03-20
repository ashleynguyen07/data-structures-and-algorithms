/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tramy
 */
class GarbageTruck {
    private int capacity;
    private int currentLoad;

    public GarbageTruck(int capacity) {
        this.capacity = capacity;
        this.currentLoad = 0;
    }

    public void addGarbage(int garbage) {
        currentLoad += garbage;
    }

    public void empty() {
        currentLoad = 0;
    }

    public boolean isFull() {
        return currentLoad >= capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
