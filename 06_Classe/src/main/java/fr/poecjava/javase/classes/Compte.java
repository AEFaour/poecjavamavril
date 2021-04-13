package fr.poecjava.javase.classes;

public class Compte {

    //les attributs ou champs
    //Ils doivent être de préference private
    //on parle d'encapsulation
    private int solde;
    private String numero;

    //Attribut de classe
    private static int nbCompte;

    public static int getNbCompte() {
        return nbCompte;
    }

    public Compte(String numero) {
        this.numero = numero;
        solde = 80;
        nbCompte++;
    }

    public Compte(String numero, int solde) {
        this.numero = numero;
        this.solde = 80 + solde;
        nbCompte++;
    }


    /**
     * Getter ou un acces en lecture de l'attribut solde
     *
     * @return
     */
    public int getSolde() {
        return solde;
    }

    /**
     * Acces en ecriture de l'attribut solde
     *
     * @param solde
     */

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public String getNumero() {
        return numero;
    }

    public void deposer(int s) {
        if (s > 0) {
            this.solde += s;
        }

    }

    public void retirer(int s) {
        if (s > 0 && this.solde > s) {
            this.solde -= s;
        }
    }


    public boolean peutRetirer(int s) {
        boolean resultat = false;
        if (s > 0 && this.solde > s) {
            this.solde -= s;
            resultat = true;
        }
        return resultat;
    }

    public int solde(){
        return this.solde;
    }
    public String infos() {
        return "Compte numéro : " + numero + ", Solde: " + solde + " €";
    }


}
