package com.mycompany.app;

import java.lang.Math;

public class U1 extends Rocket {

    public U1() {
        this.cost = 120000000;
        this.weight = 18000;
        this.maxWeight = 29000;
    }

    public boolean launch() {

        double rand = Math.random();
        double chanceExplosion = (double) 0.05 * (this.weight / this.maxWeight);
        if (rand >= chanceExplosion) {
            return true;
        }
        return false;
    }

    public boolean land() {
        double rand = Math.random();
        double chanceExplosion = (double) 0.01 * (this.weight / this.maxWeight);
        if (rand >= chanceExplosion) {
            return true;
        }
        return false;
    }
}