package com.ekwateur.services.impl;

import com.ekwateur.models.*;
import com.ekwateur.services.interfaces.FacturationService;
import com.ekwateur.services.interfaces.FacturationStrategie;

import java.util.List;

public class FacturationServiceImp implements FacturationService {


    @Override
    public double calculerFacture(Client client, List<Consommation> consommations) {
        FacturationStrategie strategie;
        if (client instanceof ClientParticulier) {
            strategie = new ParticulierFacturationStrategie();
        } else if (client instanceof ClientPro proClient) {
            if (proClient.getCA() < 1000000) {
                strategie = new ProClientFacturationBasCA();
            } else {
                strategie = new ProClientFacturationHautCA();
            }
        } else {
            throw new IllegalArgumentException("Client type not supported");
        }
        return strategie.calculerFacture(client,consommations);
    }
}
