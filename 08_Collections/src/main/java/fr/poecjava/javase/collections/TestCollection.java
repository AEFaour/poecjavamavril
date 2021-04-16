package fr.poecjava.javase.collections;

import java.util.ArrayList;

public class TestCollection {

	public static void main(String[] args) {
		
		//Une Collection Liste non generique
		ArrayList maListe = new ArrayList();
		
		int taille = maListe.size();
		System.out.println("taille =  " + taille);
		maListe.add("Ludovic");
		taille = maListe.size();
		System.out.println("taille =  " + taille);
		maListe.add(10);
		taille = maListe.size();
		System.out.println("taille =  " + taille);
		maListe.add(5.3);
		taille = maListe.size();
		System.out.println("taille =  " + taille);
		System.out.println("maListe =  " + maListe);
		String ludovic = (String) maListe.get(0);
		System.out.println(ludovic);
		Integer dix = (Integer) maListe.get(1);
		System.out.println(dix);

		
		// Dans 
	}

}
