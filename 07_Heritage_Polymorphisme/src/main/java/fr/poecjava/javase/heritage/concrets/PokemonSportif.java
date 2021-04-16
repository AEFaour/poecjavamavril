package fr.poecjava.javase.heritage.concrets;

public class PokemonSportif extends PokemonContinental {

	private int frequenceCardio;
	

	public PokemonSportif(String nom, double poids, int nombrePattes, double taille) {

		super(nom, poids, nombrePattes, taille);

	}

	public PokemonSportif(String nom, double poids, int nombrePattes, double taille, int frequenceCardio) {

		super(nom, poids, nombrePattes, taille);

		this.frequenceCardio = frequenceCardio;

	}

	public int getFrequenceCardio() {
		return frequenceCardio;
	}

	public void setFrequenceCardio(int frequenceCardio) {
		this.frequenceCardio = frequenceCardio;
	}

	@Override
	public String toString() {
		return super.toString() + String.format(" ma fréquence cardiaque est de %s pulsations à la minute", 
				this.frequenceCardio);
	
	}

}
