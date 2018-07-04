package com.mycompany.app;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Simulation simulation = new Simulation();
        ArrayList<Item> itemListPhase1 = simulation.loadItems("phase-1");
        ArrayList<Item> itemListPhase2 = simulation.loadItems("phase-2");

        ArrayList<Rocket> u1ListPhase1 = simulation.loadU1(itemListPhase1);
        ArrayList<Rocket> u1ListPhase2 = simulation.loadU1(itemListPhase2);

        int totalBudgetU1Phase1 = simulation.runSimulation(u1ListPhase1);
        int totalBudgetU1Phase2 = simulation.runSimulation(u1ListPhase2);

        System.out.println("Total Budget for U1 Rockets:");
        System.out.println("Phase 1: " + Integer.toString(totalBudgetU1Phase1) +"$");
        System.out.println("Phase 2: " + Integer.toString(totalBudgetU1Phase2) +"$");

        System.out.println("#################################################");

        ArrayList<Rocket> u2ListPhase1 = simulation.loadU2(itemListPhase1);
        ArrayList<Rocket> u2ListPhase2 = simulation.loadU2(itemListPhase2);

        int totalBudgetU2Phase1 = simulation.runSimulation(u2ListPhase1);
        int totalBudgetU2Phase2 = simulation.runSimulation(u2ListPhase2);

        System.out.println("Total Budget for U2 Rockets:");
        System.out.println("Phase 1: " + Integer.toString(totalBudgetU2Phase1) +"$");
        System.out.println("Phase 2: " + Integer.toString(totalBudgetU2Phase2) +"$");

    }
}
