package fr.poecjava.javase.heritag.interfaces;

public interface ICompositeur {
	
	static final int compteur =1;

	
	
	void ecrirePartition();
	
	default void methodeParDefaut() {
		System.out.println("Je suis méthode par defaut");
	}
	
	
	default void autreMethodeParDefaut() {
		//System.out.println("Je suis une autre méthode par defaut");
	}
	
	
	static void autreMethode() {
		System.out.println("Je suis une  méthode static");
	}
}
