package com.ekwateur.services.impl;

import com.ekwateur.services.interfaces.FacturationStrategie;
import com.ekwateur.utils.FacturationConstants;

public class ParticulierFacturationStrategie extends FacturationStrategie {

    public ParticulierFacturationStrategie() {
        super(
                FacturationConstants.PRIX_KWH_ELECTRICITE_PARTICULIER,
                FacturationConstants.PRIX_KWH_GAZ_PARTICULIER
        );
    }
}
