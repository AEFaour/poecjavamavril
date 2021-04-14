package fr.poecjava.javase.heritage.concrets;

import fr.poecjava.javase.heritage.abstracts.Felin;

public class Chat extends Felin {

	public Chat(String couleur, double poids) {
		super(couleur, poids);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String  seDeplacer() {
		return "Je suis solitaire";
		
	}

}
