package fr.poecjava.javase.heritage.concrets;

import java.time.LocalDate;

import fr.poecjava.javase.classes.Personne;
import fr.poecjava.javase.heritag.interfaces.IMusicien;

public class Batteur extends Personne implements IMusicien {

	public Batteur(String prenom, LocalDate ddn) {
		super(prenom, ddn);
		
	}

	@Override
	public void jouerInstrument() {
		System.out.println("Je joue de la batterie");
		
	}

}
