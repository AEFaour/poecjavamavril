package fr.poecjava.javase.exercices.strings;

public class PresenceLettre {

	public static void main(String[] args) {
		String str = "Bonjour";

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
