package fr.poecjava.javase.tableaux;

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
		
		char[] caracteres = {'J', 'o', 'a', 'c', 'h', 'i', 'm'};
		
		System.out.printf("caracteres = %s\n", Arrays.toString(caracteres));
		
		System.out.println("caracteres = " + Arrays.toString(caracteres));
		
		

	}

}
