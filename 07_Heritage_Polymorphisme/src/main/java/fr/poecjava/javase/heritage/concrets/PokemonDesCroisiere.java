package fr.poecjava.javase.heritage.concrets;

import fr.poecjava.javase.heritage.abstracts.PokemonHydro;

public class PokemonDesCroisiere extends PokemonHydro {
	
	
	

	public PokemonDesCroisiere(String nom, double poids, int nbNageoires) {
		super(nom, poids, nbNageoires);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double seDeplacer() {
		double vitesse = ((super.getPoids()/25)* (super.getNbNageoires()))/2; 
		return vitesse;
	}

}
