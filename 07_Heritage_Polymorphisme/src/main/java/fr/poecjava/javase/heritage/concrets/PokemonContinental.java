package fr.poecjava.javase.heritage.concrets;

import fr.poecjava.javase.heritage.abstracts.Pokemon;

public class PokemonContinental extends Pokemon {

	private int nombrePattes; 
	private double taille; 
	

	public PokemonContinental(String nom, double poids) {
		super(nom, poids);
		
	}
	

	public PokemonContinental(String nom, double poids, int nombrePattes, double taille) {
		super(nom, poids);
		this.nombrePattes = nombrePattes;
		this.taille = taille;
	}



	public int getNombrePattes() {
		return nombrePattes;
	}



	public void setNombrePattes(int nombrePattes) {
		this.nombrePattes = nombrePattes;
	}



	public double getTaille() {
		return taille;
	}



	public void setTaille(double taille) {
		this.taille = taille;
	}



	@Override
	public String toString() {
		return super.toString() + String.format("j'ai %s pattes, ma taille est de %sm",
				this.getNombrePattes(),this.getTaille());
	}


	@Override
	public double seDeplacer() {
		
		double vitesse = this.getNombrePattes() * this.getTaille()  * 3; 
		return vitesse;
	}

}
