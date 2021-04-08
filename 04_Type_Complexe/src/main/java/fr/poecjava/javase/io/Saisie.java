package fr.poecjava.javase.io;

import java.util.Scanner;

public class Saisie {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		System.out.print("Entrez votre prenom : ");
		String prenom = saisie.nextLine();
		System.out.println("Votre prenom est " + prenom );
//		System.out.println("Entre le nb de bouteilles : ");
//		int nbBouteilles = saisie.nextInt();
//		System.out.println("nb de bouteilles " + nbBouteilles );
		
		System.out.print("Entrez votre prenom : ");
		prenom = saisie.next();
		System.out.println("Votre prenom est " + prenom );
		
		saisie.close();
	}

}
