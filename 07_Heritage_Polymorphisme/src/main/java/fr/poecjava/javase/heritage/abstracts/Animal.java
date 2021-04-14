package fr.poecjava.javase.heritage.abstracts;

public abstract class Animal {
	private String couleur; 
	private double poids;
	
	
	public Animal(String couleur, double poids) {
		this.couleur = couleur;
		this.poids = poids;
	}
	
	
	public String getCouleur() {
		return couleur;
	}


	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}


	public double getPoids() {
		return poids;
	}


	public void setPoids(double poids) {
		this.poids = poids;
	}


	public String boire() {
		return "Je bois de l'eau";
		
	}
	
	public abstract String manger();
	public abstract String seDeplacer();


	@Override
	public String toString() {
		return String.format( "Je suis un %s et ma couleur est %s et je pèse %s Kg \n %s et %s \n", 
				getClass().getSimpleName(), couleur, poids, seDeplacer(), manger());
	}
	
	

}
