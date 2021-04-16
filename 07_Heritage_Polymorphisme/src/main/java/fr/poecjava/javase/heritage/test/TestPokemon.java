package fr.poecjava.javase.heritage.test;

import java.util.ArrayList;

import fr.poecjava.javase.heritage.concrets.CollectionPokemons;
import fr.poecjava.javase.heritage.abstracts.Pokemon;
import fr.poecjava.javase.heritage.concrets.PokemonCasanier;
import fr.poecjava.javase.heritage.concrets.PokemonDesCroisiere;
import fr.poecjava.javase.heritage.concrets.PokemonDesMers;
import fr.poecjava.javase.heritage.concrets.PokemonSportif;

public class TestPokemon {

	public static void main(String[] args) {
		 Pokemon pokemon1; 
		 
		 PokemonSportif pikachu = new PokemonSportif("Pikachu", 18, 2, 0.85, 120);
		 pokemon1  = pikachu ; 
		 System.out.println(pokemon1);
		 
		 Pokemon pokemon2; 
		 PokemonCasanier salameche = new PokemonCasanier("Salameche", 12, 2, 0.65, 8);
		 pokemon2 = salameche; 
		 System.out.println(pokemon2);
		 
		 Pokemon pokemon3; 
		 PokemonDesMers rondoudou = new PokemonDesMers("Rondoudou", 45, 2);
		 pokemon3 = rondoudou; 
		 System.out.println(pokemon3);
		 
		 Pokemon pokemon4; 
		 PokemonDesCroisiere bulbizarre = new  PokemonDesCroisiere("Bulbizarre", 15, 3);
		 pokemon4 = bulbizarre; 
		 System.out.println(pokemon4);
		 
         Pokemon pokemon5; 
		 
		 PokemonSportif pikachu2 = new PokemonSportif("Pikachu2", 8, 3, 1.10, 100);
		 pokemon5  = pikachu2 ; 
		 System.out.println(pokemon5);
		 
		 ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();  
		 
		 CollectionPokemons cp = new CollectionPokemons(pokemons);
		 
	     
		// cp.insertPokemon(pokemon);
		 System.out.println(cp.insertPokemon(pokemon1));
		 System.out.println(cp.insertPokemon(pokemon2));
		 System.out.println(cp.insertPokemon(pokemon3));
		 System.out.println(cp.insertPokemon(pokemon4));
		 System.out.println(cp.insertPokemon(pokemon5));
		 
		 System.out.println(cp.getPokemons());
		 System.out.println(cp.moyenVitesse());
		 System.out.println(cp.toString());
		 System.out.println(cp.toString());
		 System.out.println(cp.moyenVitessePS());
		 

	}

}
