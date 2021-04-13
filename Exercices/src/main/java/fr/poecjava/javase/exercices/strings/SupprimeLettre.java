package fr.poecjava.javase.exercices.strings;

import java.util.Scanner;

public class SupprimeLettre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Veuillez entrer une chaîne, svp : ");

		String str = sc.next();
		 
		char[] strCh = str.toCharArray();
		
		for (int i = 0; i < strCh.length; i++) {
			if (strCh[i] == 'B' || strCh[i] == 'b') {
				strCh[i] = ' ';
			}
			
		}
		System.out.print(strCh);
		
		str = new String(strCh);
		
		System.out.println("\n" + str);


	}

}
