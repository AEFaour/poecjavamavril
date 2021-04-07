package fr.poecjava.javase.operateurs;

public class OperateurAssignation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int poids = 25;

		System.out.printf("poids = %s\n", poids);

		poids = poids + 5;

		System.out.printf("poids = %s\n", poids);

		poids += 5; // poids = poids + 5
		System.out.printf("poids = %s\n", poids);
		
		poids++; // post d'incremetation
		System.out.printf("poids = %s\n", poids);

		++poids; // d'incremetation
		System.out.printf("poids = %s\n", poids);
		
		System.out.printf("poids = %s\n", poids++);
		
		System.out.printf("poids = %s\n", poids);
		
		System.out.printf("poids = %s\n", ++poids);
	}

}
