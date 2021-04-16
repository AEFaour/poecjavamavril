package fr.poecjava.javase.collections.tri;

import java.util.Arrays;
import java.util.Collections;

public class TestTriTableau {

	public static void main(String[] args) {
		
		//Tableau non trié
		Integer[] nombres = new Integer[] {15, 11, 9, 55, 47, 18, 520,1123, 366, 420};
		
		System.out.println("Arrays.toString(nombres) = " + Arrays.toString(nombres));
		
		Arrays.sort(nombres);
		System.out.println("nombres = " + Arrays.toString(nombres));
		
		Arrays.sort(nombres, Collections.reverseOrder());
		
		System.out.println("nombres = " + Arrays.toString(nombres));
		
		//Tri du tableau de 2 à 6
		
		Arrays.sort(nombres, 2, 6);
		
		System.out.println("nombres = " + Arrays.toString(nombres));
		

	}

}
