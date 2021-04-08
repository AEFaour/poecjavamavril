package fr.poecjava.javase.decision;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		System.out.print("N° Etage : ");

		if (saisie.hasNextInt()) {

			// Ici l'utlisateur a saisi un entier

			int etage = saisie.nextInt();
			// On traite d'abord les cas invalides
			if (etage == 13) {

				System.out.println(" Erreur: L'étage 13 n'existe pas ");
			} else if (etage >= 0 && etage <= 20) {
				// Ici la saisie est valide

				int etageReel = etage;

				if (etage > 13) {
					etageReel = etage - 1;
				} 
				System.out.println("L'ascenseur se rendra à l'étage " + etageReel);

			} else {
				
				System.out.println(" Etage inexistant ");
			}

		} else {
			// Ici la saisie utilisateur n'est pas bonne
			System.out.println(" Le N° d'étage est un entier ");
		}

		saisie.close();
	}

}
