package com.ekwateur.services.interfaces;

import com.ekwateur.models.Client;
import com.ekwateur.models.Consommation;

import java.util.List;

public abstract class FacturationStrategie {

    protected final double PRIX_KWH_ELECTRICITE;
    protected final double PRIX_KWH_GAZ;

    public FacturationStrategie(double prixKwhElectricite, double prixKwhGaz) {
        this.PRIX_KWH_ELECTRICITE = prixKwhElectricite;
        this.PRIX_KWH_GAZ = prixKwhGaz;
    }

    public double calculerFacture(Client client, List<Consommation> consommations) {
        double montantTotal = 0.0;
        for (Consommation consommation : consommations) {
            switch (consommation.getTypeEnergie()) {
                case ELECTRICITE:
                    montantTotal += PRIX_KWH_ELECTRICITE * consommation.getConsommation();
                    break;
                case GAZ:
                    montantTotal += PRIX_KWH_GAZ * consommation.getConsommation();
                    break;
            }
        }
        return montantTotal;
    }
}
