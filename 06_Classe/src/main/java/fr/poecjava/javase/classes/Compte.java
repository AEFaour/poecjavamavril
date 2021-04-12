package fr.poecjava.javase.classes;

public class Compte {

    //les attributs ou champs
    //Ils doivent être de préference private
    //on parle d'encapsulation
    private double solde;
    private String numero;

    //Attribut de classe
    public static int nbCompte;

    public static int getNbCompte() {
        return nbCompte;
    }

    public Compte(String n) {
        numero = n;
        solde = 80;
        nbCompte++;
    }

    public Compte(String n, double depot) {
        numero = n;
        solde = 80 + depot;
        nbCompte++;
    }


    /**
     * Getter ou un acces en lecture de l'attribut solde
     *
     * @return
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Acces en ecriture de l'attribut solde
     *
     * @param montant
     */

    public void setSolde(double montant) {
        solde = montant;
    }

    public String getNumero() {
        return numero;
    }

    public void crediter(double montant) {
        if (montant > 0) {
            solde += montant;
        }

    }

    public boolean debiter(double montant) {
        boolean resultat = false;
        if (montant > 0 && solde > montant) {
            solde -= montant;
            resultat = true;
        }
        return resultat;
    }

    public String description() {
        return "[N : " + numero + ", Solde: " + solde + "]";
    }


}
