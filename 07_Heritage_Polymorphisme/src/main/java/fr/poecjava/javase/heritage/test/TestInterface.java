package fr.poecjava.javase.heritage.test;

import java.time.LocalDate;
import java.time.Month;

import fr.poecjava.javase.classes.Personne;
import fr.poecjava.javase.heritag.interfaces.ICompositeur;
import fr.poecjava.javase.heritag.interfaces.IMusicien;
import fr.poecjava.javase.heritag.interfaces.IMusicienCompositeur;
import fr.poecjava.javase.heritage.concrets.Batteur;
import fr.poecjava.javase.heritage.concrets.Maestro;

public class TestInterface {
	public static void main(String[] args) {

		Personne personne;
		// Une interface ne s'intecier pas
		IMusicien musicien;
		ICompositeur compositeur;

		IMusicienCompositeur musicienCompositeur;

		Batteur batteur = new Batteur("Phils Colins", LocalDate.of(1960, Month.APRIL, 10));

		musicien = batteur;
		musicien.jouerInstrument();

		personne = batteur;
		personne.description();

		System.out.println(personne.description());

		Maestro maestro = new Maestro("Eric Clapton", LocalDate.of(1860, Month.APRIL, 10));
		musicien = maestro;
		musicien.jouerInstrument();
		compositeur = maestro;
		compositeur.ecrirePartition();
		compositeur.methodeParDefaut();
		
		batteur.seMarier(maestro);
		System.out.println(maestro.description());
		

	}

}
