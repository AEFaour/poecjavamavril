package fr.poecjava.javase.type.primitifs;

public class TypeFloattant {

	public static void main(String[] args) {
		// Ce sont les nombres à virgules signé, codé sur 4 octets soit 32 bits la valeur
		// par defaut d'un int est 0.0
		System.out.println("========Type Float=======\n");
		float unFloat= 2.12F;
		
		System.out.printf("unFloat = %s\n", unFloat);
		System.out.printf("MinFloat = %s\n", Float.MIN_VALUE);
		System.out.printf("MaxFloat = %s\n", Float.MAX_VALUE);
		
		System.out.println("========Type Double=======\n");
		
		// Le type double est un nombre à virgules signé, codé sur 8 octets soit 64 bits la valeur
		// par defaut d'un int est 0.0
		
		double unDouble = 3.2; 
		
		System.out.printf("unDouble = %s\n", unDouble);
		System.out.printf("MinDouble = %s\n", Double.MIN_VALUE);
		System.out.printf("MaxDouble = %s\n", Double.MAX_VALUE);
		
		unDouble = unFloat; 
		
		System.out.printf("unDouble = %s\n", unDouble);
		
		unFloat = (float) unDouble;
		System.out.printf("unFloat = %s\n", unFloat);

	}

}

// byte --> short --> int --> long --> float --> double
