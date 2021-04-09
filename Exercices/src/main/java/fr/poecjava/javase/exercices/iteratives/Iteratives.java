package fr.poecjava.javase.exercices.iteratives;

import java.util.Scanner;

public class Iteratives {

	public static void main(String[] args) {
		int compteur = 1;
		int somme = 0;

		while (compteur <= 10) {
			System.out.printf(" Le nombre %d de 10  = %d \n", compteur, compteur);
			somme = somme + compteur;
			System.out.printf(" En ajoutant le nombre %d la somme devient  = %d \n", compteur, somme);
			compteur++;
		}

		int[] tab = new int[10];

		int maxNombre = 0;
		int minNombre = tab.length;
		int k = tab.length;

		for (int i = 1; i <= tab.length; i++) {
			System.out.printf(" Le nombre %d de 10  = %d \n", i, i);
			int[] newTab = { i };

			for (int j = 0; j < newTab.length; j++) {
				maxNombre = Math.max(maxNombre, newTab[j]);
				minNombre = Math.min(minNombre, newTab[j]);

				for (k = 0; k < newTab.length; k++) {
					newTab[k] = minNombre;
				}
			}

		}
		System.out.printf(" Le numéro plus grand = %d  \n", maxNombre);
		System.out.printf(" Le numéro plus petit = %d  \n", minNombre);
		System.out.printf(" Le numéro plus petit = %d  \n", k);

		Scanner saisie = new Scanner(System.in);
		System.out.print("Veuillez saisir le nombre n : ");
		int n = saisie.nextInt();

		int moyenne = 0;
		int somme1 = 0;
		for (int l = 0; l <= n; l++) {

			somme1 = somme1 + l;
			if (l != 0) {
				moyenne = somme1 / l;
			} else {
				moyenne = somme1 / 1;
			}

			System.out.printf(" Le nombre %d de n  = %d \n", l, l);
			System.out.printf(" La somme %d de n  = %d \n", l, somme1);
			System.out.printf(" Le moyenne n en ajoutant %d  = %d \n", l, moyenne);
		}

	}

}
