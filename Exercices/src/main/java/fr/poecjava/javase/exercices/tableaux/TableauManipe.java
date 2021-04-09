package fr.poecjava.javase.exercices.tableaux;

import java.util.Arrays;
import java.util.Scanner;

public class TableauManipe {

	public static void main(String[] args) {
		int[] tab = { 2, 3, 5, 6, 3, 8, 10, 11, 15, 0 };

		System.out.println("Avant l'inversion : \n" + Arrays.toString(tab));
		for (int i = 0; i < tab.length / 2; i++) {
			int ivs = tab[i];
			tab[i] = tab[tab.length - i - 1];
			tab[tab.length - i - 1] = ivs;
		}
		System.out.println("Après l'inversion : \n" + Arrays.toString(tab));

		int rand = (int) (Math.random() * 100);
		System.out.println(rand);

		Scanner saisieNombreN1 = new Scanner(System.in);
		System.out.print("Veuillez saisir le nombre n 1 : ");
		int N1 = saisieNombreN1.nextInt();

		Scanner saisieNombreN2 = new Scanner(System.in);
		System.out.print("Veuillez saisir le nombre n 2 : ");
		int N2 = saisieNombreN2.nextInt();

		Scanner saisieNombreN3 = new Scanner(System.in);
		System.out.print("Veuillez saisir le nombre n 3 : ");
		int N3 = saisieNombreN3.nextInt();

		Scanner saisieNombreN4 = new Scanner(System.in);
		System.out.print("Veuillez saisir le nombre n 4 : ");
		int N4 = saisieNombreN4.nextInt();

		Scanner saisieNombreN5 = new Scanner(System.in);
		System.out.print("Veuillez saisir le nombre n 5 : ");
		int N5 = saisieNombreN5.nextInt();

		Scanner saisieNombreN6 = new Scanner(System.in);
		System.out.print("Veuillez saisir le nombre n 6 : ");
		int N6 = saisieNombreN6.nextInt();

		Scanner saisieNombreN7 = new Scanner(System.in);
		System.out.print("Veuillez saisir le nombre n 7 : ");
		int N7 = saisieNombreN7.nextInt();

		Scanner saisieNombreN8 = new Scanner(System.in);
		System.out.print("Veuillez saisir le nombre n 8 : ");
		int N8 = saisieNombreN8.nextInt();

		Scanner saisieNombreN9 = new Scanner(System.in);
		System.out.print("Veuillez saisir le nombre n 9 : ");
		int N9 = saisieNombreN9.nextInt();

		Scanner saisieNombreN10 = new Scanner(System.in);
		System.out.print("Veuillez saisir le nombre n 10 : ");
		int N10 = saisieNombreN10.nextInt();

		int[] tabTrie = { N1, N2, N3, N4, N5, N6, N7, N8, N9, N10 };

		System.out.println("Avant le trie : \n" + Arrays.toString(tabTrie));

		Arrays.sort(tabTrie);

		System.out.println("Après le trie : \n" + Arrays.toString(tabTrie));
		
		boolean bool;

		if (bool = true) {
			for (int nombre : tabTrie) {

				if (nombre == rand) {
					break;
				}

			}
			System.out.printf(" Le numéro %d existe dans le  %s \n", rand, Arrays.toString(tabTrie));
		} else {
			System.out.printf(" Le numéro %d n'existe pas dans le  %s \n", rand, Arrays.toString(tabTrie));
		}

		int[] tabTrie1 = { N1, N2, N3, N4, N5 };

		int[] tabTrie2 = { N6, N7, N8, N9, N10 };

		Arrays.sort(tabTrie1);

		Arrays.sort(tabTrie2);

		int funsionTabLen = tabTrie1.length + tabTrie1.length;

		int[] fussionTab = new int[funsionTabLen];
		int count = 0;

		for (int nombre : tabTrie1) {
			Arrays.sort(tabTrie1);
			fussionTab[count] = nombre;
			count++;
		}

		for (int nombre : tabTrie2) {
			Arrays.sort(tabTrie2);
			fussionTab[count] = nombre;
			count++;
		}

		System.out.println("Fussionner tabTrie1 et tabTrie2  : \n" + Arrays.toString(fussionTab));

	}

}
