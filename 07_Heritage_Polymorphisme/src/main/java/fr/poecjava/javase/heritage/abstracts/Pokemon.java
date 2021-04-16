package fr.poecjava.javase.heritage.abstracts;

public abstract class Pokemon {
	
	private String nom; 
	private double poids;
	

	
	public Pokemon(String nom, double poids) {
		this.nom = nom;
		this.poids = poids;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	} 
	
	
	
	@Override
	public String toString() {
		return String.format("Je suis le Pokémon %s mon poids est de %s kg, ma vitesse est de %s km/h ", 
				this.getNom(), this.getPoids(), this.seDeplacer());			
	}

	public abstract double seDeplacer();
}
