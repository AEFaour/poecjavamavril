package fr.poecjava.javase.decision;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		System.out.print("N° Etage : ");
		int etage = saisie.nextInt();
		
		int etageReel;
		
		// Structure decissionnlle --> if
		
		if(etage > 13) {
			etageReel = etage - 1;
		} else {
			etageReel = etage;
		}
		
		System.out.println("L'ascenseur se rendra à l'étage " + etageReel);
		
		
		saisie.close();

	}

}
