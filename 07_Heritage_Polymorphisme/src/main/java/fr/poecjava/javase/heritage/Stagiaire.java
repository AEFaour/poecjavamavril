package fr.poecjava.javase.heritage;

import java.time.LocalDate;

import fr.poecjava.javase.classes.Personne;

public class Stagiaire extends Personne {

	private String cours;

	public Stagiaire(String prenom, LocalDate ddn) {
		super(prenom, ddn);
	}

	public Stagiaire(String prenom, LocalDate ddn, String cours) {
		super(prenom, ddn);
		this.cours = cours;
	}

	public String getCours() {
		return cours;
	}

	public void setCours(String cours) {
		this.cours = cours;
	}

}
