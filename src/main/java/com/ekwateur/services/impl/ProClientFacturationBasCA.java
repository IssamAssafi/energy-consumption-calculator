package com.ekwateur.services.impl;

import com.ekwateur.services.interfaces.FacturationStrategie;
import com.ekwateur.utils.FacturationConstants;

public class ProClientFacturationBasCA extends FacturationStrategie {

    public ProClientFacturationBasCA() {
        super(
                FacturationConstants.PRIX_KWH_ELECTRICITE_PRO_BAS_CA,
                FacturationConstants.PRIX_KWH_GAZ_PRO_BAS_CA
        );
    }
}
