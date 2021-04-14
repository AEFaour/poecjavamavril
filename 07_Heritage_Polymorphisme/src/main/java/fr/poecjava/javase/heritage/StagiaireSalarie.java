package fr.poecjava.javase.heritage;

import java.time.LocalDate;

public class StagiaireSalarie extends Stagiaire{

	public StagiaireSalarie(String prenom, LocalDate ddn, String cours) {
		super(prenom, ddn, cours);
	}
	private int salaire;
	
	
	public StagiaireSalarie(String prenom, LocalDate ddn, String cours, int salaire) {
		super(prenom, ddn, cours);
		
		this.salaire = salaire;
	}

	
	

}
