package fr.poecjava.javase.exercices.strings;

import java.util.Scanner;

public class InverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Veuillez entrer une chaîne, svp : ");

		String str = sc.next();
		 
		char[] strCh = str.toCharArray();
		
		System.out.println(strCh);
		
		for (int i = 0; i < strCh.length; i++) {
			
			int j = strCh.length - 1 ; 
			System.out.print(strCh[j - i]);
			
		}
		System.out.println("\n"+str);

	}

}
