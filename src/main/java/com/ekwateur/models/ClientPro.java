package com.ekwateur.models;


public class ClientPro extends Client {

    private String siret;
    private String raisonSociale;
    private double CA;

    public ClientPro(String ref, String siret, String raisonSociale, double CA) {
        super(ref);
        this.siret = siret;
        this.raisonSociale = raisonSociale;
        this.CA = CA;
    }

    public double getCA(){
        return this.CA;
    }
}
