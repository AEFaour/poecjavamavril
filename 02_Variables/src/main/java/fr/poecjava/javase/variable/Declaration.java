package fr.poecjava.javase.variable;

public class Declaration {

	public static void main(String[] args) {
		// Declaration de variable
		
		int stagiaireId;
		
		//Assignation de valaeur
		
		stagiaireId = 25;
		
		System.out.printf("stagiaireId = %s\n", stagiaireId);
		
		//stagiaireId = 25.00; //N e compile pas car un entier est attendu
		//stagiaireId = "25"; //N e compile pas car un entier est attendu
		
		// Declaration suivie d'une assignation 
		int entier1= 2;
		
		System.out.printf("entier1 = %s\n", entier1);
		
		int a = entier1, b, c;
		
		System.out.printf("a = %s\n", a);
		//System.out.printf("b = %s\n", b);
		//System.out.printf("c = %s\n", c);
		
		var largeur = 22.5; 
		
		System.out.printf("largeur = %s\n", largeur);
		
		
		var prenom = "Anas";
		
		System.out.printf("prenom = %s\n", prenom);
		
		prenom = "Said";
		
		System.out.printf("prenom = %s\n", prenom);
		
		// prenom = 25; // --> Pas possible car prenom est de type String
		
        entier1= -42;
		
		System.out.printf("entier1 = %s\n", entier1);
		
		final int UNE_CONSTANTE;
		UNE_CONSTANTE = 36; 
		
		System.out.printf("UNE_CONSTANTE = %s\n", UNE_CONSTANTE);
		
		// UNE_CONSTANTE = 40; // On ne peut pas modifier le contenu d'une constante
		
		
		
	}
}

// Java est un langage fortement typé
// printf --> permet de faire un formatage affichage
// Toute variable déclarée dans une méthode doit être initialisée
// Depuis java 10, il est possible de faire l'inférence de type
// Le nom d'une variable ne peut pas commencer par un chiffre
