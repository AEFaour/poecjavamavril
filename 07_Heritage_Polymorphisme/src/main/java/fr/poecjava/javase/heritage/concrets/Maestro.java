package fr.poecjava.javase.heritage.concrets;

import java.time.LocalDate;

import fr.poecjava.javase.classes.Personne;
import fr.poecjava.javase.heritag.interfaces.ICompositeur;
import fr.poecjava.javase.heritag.interfaces.IMusicien;

public class Maestro extends Personne implements IMusicien,  ICompositeur  {

	public Maestro(String prenom, LocalDate ddn) {
		
		super(prenom, ddn);
		
	}



	@Override
	public void jouerInstrument() {
		System.out.println("Je joue plusieurs instruments");
		
	}



	@Override
	public void ecrirePartition() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void methodeParDefaut() {
		System.out.println("Je suis méthode par defaut");
	}
	
	

}
