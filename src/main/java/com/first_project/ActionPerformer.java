package com.first_project;

import com.first_project.GUI;

public class ActionPerformer implements EventsCallback {
    int population;
    GUI gui;

    public ActionPerformer() {
        population = 0;
        gui = new GUI(this);
        gui.init();
    }

    @Override
    public void populationChaged(int value) {
        population = value;
        gui.populationLabel.setText("population: " + String.valueOf(population));
        gui.simpleDishCount.setText("кол-во простых блюд на день: " + String.valueOf(totalDishes(totalSaturation(population))));
        gui.riceCount.setText("кол-во кустов риса: " + String.valueOf(totalRice(totalDishes(totalSaturation(population)))));
        gui.potatoCount.setText("кол-во кустов пататы: " + String.valueOf(totalPotato(totalDishes(totalSaturation(population)))));
        gui.cornCount.setText("кол-во кустов кукурузы: " + String.valueOf(totalCorn(totalDishes(totalSaturation(population)))));
    }

    public double totalSaturation(int popul) {
        return popul * 1.6;
    }

    public int totalDishes(double saturation) {
        return (int) Math.ceil(saturation / 0.9);
    }

    public int totalRice(int totalDishes) {
        double daysInSoil = 5.54;
        int harvestValue = 6;
        double saturationPerUnit = 0.05; //i don't sure about that
        return (int) Math.ceil(totalDishes * 10 * daysInSoil / harvestValue);
    }

    public int totalPotato(int totalDishes) {
        double daysInSoil = 10.71;
        int harvestValue = 11;
        return (int) Math.ceil(totalDishes * 10 * daysInSoil / harvestValue);
    }

    public int totalCorn(int totalDishes) {
        double daysInSoil = 20.86;
        int harvestValue = 22;
        return (int) Math.ceil(totalDishes * 10 * daysInSoil / harvestValue);
    }

}
