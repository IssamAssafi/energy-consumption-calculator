package com.ekwateur.models;

public class ClientParticulier extends Client {

    private Civilite civilite;
    private String nom;
    private String prenom;

    public ClientParticulier(String ref, Civilite civilite, String nom, String prenom) {
        super(ref);
        this.civilite = civilite;
        this.nom = nom;
        this.prenom = prenom;
    }
}
