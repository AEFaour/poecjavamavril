package fr.poecjava.javase.heritage.abstracts;

public abstract  class Felin extends Animal{

	public Felin(String couleur, double poids) {
		super(couleur, poids);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String manger() {
		return "Je mange de la viande";
		
	}


}
