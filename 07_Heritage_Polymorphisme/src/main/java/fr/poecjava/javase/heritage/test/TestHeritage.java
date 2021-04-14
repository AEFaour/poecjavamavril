package fr.poecjava.javase.heritage.test;

import java.time.LocalDate;

import fr.poecjava.javase.heritage.Stagiaire;
import fr.poecjava.javase.heritage.StagiaireSalarie;

public class TestHeritage {

	public static void main(String[] args) {
		
		
		Stagiaire nicolas = new Stagiaire("Nicolas", LocalDate.of(2000, 1, 1));
		Stagiaire segolene = new Stagiaire("Ségolene", LocalDate.of(2000, 1, 1), "Java");
		
		System.out.println("segolene.getCours() :  " + segolene.getCours());
		System.out.println("segolene.getCours() :  " + nicolas.getCours());
		
		nicolas.setCours("C#");
		
		System.out.println("segolene.getCours() :  " + nicolas.getCours());
		
		System.out.println("segolene.getCours() :  " + nicolas.getAge());
		System.out.println("segolene.getCours() :  " + nicolas.description());
		nicolas.seMarier(segolene);
		System.out.println("segolene.getCours() :  " + nicolas.description());
		
		StagiaireSalarie mauvais = new StagiaireSalarie("Mauvais", LocalDate.of(2000, 1, 1),"Java", 1000);

	}

}
