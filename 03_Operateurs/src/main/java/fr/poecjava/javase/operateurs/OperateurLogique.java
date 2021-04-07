package fr.poecjava.javase.operateurs;

public class OperateurLogique {

	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = false;
		
		System.out.printf("!a = %s\n", !a);
		
		System.out.printf("a & b = %s\n", a & b);
		System.out.printf("a && b = %s\n", a && b);
		
		System.out.printf("a | b = %s\n", a | b);
		System.out.printf("a || b = %s\n", a || b);
		
		System.out.printf("a ^ b = %s\n", a ^ b);
	}

}
