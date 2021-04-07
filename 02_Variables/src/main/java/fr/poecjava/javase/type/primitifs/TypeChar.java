package fr.poecjava.javase.type.primitifs;

public class TypeChar {
	public static void main(String[] args) {
		/**
		 * Un char est entier non signé codé sur 2 octets soit 16 bit
		 */
		System.out.println("========Type Char=======\n");

		char lettre;

		lettre = 'A';

		System.out.printf("lettre = %s\n", lettre);

		lettre = 'B';

		System.out.printf("lettre = %s\n", lettre);
		
		lettre = 66;
		System.out.printf("lettre = %s\n", lettre);
		System.out.printf("lettre = %s\n", (short)lettre);
		
		char charMin = Character.MIN_VALUE;
		char charMax = Character.MAX_VALUE;
		
		System.out.printf("charMin = %s\n", charMin);
		System.out.printf("charMax = %s\n", charMax);
		System.out.printf("charMin = %s\n", (int) charMin);
		System.out.printf("charMax = %s\n", (int) charMax);
		
		String prenom = "Anas"; //Chaîne de caractères 
		
		System.out.printf("prenom = %s\n", prenom);
		
		

	}
}
