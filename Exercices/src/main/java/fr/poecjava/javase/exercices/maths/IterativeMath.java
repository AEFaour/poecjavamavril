package fr.poecjava.javase.exercices.maths;

import java.util.Arrays;

public class IterativeMath {

	public static void main(String[] args) {

		int maxNombre = 0;
		int minNombre = 100;

		for (int i = 0; i < 10; i++) {
			int rand = (int) (Math.random() * 100);
			
			int[] tab = { rand };

			System.out.printf(" Le range de l'index %d =  %d \n", i, rand);

			for (int j = 0; j < tab.length; j++) {
				maxNombre = Math.max(maxNombre, tab[j]);
				minNombre = Math.min(minNombre, tab[j]);
			}
		}

		System.out.printf(" Le numéro plus grand = %d  \n", maxNombre);
		System.out.printf(" Le numéro plus petit = %d  \n", minNombre);
		
		
	}

}
