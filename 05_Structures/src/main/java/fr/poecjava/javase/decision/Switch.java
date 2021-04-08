package fr.poecjava.javase.decision;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {

		Scanner saisie = new Scanner(System.in);
		System.out.print("N° Jour : ");

		if (saisie.hasNextInt()) {

			// Ici l'utlisateur a saisi un entier

			int numero = saisie.nextInt();

			//String jourDeLaSemaine;

			/*switch (numero) {
			case 1:
				jourDeLaSemaine = "Lundi";
				break;
			case 2:
				jourDeLaSemaine = "Mardi";
				break;
			case 3:
				jourDeLaSemaine = "Mercredi";
				break;
			case 4:
				jourDeLaSemaine = "Jeudi";
				break;
			case 5:
				jourDeLaSemaine = "Vendredi";
				break;
			case 6:
				jourDeLaSemaine = "Samedi";
				break;
			case 7:
				jourDeLaSemaine = "Dimmanche";
				break;
			default:
				jourDeLaSemaine = " Numéro du jour inconnu de système";

			}*/
			// Depuis Java 14 on peut écrire le switch comme suit

			String jourDeLaSemaine= switch(numero) {
			case 1 -> "Lundi";
			case 2 -> "Lundi";
			case 3 -> "Lundi";
			case 4 -> "Lundi";
			case 5 -> "Lundi";
			case 6 -> "Lundi";
			case 7 -> "Lundi";
			default -> " Numéro du jour inconnu de système";
			};
			System.out.println(numero + " --> " + jourDeLaSemaine);

		} else {
			// Ici la saisie utilisateur n'est pas bonne
			System.out.println(" Le N° d'étage est un entier");
		}

		saisie.close();

	}

}
