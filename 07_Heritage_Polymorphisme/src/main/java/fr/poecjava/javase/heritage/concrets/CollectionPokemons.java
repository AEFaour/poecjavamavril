package fr.poecjava.javase.heritage.concrets;

import java.util.ArrayList;

import fr.poecjava.javase.heritage.abstracts.Pokemon;
import fr.poecjava.javase.heritage.concrets.PokemonSportif;

public class CollectionPokemons {

	private ArrayList<Pokemon> pokemons;

	public CollectionPokemons(ArrayList<Pokemon> pokemons) {
		super();
		this.pokemons = pokemons;
	}

	public ArrayList<Pokemon> getPokemons() {
		return pokemons;
	}

	public void setPokemons(ArrayList<Pokemon> pokemons) {
		this.pokemons = pokemons;
	}

	public ArrayList<Pokemon> insertPokemon(Pokemon pokemon) {

		this.pokemons.add(pokemon);

		return this.pokemons;
	}

	public double moyenVitesse() {

		double moyen = 0.0;

		for (Pokemon pokemon : this.getPokemons()) {
			moyen += pokemon.seDeplacer() / this.getPokemons().size();

		}

		return moyen;
	}

	public double moyenVitessePS() {

		double moyen = 0.0;

		ArrayList<PokemonSportif> pokemensp = new ArrayList<PokemonSportif>();

			for (PokemonSportif ps : pokemensp) {
				
				// this.pokemons.add(pokemon);
				//this.pokemons.add(ps);
				moyen += ps.seDeplacer() /  pokemensp.size();
			}

		return moyen;
	}

	@Override
	public String toString() {
		return String.format("Les pokémons %s sont %s et la vitesse moyenne est %s", pokemons, getPokemons(),
				moyenVitesse());
	}

}
