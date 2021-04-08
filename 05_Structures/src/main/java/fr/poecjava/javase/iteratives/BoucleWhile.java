package fr.poecjava.javase.iteratives;

public class BoucleWhile {

	public static void main(String[] args) {
		int compteur = 1, val = 1;
		
		while(val <11 ) {
		while (compteur < 11) {
			System.out.printf(" %d x %d = %d\n", val, compteur, val*compteur);
			compteur++;
		}
		}
		
		/*System.out.println("\n=====================MULTIPLICATION===============\n");
		int val = 1;

		while (val < 11) {
			int compteur = 1;
			while (compteur < 11) {
				System.out.printf(" %d x %d = %d\n", val, compteur, val * compteur);
				compteur++;
			}
			val++;
		}*/

	}

}
