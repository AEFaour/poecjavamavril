package fr.poecjava.javase.iteratives;

public class BoucleDoWhile {

	public static void main(String[] args) {
		
		int compteur = 1, val = 3;
			do {
				System.out.printf(" %d x %d = %d\n", val, compteur, val * compteur);
				compteur++;
			} while (compteur < 11);
		

	}

}
