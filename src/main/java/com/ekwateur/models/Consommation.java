package com.ekwateur.models;

public class Consommation {
    private Energie typeEnergie;
    private double consommation;

    public Consommation(Energie typeEnergie, double consommation) {
        this.typeEnergie = typeEnergie;
        this.consommation = consommation;
    }

    public Energie getTypeEnergie() {
        return typeEnergie;
    }

    public double getConsommation() {
        return consommation;
    }
}
