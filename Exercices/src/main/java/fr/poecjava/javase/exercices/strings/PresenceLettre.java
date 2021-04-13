package fr.poecjava.javase.exercices.strings;

import java.util.Scanner;

public class PresenceLettre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Veuillez entrer une chaîne, svp : ");

		String str = sc.next();

		char ch = 'r';

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("La lettre " + ch + " est présent " + count + " fois");
		} else {

			System.out.println("La lettre " + ch + " est absent");
		}

	}

}
