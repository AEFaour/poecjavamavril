package fr.poecjava.javase.collections;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> prenoms;
		ArrayList<Byte> bytes; 
		
		prenoms = new ArrayList();
		System.out.println(prenoms.size());
		
		prenoms.add("Segolene");
		System.out.println(prenoms.size());
		
		System.out.println(prenoms);
		System.out.println(prenoms.get(0));
		
		//Uen collection generique de string
		// Une ArraList est une collection ordonnée
		// Son premier element est à l'index 0
		ArrayList<String> chaines =  new ArrayList<>();
		
		List<Integer> entiers = new ArrayList<>();
		
		chaines.add("Ludivoc");
		chaines.add("Lucie");
		chaines.add("Anas");
		chaines.add("Ludivoc");
		chaines.add("Anes");
		
		int taille = chaines.size();
		System.out.println("taille =  " + taille);
		System.out.println("chaines =  " + chaines);
		System.out.println("entiers =  " + entiers);
		
		int[] tabEntiers = new int[2];
		
		System.out.println("tabEntiers =  " + tabEntiers);
		
	
		
		

	}

}
