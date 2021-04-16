package fr.poecjava.javase.heritage.abstracts;

public abstract class PokemonHydro extends Pokemon {
	
	private int nbNageoires; 

	public PokemonHydro(String nom, double poids) {
		super(nom, poids);
	}
	
	public PokemonHydro(String nom, double poids, int nbNageoires) {
		super(nom, poids);
		
		this.nbNageoires = nbNageoires; 
	}

	public int getNbNageoires() {
		return nbNageoires;
	}

	public void setNbNageoires(int nbNageoires) {
		this.nbNageoires = nbNageoires;
	}
	
	

	@Override
	public String toString() {
		return super.toString() +String.format(" j'ai %s nagoires", this.getNbNageoires());
	}

	@Override
	public abstract double seDeplacer();

}
