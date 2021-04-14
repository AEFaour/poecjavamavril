package fr.poecjava.javase.heritage.test;

import java.time.LocalDate;

import fr.poecjava.javase.classes.Personne;
import fr.poecjava.javase.heritage.Stagiaire;
import fr.poecjava.javase.heritage.StagiaireSalarie;

public class TestHeritage {

	public static void main(String[] args) {
		
		
		/*
		 * Stagiaire nicolas = new Stagiaire("Nicolas", LocalDate.of(2000, 1, 1));
		 * Stagiaire segolene = new Stagiaire("Ségolene", LocalDate.of(2000, 1, 1),
		 * "Java");
		 * 
		 * System.out.println("segolene.getCours() :  " + segolene.getCours());
		 * System.out.println("segolene.getCours() :  " + nicolas.getCours());
		 * 
		 * nicolas.setCours("C#");
		 * 
		 * System.out.println("segolene.getCours() :  " + nicolas.getCours());
		 * 
		 * System.out.println("segolene.getCours() :  " + nicolas.getAge());
		 * System.out.println("segolene.getCours() :  " + nicolas.description());
		 * nicolas.seMarier(segolene); System.out.println("segolene.getCours() :  " +
		 * nicolas.description());
		 * 
		 * StagiaireSalarie mauvais = new StagiaireSalarie("Mauvais", LocalDate.of(2000,
		 * 1, 1),"Java", 1000);
		 */

		Personne p = new Personne("Said",  LocalDate.of(2000, 5, 5));
		//System.out.println(p.description());
		Stagiaire s = new Stagiaire("Ludovic", LocalDate.of(2000, 1, 1), "JavaFX");
		//System.out.println(s.description());
		
		StagiaireSalarie ss = new StagiaireSalarie("Wiam", LocalDate.of(2000,5, 5),"C", 1000);
		
		//System.out.println(ss.description());
		
		Personne personne; 
		
		personne = p; 
		//System.out.println(personne.description());
		//System.out.println(personne.toString());
		//personne = s; 
		
		//System.out.println(personne.description());
		
		personne = ss; 
		
		//System.out.println(personne.description());//On parle de polymorphisme
		
		//On dit que la méthode description est polymor
		
		/*Stagiaire stagiaire; 
		stagiaire = (Stagiaire) p;*/ 
		/*int[] entiers = {1, -6, 8, 32, 8};
		Personne[] personnes = {p, s, ss};
		
		for (Personne pers : personnes) {
			System.out.println(pers.toString());
		}*/
		
		Personne p1 = new Personne("Said",  LocalDate.of(2000, 5, 5));
		Personne p2 = new Personne("Said",  LocalDate.of(2000, 5, 5));
		
		System.out.println(" p1.prenom  == p2.prenom ? " + p1.equals(p2));
		System.out.println(" p1.prenom  == p2.prenom ? " + p1.getPrenom().equals(p2.getPrenom()));
	}

}
