## Comment utiliser le programme
Le programme démarre en exécutant le main. Un mode interactif s'ouvre dans la console, invitant l'utilisateur à fournir les informations nécessaires. Une fois les informations saisies, le programme effectue les calculs requis et affiche le résultat.


## Enoncé de l'exercice
Le product owner te demande de developper un programme qui permet de calculer le montant à facturer à un client d'Ekwateur pour 
un mois calendaire.

Ce programme devra gérer 2 types de clients :

A) Les clients Pro, qui ont les propriétés suivantes :
- Reference Client (EKW + 9 caractères numériques)
- N° SIRET
- Raison Sociale
- CA

B) Les particuliers, qui ont les propriétés suivantes :
- Reference Client (EKW + 9 caractères numériques)
- Civilité
- Nom
- Prénom

Un client peut consommer deux types d'énergies :
- Electricité
- Gaz

Chaque énergie est facturée au kWh.
- Pour les particuliers, le prix du kWh est de 0,133 € pour l'électricité et 0,108€ pour le gaz
- Pour les pro, ayant un CA supérieur à 1 000 000 €, le prix du kWh est de 0,110 € pour l'électricité et 0,123€ pour le gaz
- Pour les pro, ayant un CA inférieur à 1 000 000 €, le prix du kWh est de 0,112 € pour l'électricité et 0,117€ pour le gaz

## Contraintes techniques
La seule contrainte technique est l'utilisation du langage Java dans sa version 8 au minimum.

## Ce qui est attendu
Le minimum attendu est un programme fonctionnel qui puisse etre executé et testé.

## Comment soumettre ton travail
- Créer un nouveau repository public sur un espace à toi (et non un fork de ce repo sur l'espace gitlab Ekwateur)
- Rendre le projet sur la branche master de ton repository
- Enfin, nous communiquer par mail le lien de ton repository quand l'exercice est terminé
