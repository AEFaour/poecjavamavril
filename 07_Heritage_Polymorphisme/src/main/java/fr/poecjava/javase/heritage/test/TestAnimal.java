package fr.poecjava.javase.heritage.test;

import fr.poecjava.javase.heritage.abstracts.Animal;
import fr.poecjava.javase.heritage.concrets.Chat;
import fr.poecjava.javase.heritage.concrets.Lion;

public class TestAnimal {

	public static void main(String[] args) {
		Animal animal;

		//animal = new Animal("Jaune", 105.5);
		Lion simba = new Lion("Mauve", 200);
		
		animal = simba; 
		
		System.out.println(animal);
		
		Chat milou = new Chat("Blanc", 4.5);
		
		animal = milou; 
		
		System.out.println(animal);

	}

}
