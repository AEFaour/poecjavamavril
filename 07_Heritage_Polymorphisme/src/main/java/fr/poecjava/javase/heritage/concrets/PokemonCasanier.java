package fr.poecjava.javase.heritage.concrets;

public class PokemonCasanier extends PokemonContinental  {
	
	private int nbHrTele;

	public PokemonCasanier(String nom, double poids, int nombrePattes, double taille) {
		super(nom, poids, nombrePattes, taille);
	
	}
	
	public PokemonCasanier(String nom, double poids, int nombrePattes, double taille, int nbHrTele) {
		super(nom, poids, nombrePattes, taille);
		this.nbHrTele = nbHrTele; 
	
	}

	public int getNbHrTele() {
		return nbHrTele;
	}

	public void setNbHrTele(int nbHrTele) {
		this.nbHrTele = nbHrTele;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + String.format(" je regarde la télé %sh par jour", 
				this.getNbHrTele());
	
	}
	

}
