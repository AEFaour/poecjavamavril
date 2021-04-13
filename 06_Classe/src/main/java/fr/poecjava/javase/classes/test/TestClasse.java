package fr.poecjava.javase.classes.test;

import fr.poecjava.javase.classes.Compte;
import fr.poecjava.javase.classes.Personne;

import java.time.LocalDate;

public class TestClasse {

	public static void main(String[] args) {
		
		//DECLARTION DES VARIABLES DE TYPES PRIMITIFS
		int i = 26;
		int j = i; 
		
		System.out.println(" i = " + i);
		System.out.println(" j = " + j);
		
		i = -45; 
		
		System.out.println(" i = " + i);
		System.out.println(" j = " + j);
		
		//Declaration d'une variable de type compte
		Compte a;
		
		
		// Initialisation ou instanciation de la variable
		a = new Compte("N°1");// On crée un objer que l'on place dans a
		//System.out.println(" N° a = " + a.getNumero());
		//System.out.println(" a.getSolde() = " + a.getSolde());
		System.out.println("nbCompte --> " + Compte.getNbCompte());
		a.getSolde();
		a.getNumero();

		Compte b = new Compte("N°2", 1000);
		//System.out.println(" b.getSolde() = " + b.getSolde());
		//System.out.println(" b.getNumero() = " + b.getNumero());
		System.out.println(a.infos());
		System.out.println("nbCompte --> " + Compte.getNbCompte());
		Compte c = new Compte("N°2");
		System.out.println("nbCompte --> " + Compte.getNbCompte());
		a = c;
		System.out.println(a.infos());
		b.deposer(200);
		System.out.println(" b.getSolde() = " + b.getSolde());
		System.out.println(" Solde = " + b.solde());
		System.out.println(b.infos());
		b.retirer(500);
		System.out.println(" b.getSolde() = " + b.getSolde());
		System.out.println(" Solde = " + b.solde());
		System.out.println(b.infos());

		TestClasse tc = new TestClasse();
		System.out.println(tc.isMultiple(4,2));

		/*Personne julie = new Personne("Julie", LocalDate.of(2000, 3, 12));
		Personne francois= new Personne("Francois", LocalDate.of(1999, 12, 24));
		julie.seMarier(francois);

		System.out.println(julie.description());
		System.out.println(francois.description());*/


	}

	boolean isMultiple( int a, int b){
		return  a%b ==0;
	}

}
