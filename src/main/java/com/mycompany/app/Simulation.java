package com.mycompany.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Simulation {

    public ArrayList<Item> loadItems(String phase) {
        ArrayList<Item> itemList = new ArrayList<Item>();
        try {
            File file = new File(phase + ".txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                String[] parts = line.split("=");
                String part1 = parts[0];
                String part2 = parts[1];

                Item item = new Item();
                item.name = part1;
                item.weight = Integer.parseInt(part2);
                itemList.add(item);
            }
            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("A file was not found");
        }
        return itemList;
    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> itemList) {
        ArrayList<Rocket> u1Rockets = new ArrayList<Rocket>();

        U1 u1 = new U1();

        for (Item item : itemList) {
            if (u1.canCarry(item)) {
                u1.carry(item);
            } else {
                u1Rockets.add(u1);
                u1 = new U1();
            }

        }
        return u1Rockets;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> itemList) {
        ArrayList<Rocket> u2Rockets = new ArrayList<Rocket>();

        U2 u2 = new U2();

        for (Item item : itemList) {
            if (u2.canCarry(item)) {
                u2.carry(item);
            } else {
                u2Rockets.add(u2);
                u2 = new U2();
            }

        }
        return u2Rockets;
    }

    public int runSimulation(ArrayList<Rocket> rocketList) {
        int totalBudget = 0;
        for (Rocket rocket: rocketList) {
            while(!(rocket.launch() && rocket.land())) {
                totalBudget += rocket.cost;
            }
            totalBudget += rocket.cost;
        }

        return totalBudget;
    }


}