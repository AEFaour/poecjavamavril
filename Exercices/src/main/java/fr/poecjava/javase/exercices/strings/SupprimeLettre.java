package fr.poecjava.javase.exercices.strings;

import java.util.Scanner;

public class SupprimeLettre {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Veuillez entrer une chaîne, svp : ");

		StringBuilder sb = new StringBuilder();

		sb.append(sc.nextLine());
		
		
		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);
			if(ch == 'b' || ch == 'B') {
				
				sb.deleteCharAt(i);
				
			}
			
		}
		System.out.println(sb);
		
		sc.close();

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println(" Veuillez entrer une chaîne, svp : ");
		 * 
		 * String str = sc.next();
		 * 
		 * char[] strCh = str.toCharArray();
		 * 
		 * for (int i = 0; i < strCh.length; i++) { if (strCh[i] == 'B' || strCh[i] ==
		 * 'b') { strCh[i] = ' '; }
		 * 
		 * } System.out.print(strCh);
		 * 
		 * str = new String(strCh);
		 * 
		 * System.out.println("\n" + str);
		 */

	}

}
