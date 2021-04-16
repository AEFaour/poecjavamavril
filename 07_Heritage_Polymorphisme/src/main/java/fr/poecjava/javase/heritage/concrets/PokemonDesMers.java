package fr.poecjava.javase.heritage.concrets;

import fr.poecjava.javase.heritage.abstracts.PokemonHydro;

public class PokemonDesMers extends PokemonHydro {

	public PokemonDesMers(String nom, int poids, int nbNageoires) {
		super(nom, poids, nbNageoires);
		
	}
	

	@Override
	public double seDeplacer() {
		double vitesse = (super.getPoids()/25)*( super.getNbNageoires()); 
		return vitesse;
	}

}
