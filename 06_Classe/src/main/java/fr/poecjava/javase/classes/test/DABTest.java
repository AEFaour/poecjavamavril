package fr.poecjava.javase.classes.test;

import fr.poecjava.javase.classes.Compte;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class DABTest {
    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);
        System.out.println("Choisir une opération : ");
        Compte c = new Compte("N°1", 1000);
        int depot;
        if(saisie.hasNextInt()){
            int operation = saisie.nextInt();
            if (operation >= 1 && operation <= 4){
                switch (operation){
                    case 1:
                        saisirDepot(c);
                        break;
                    case 2 :
                        saisirRetrait(c);
                        break;
                    case 3 :
                        System.out.println( c.infos() );
                        break;
                    default:
                        System.out.println("Veuillez récuperer votre carte");

                }

            } else {
                System.out.println("Il faut choisir un numéro entre 1 et 4");

            }

        }else{

            System.out.println("Il faut choisir un numéro int");
        }
      saisie.close();

    }

    static void saisirDepot(Compte c){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez choisir un montant pour déposer : ");
        if(sc.hasNextInt()){
            int dp = sc.nextInt();
            c.deposer(dp);
            System.out.printf("Vous avez déposé %s, et donc %s ", dp, c.infos() );

        }else{
            System.out.println("Il faut choisir un numéro int");
        }


    }
    static void saisirRetrait( Compte c){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez choisir un montant pour retirer : ");
        if(sc.hasNextInt()){
            int rt = sc.nextInt();
            if(c.solde()>rt){
                c.retirer(rt);
                System.out.printf("Vous avez rétiré %s, et donc %s ", rt, c.infos() );
            }else{
                System.out.println("Veuillez choisir un montant inférieur");
            }

        }else{
            System.out.println("Il faut choisir un numéro int");
        }

    }

}
