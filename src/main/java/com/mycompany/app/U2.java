package com.mycompany.app;

import java.lang.Math;

public class U2 extends Rocket {

    public U2() {
        this.cost = 100000000;
        this.weight = 10000;
        this.maxWeight = 18000;
    }

    public boolean launch() {

        double rand = Math.random();
        double chanceExplosion = (double) 0.04 * (this.weight / this.maxWeight);
        if (rand >= chanceExplosion) {
            return true;
        }
        return false;
    }

    public boolean land() {
        double rand = Math.random();
        double chanceExplosion = (double) 0.08 * (this.weight / this.maxWeight);
        if (rand >= chanceExplosion) {
            return true;
        }
        return false;
    }
}