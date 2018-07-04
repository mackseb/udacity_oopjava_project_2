package com.mycompany.app;

public class Rocket implements SpaceShip {
    public int cost;
    public int weight;
    public int maxWeight;

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry(Item item) {
        if(this.weight + item.weight<=this.maxWeight) {
            return true;
        }
		return false;
	}

    public void carry(Item item) {
        this.weight += item.weight;
    }
}
