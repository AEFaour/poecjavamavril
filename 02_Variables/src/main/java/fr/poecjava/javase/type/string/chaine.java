package fr.poecjava.javase.type.string;

public class chaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String prenom = "Anas";
		String uneChaineVide = "";
		
		System.out.printf("prenom = %s\nuneChaineVide = %s \n", prenom, uneChaineVide);
		System.out.printf("longueur = %s \n", prenom.length());
		System.out.printf("Maj = %s \n", prenom.toUpperCase());
		System.out.printf("", prenom.charAt(prenom.length()-1));
		
		String salut = "Bonjour";
		System.out.println(salut.substring(2));
		System.out.println(salut.substring(2, 4));
		System.out.println(salut.startsWith("B"));

	}

}

//Le type n'est pas un type primitif
