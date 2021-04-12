package fr.poecjava.javase.io;

import java.util.Arrays;

public class Tables {

	public static void main(String[] args) {
		
		// Creation de la variable de type tableau
		
		double[] notes; 
		
		//Initialisation de la variable
		
		notes = new double[5];
		
		
		
		System.out.printf("note = %s\n", Arrays.toString(notes));
		
		double index4 = notes[3];
		
		System.out.printf("index4 = %s\n", index4);
		
		notes[2] =  5.6;
		
		System.out.printf("notes[2] = %s\n", notes[2]);
		
		char[] caracteres = {'J', 'o', 'a', 'c', 'h', 'i', 'm'}; // Définition explicite d'un tableau
		
		System.out.printf("caracteres = %s\n", Arrays.toString(caracteres));
		
		System.out.println("caracteres = " + Arrays.toString(caracteres)); // opérateur de concatenation
		System.out.println(2.5 + 3); // opérateur polymorphe
		System.out.println("addition = " + ( 2.5 + 3)); 
		
		int valeurs []; // Autre définition de tableau à nes pas priviliger
		
		System.out.println("nbCarateres = " + caracteres.length);
		
		System.out.println(caracteres[4]);
		System.out.println(caracteres[caracteres.length-3]);

	}

}
