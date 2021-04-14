package fr.poecjava.javase.exercices.strings;

import java.util.Scanner;

public class occurrenceLettre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Veuillez entrer une chaîne, svp : ");

		StringBuilder sb = new StringBuilder();

		sb.append(sc.nextLine());
		
		
		int count = 0; 
		
		/*for (int i = 0; i < sb.length(); i++) {
			for (int j = 0; j < sb.length(); j++) {
				if (sb.charAt(i) == sb.charAt(j)) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println("La lettre " + sb.charAt(i) + " est présent " + count + " fois");
			} else {

				System.out.println("La lettre " + sb.charAt(i) + " est absent");
			}
			}*/
			
		sc.close();
	}

}
