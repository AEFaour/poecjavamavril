package fr.poecjava.javase.heritage.concrets;

import fr.poecjava.javase.heritage.abstracts.Felin;

public class Lion extends Felin {

	public Lion(String couleur, double poids) {
		super(couleur, poids);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String  seDeplacer() {
		return "Je me deplace en bande";
		
	}

}
