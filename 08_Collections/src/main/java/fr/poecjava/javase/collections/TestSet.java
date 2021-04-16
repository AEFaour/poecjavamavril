package fr.poecjava.javase.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import fr.poecjava.javase.collections.classe.Personne;

public class TestSet {

	public static void main(String[] args) {
		
		// Une Collection Set est une collection trie
		// Les elements n'apparaissent pas dans leur ordre d'entrée
		HashSet<String> prenoms = new HashSet<>();
		Set<String> mesDoubles= new HashSet<>();
		
		prenoms.add("Maxime");
		prenoms.add("Julie");
		prenoms.add("Adelie");
		prenoms.add("Thomas");
		prenoms.add("Victor");
		prenoms.add("Julie");
		
		System.out.println(" code Maxime "+ Objects.hash("Maxime"));
		System.out.println(" code Julie "+ Objects.hash("Julie"));
		System.out.println(" code Adelie "+ Objects.hash("Adelie"));
		System.out.println(" code Thomas "+ Objects.hash("Thomas"));
		System.out.println(" code Victor "+ Objects.hash("Victor"));
		
		System.out.println("taille = " + prenoms.size());
		System.out.println("prenoms = " + prenoms);
		
		System.out.println("prenoms = " + prenoms);
		System.out.println(prenoms.contains("Julie"));
		
		String chaines = (String) prenoms.toArray()[2];
		System.out.println("prenoms = " + chaines);
		
		Set<Personne> personnes = new HashSet<>();
		
		Personne p1 = new Personne("Maxime", 26);
		personnes .add(p1);
		Personne p2 = new Personne("Julie", 21);
		personnes .add(p2);
		Personne p3 = new Personne("Adelie", 22);
		personnes .add(p3);
		Personne p4 = new Personne("Segolene", 19);
		personnes .add(p4);
		Personne p5 = new Personne("Loujair", 26);
		personnes .add(p5);
		
		System.out.println("personnes = " + personnes);
		
		System.out.println(personnes.contains(p4));
		
		//L'utlisation de la méthode contains necessite la redefinition de la 
		//méthode equals de la classe mere dans la classe objets à comparer
		System.out.println(personnes.contains(new Personne("Segolene", 19)));
		

	}

}
