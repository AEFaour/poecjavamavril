package fr.poecjava.javase.collections;

import java.util.Map;

import fr.poecjava.javase.collections.classe.Personne;

import java.util.HashMap;

public class TestMap {

	public static void main(String[] args) {
		
		//Map est un dictionnaire qui nous permet 
		// de stocker les elements sous la forme de paire (cle, valeur)
		// La cle est imuable, donc unique dans une Map
		//Une cle possede un et une seule valeur
		
		Map<Integer, String> dictionnaire = new HashMap<>();
		
		dictionnaire.put(2, "Victor");
		dictionnaire.put(3, "Lucie");
		dictionnaire.put(4, "Wiam");
		dictionnaire.put(2, "Patern");
		
		
		System.out.println("dictionnaire = " + dictionnaire);
		System.out.println(dictionnaire.get(4));
		
	
	}

}
