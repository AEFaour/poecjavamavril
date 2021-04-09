package fr.poecjava.javase.exercices.iteratives;

import java.util.Scanner;

public class IterativeViaSaisie {

	public static void main(String[] args) {
	
		Scanner saisieNombreN = new Scanner(System.in);
		System.out.print("Veuillez saisir le nombre n : ");
		int nombreN = saisieNombreN.nextInt();

		Scanner saisieNombreM = new Scanner(System.in);
		System.out.print("Veuillez saisir le nombre m : ");
		int nombreM = saisieNombreM.nextInt();

		int myNombre;

		if (nombreM > nombreN) {

			myNombre = nombreN;

			while (myNombre <= nombreM) {
				System.out.printf(" Le nombre %d   = %d \n", myNombre, myNombre);
				myNombre++;
			}

		} else {
			myNombre = nombreM;

			while (myNombre <= nombreN) {
				System.out.printf(" Le nombre %d   = %d \n", myNombre, myNombre);
				myNombre++;
			}

		}

		Scanner saisieNombreN1 = new Scanner(System.in);
		System.out.print("Veuillez saisir le nombre n : ");
		int nombreN1 = saisieNombreN1.nextInt();

		Scanner saisieNombreM1 = new Scanner(System.in);
		System.out.print("Veuillez saisir le nombre m : ");
		int nombreM1 = saisieNombreM1.nextInt();

		int myNombre1;

		if (nombreM1 > nombreN1) {

			myNombre1 = nombreN1;

			while (myNombre1 <= nombreM1) {
				System.out.printf(" Le nombre %d   = %d \n", myNombre, myNombre);
				myNombre1++;
			}

		} else {
			System.out.println("Le nombre n doit être inférieure que m ");

		}

		Scanner saisieNombreN2 = new Scanner(System.in);
		System.out.print("Veuillez saisir le nombre n : ");
		int nombreN2 = saisieNombreN2.nextInt();

		Scanner saisieNombreM2 = new Scanner(System.in);
		System.out.print("Veuillez saisir le nombre m : ");
		int nombreM2 = saisieNombreM2.nextInt();

		int myNombre2;

		if (nombreM2 > nombreN2) {

			myNombre2 = nombreN2;

			while (myNombre2 <= nombreM2) {
				System.out.printf(" Le nombre %d   = %d \n", myNombre, myNombre);
				myNombre2++;
			}

		} else {
			int newN = nombreM2;
			int newM = nombreN2;
			myNombre2 = newN;

			while (myNombre2 <= newM) {
				System.out.printf(" Le nombre %d   = %d \n", myNombre2, myNombre2);
				myNombre2++;
			}

		}

		Scanner saisieNombreN3 = new Scanner(System.in);
		System.out.print("Veuillez saisir le nombre n : ");
		int nombreN3 = saisieNombreN3.nextInt();

		Scanner saisieNombreM3 = new Scanner(System.in);
		System.out.print("Veuillez saisir le nombre m : ");
		int nombreM3 = saisieNombreM3.nextInt();

		int myNombre3;

		if (nombreM3 > nombreN3) {

			myNombre3 = nombreN3;

			while (myNombre3 <= nombreN3) {
				System.out.printf(" Le nombre %d   = %d \n", myNombre, myNombre);
				myNombre3++;
			}

		} else {
			int newN1 = nombreM3;
			int newM1 = nombreN3;
			myNombre3 = newM1;

			while (myNombre3 >= newN1) {
				System.out.printf(" Le nombre %d   = %d \n", myNombre3, myNombre3);
				myNombre3--;
			}

		}

		Scanner saisieNombreN4 = new Scanner(System.in);
		System.out.print("Veuillez saisir le nombre n : ");
		int nombreN4 = saisieNombreN4.nextInt();

		Scanner saisieNombreM4 = new Scanner(System.in);
		System.out.print("Veuillez saisir le nombre m : ");
		int nombreM4 = saisieNombreM4.nextInt();

		int myNombre4;

		if (nombreM4 > nombreN4) {

			myNombre4 = nombreN4;

			while (myNombre4 <= nombreM4) {
				System.out.printf(" Le nombre %d   = %d \n", myNombre4, myNombre4);
				myNombre4++;
			}

		} else {
			myNombre4 = nombreM4;
			int sommePaire = 0;

			while (myNombre4 <= nombreN4) {
				if (myNombre4 % 2 != 0) {
					myNombre4++;
					continue;
				}
				sommePaire += myNombre4;
				System.out.printf(" En ajoutant le nombre %d la somme devient   = %d \n", myNombre4, sommePaire);
				myNombre4++;

			}

		}

	}

}
