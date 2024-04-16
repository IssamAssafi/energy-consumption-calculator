package com.ekwateur;

import com.ekwateur.models.*;
import com.ekwateur.services.impl.FacturationServiceImp;
import com.ekwateur.services.interfaces.FacturationService;
import com.ekwateur.utils.ClientValidator;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Mode interactif
        Scanner scanner = new Scanner(System.in);

        // Prompt user for client information
        System.out.println("Enter client information:");
        System.out.print("Type (Particulier or Pro): ");
        String type = scanner.nextLine();
        System.out.print("Client ID: ");
        String id = scanner.nextLine();

        if(!ClientValidator.isValidClientReference(id)){
            System.err.println("Invalid client reference format. Allowed format : EKW+9digits");
            return;
        }

        // Création de l'objet Client selon le profil
        Client client;
        if ("Particulier".equalsIgnoreCase(type)) {
            System.out.print("Last name: ");
            String lastName = scanner.nextLine();
            System.out.print("First name: ");
            String firstName = scanner.nextLine();
            client = new ClientParticulier(id, Civilite.MR, lastName, firstName);
        } else if ("Pro".equalsIgnoreCase(type)) {
            System.out.print("SIRET :");
            String siret = scanner.nextLine();
            System.out.print("RAISON SOCIALE :");
            String raisonSociale = scanner.nextLine();
            System.out.print("CA :");
            double ca = scanner.nextDouble();
            scanner.nextLine();
            client = new ClientPro(id,siret,raisonSociale,ca);
        } else {
            System.err.println("Invalid client type. Please enter 'Particulier' or 'Pro'.");
            return;
        }

        // Demander des informations de consommation
        System.out.println("Enter les informations de la consommation:");
        System.out.print("Energy type (Electricite or Gaz): ");
        String energyTypeStr = scanner.nextLine();
        System.out.print("Consumption (en kWh): ");
        double consumption = scanner.nextDouble();

        // Créer l'objet consommation
        Energie energyType = Energie.valueOf(energyTypeStr.toUpperCase());
        Consommation consommation = new Consommation(energyType, consumption);

        // Calculer et afficher la facture
        FacturationService facturationService = new FacturationServiceImp();
        double billAmount = facturationService.calculerFacture(client, List.of(consommation));
        System.out.println("Le montant à payer est : €" + billAmount);

        scanner.close();



        //Mode non intéractif
        /*
        Client issam = new ClientParticulier("EKW123456789", Civilite.MR,"Assafi","Issam");
        Client miniEntreptise = new ClientPro("EKW123456789","SIRET_EXAMPLE","miniEntreptise",500000);
        Client grandeEntreprise = new ClientPro("EKW123456789", "SIRET_EXAMPLE","grandeEntreprise",12500000);

        FacturationService facturationService = new FacturationServiceImp();
        System.out.println("Le montant a payer est :"+facturationService.calculerFacture(issam, List.of(new Consommation(Energie.ELECTRICITE,34342))));
        System.out.println("Le montant a payer est :"+facturationService.calculerFacture(miniEntreptise, List.of(new Consommation(Energie.ELECTRICITE,34342))));
        System.out.println("Le montant a payer est :"+facturationService.calculerFacture(grandeEntreprise, List.of(new Consommation(Energie.ELECTRICITE,34342))));
        */




    }
}