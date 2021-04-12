package fr.poecjava.javase.classes.test;

import fr.poecjava.javase.classes.Compte;

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
		System.out.println("nbCompte --> " + Compte.nbCompte);
		a.getSolde();
		a.getNumero();

		Compte b = new Compte("N°2", 1000);
		//System.out.println(" b.getSolde() = " + b.getSolde());
		//System.out.println(" b.getNumero() = " + b.getNumero());
		System.out.println(a.description());
		System.out.println("nbCompte --> " + Compte.getNbCompte());
		Compte c = new Compte("N°2");
		System.out.println("nbCompte --> " + Compte.getNbCompte());
		a = c;
		System.out.println(a.description());
		b.crediter(20);
		System.out.println(" b.getSolde() = " + b.getSolde());
		System.out.println(b.description());
		b.debiter(500);
		System.out.println(" b.getSolde() = " + b.getSolde());
		System.out.println(b.description());

		TestClasse tc = new TestClasse();
		System.out.println(tc.isMultiple(4,2));
	}

	boolean isMultiple( int a, int b){
		return  a%b ==0;
	}

}
