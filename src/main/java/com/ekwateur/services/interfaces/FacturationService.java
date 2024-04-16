package com.ekwateur.services.interfaces;

import com.ekwateur.models.Client;
import com.ekwateur.models.Consommation;

import java.util.List;

public interface FacturationService {

    double calculerFacture(Client client, List<Consommation> consommations);
}
