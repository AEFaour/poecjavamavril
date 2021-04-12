package fr.poecjava.javase.methodes;

import java.util.Arrays;
import java.util.Scanner;

public class Methods {

	// Methodes main --> elle permet de rendre executable un programme

	public static void main(String[] args) {
		// Tout ce qui est executable se trouve ici

		// appel de la methode
		salut();
		salut("Anas");
		salut("");
		salut(52);
		salut("Lucie", 25);
		salut(35, "Said");
		double prix = prixTTC(50.0, 20.0);
		System.out.println(prix);

		String myRes = siPalindrome(125);
		System.out.println(myRes);

		System.out.println(isMultiple(4, 2));
		System.out.println(isEven(9));
		System.out.println(isPremier(7));
		int[] myTabTriABulle = { 25, 12, 3, 17, 99, 75 };
		System.out.println("Tri à bulle " + triABulleTable(myTabTriABulle));
		int[] myTabTriSelection = { 25, 12, 3, 17, 99, 75 };
		System.out.println("Tri Sélection " + triSelectionTable(myTabTriSelection));
		int[] myTabTriInsertion = { 25, 12, 3, 17, 99, 75 };
		System.out.println("Tri Insertion " + triInsertionTable(myTabTriInsertion));

	}

	// Une méthode
	static void salut() {
		System.out.println("Salut ");
	}

	static void salut(String prenom) {

		System.out.println("Salut " + prenom);

	}

	static void salut(int age) {

		System.out.println("Salut , vous avez " + age + " ans");

	}

	static void salut(String prenom, int age) {

		System.out.printf("Salut %s, vous avez %s ans \n", prenom, age);

	}

	static void salut(int age, String prenom) {

		System.out.printf("Salut %s, vous avez %s ans \n", prenom, age);

	}

	static double prixTTC(double pht, double tva) {
		double pttc = (pht + pht * tva / 100);
		return pttc;
	}

	static String siPalindrome(int nombre) {

		String reponse = "";
		int palindrome = nombre;

		int inverse = 0;
		while (nombre != 0) {
			int rest = palindrome % 10;
			inverse = inverse * 10 + rest;
			nombre = nombre / 10;
		}

		if (inverse == nombre) {
			reponse = "Le numéro est  palindrome";
		} else {
			reponse = "Le numéro n'est pas palindrome";
		}
		;

		return reponse;
	}

	static boolean isMultiple(int a, int b) {

		return a % b == 0;

	}

	static boolean isEven(int n) {

		return isMultiple(n, 2);
	}

	static boolean isPremier(int n) {

		boolean test = true;
		for (int i = 2; i <= n / 2; i++) {
			if (isMultiple(n, i)) {

				test = false;
				break;
			}

		}

		return test;
	}

	static void change(int[] tab, int x, int y) {
		int val = tab[x];
		tab[x] = tab[y];
		tab[y] = val;
	}

	static String triABulleTable(int[] tab) {
		String res;
		for (int i = 0; i < tab.length; i++) {
			for (int j = 1; j < tab.length - i; j++) {
				if (tab[j] < tab[j - 1]) {
					change(tab, j, j - 1);
				}
			}
		}
		return res = Arrays.toString(tab);
	}

	static String triSelectionTable(int[] tab) {
		String res;
		int indexMini = 0;
		for (int i = 0; i < tab.length; i++) {
			indexMini = i;
			for (int j = i + 1; j < tab.length; j++) {
				if (tab[j] < tab[indexMini]) {
					indexMini = j;
				}
			}
			change(tab, i, indexMini);
		}
		return res = Arrays.toString(tab);
	}

	static String triInsertionTable(int[] tab) {
		String res;

		for (int i = 1; i < tab.length; i++) {
			int key = tab[i];
			int j = i - 1;
			while (j >= 0 && tab[j] > key) {
				tab[j + 1] = tab[j];
				j--;
			}
			tab[j+1] = key;
		}
		return res = Arrays.toString(tab);
	}
}
