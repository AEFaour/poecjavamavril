package fr.poecjava.javase.iteratives;

import java.util.Iterator;

public class BoucleFor {

	public static void main(String[] args) {
		
		int val = 3;
		for (int compteur = 1; compteur < 11; compteur ++) {
			System.out.printf(" %d x %d = %d\n", val, compteur, val * compteur);
		}
	}

}
