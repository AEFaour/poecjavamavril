package fr.poecjava.javase.enumeration;

public enum Taille {
	XS, S,  M, l, XL, XXL 

}
enum Civilite {
	MADAME, MONSIEUR
}
class TestTaille {
	public static void main(String[] args) {
		
		Taille taille = Taille.XL;
		System.out.println("Taille = " + taille);
		
		Civilite c = Civilite.MADAME;
		
		System.out.println("Civilite = " + c);
	}
}
