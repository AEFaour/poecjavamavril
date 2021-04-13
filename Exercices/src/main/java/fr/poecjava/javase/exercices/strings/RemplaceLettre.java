package fr.poecjava.javase.exercices.strings;

import java.util.Scanner;

public class RemplaceLettre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Veuillez entrer une chaîne, svp : ");

		String str = sc.next();
		 
		char[] strCh = str.toCharArray();
		
		for (int i = 0; i < strCh.length; i++) {
			if (strCh[i] == 'B') {
				strCh[i] = 'S';
			} else if (strCh[i] == 'b') {
				strCh[i] = 's';
			}
			
		}
		System.out.print(strCh);
		
		str = new String(strCh);
		
		System.out.println("\n" + str);

	}

}
