package fr.poecjava.javase.iteratives;

public class RuptureContinue {

	public static void main(String[] args) {
		int compteur = 1, val = 3;

		while (val < 11) {
			while (compteur < 11) {
				if(compteur == 5) {
					compteur++;
					continue;
				}
				System.out.printf(" %d x %d = %d\n", val, compteur, val * compteur);
				compteur++;
			}
		}

	}

}
