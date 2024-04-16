package com.ekwateur.services.impl;

import com.ekwateur.services.interfaces.FacturationStrategie;
import com.ekwateur.utils.FacturationConstants;

public class ProClientFacturationHautCA extends FacturationStrategie {

    public ProClientFacturationHautCA() {
        super(
                FacturationConstants.PRIX_KWH_ELECTRICITE_PRO_HAUT_CA,
                FacturationConstants.PRIX_KWH_GAZ_PRO_HAUT_CA
        );
    }
}
