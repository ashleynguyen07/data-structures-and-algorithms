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

//        Dijkstra d = new Dijkstra();
//        d.ijk(2, 5);//A->F
//        System.out.println("");
        Graph graph = new Graph();
        graph.dijkstra('D', 'F');

    }
}
