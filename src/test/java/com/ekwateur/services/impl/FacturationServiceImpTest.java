package com.ekwateur.services.impl;

import com.ekwateur.models.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class FacturationServiceImpTest {

    @Test
    public void testCalculerFacture_Particulier() {
        // Given
        Client client = new ClientParticulier("EKW123456789",Civilite.MR,"ASSAFI","Issam");
        List<Consommation> consommations = new ArrayList<>();
        consommations.add(new Consommation(Energie.ELECTRICITE, 100));
        consommations.add(new Consommation(Energie.GAZ, 100));
        FacturationServiceImp facturationService = new FacturationServiceImp();

        // When
        double facture = facturationService.calculerFacture(client, consommations);

        // Then
        assertEquals(24.1, facture, 0.001);
    }


    @Test
    public void testCalculerFacture_ProBasCA() {
        // Given
        Client client = new ClientPro("EKW123456789","12345678901234","Doctolib",760000);
        List<Consommation> consommations = new ArrayList<>();
        consommations.add(new Consommation(Energie.ELECTRICITE, 9800));
        consommations.add(new Consommation(Energie.GAZ, 3400));
        FacturationServiceImp facturationService = new FacturationServiceImp();

        // When
        double facture = facturationService.calculerFacture(client, consommations);

        // Then
        assertEquals(1495.4, facture, 0.001);
    }

    @Test
    public void testCalculerFacture_ProHautCA() {
        // Given
        Client client = new ClientPro("EKW123456789","12345678901234","Google",12000000);
        List<Consommation> consommations = new ArrayList<>();
        consommations.add(new Consommation(Energie.ELECTRICITE, 22000));
        consommations.add(new Consommation(Energie.GAZ, 9000));
        FacturationServiceImp facturationService = new FacturationServiceImp();

        // When
        double facture = facturationService.calculerFacture(client, consommations);

        // Then
        assertEquals(3527.0, facture, 0.001);
    }

    @Test
    public void testCalculerFacture_UnsupportedClient() {
        // Given
        Client client = new Client("EKW123456789");
        List<Consommation> consommations = new ArrayList<>();
        consommations.add(new Consommation(Energie.ELECTRICITE, 100));
        consommations.add(new Consommation(Energie.GAZ, 100));
        FacturationServiceImp facturationService = new FacturationServiceImp();

        // When & Then
        try {
            facturationService.calculerFacture(client, consommations);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Exception expected, test passed
        }
    }

}
