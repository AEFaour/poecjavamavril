package fr.poecjava.javase.heritage.concrets;

import java.util.ArrayList;

import fr.poecjava.javase.heritage.abstracts.Pokemon;

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
			if(this.getPokemons().size() > 0) {
			moyen += pokemon.seDeplacer() / this.getPokemons().size();
			}else {
				moyen= 0.0;
			}

		}

		return moyen;
	}

	public double moyenVitessePS() {

		double moyen = 0.0;
		
		int nbSportif = 0;

		for (Pokemon pokemon : this.getPokemons()) {
			if (pokemon instanceof PokemonSportif ) {
				nbSportif++;
				if(nbSportif > 0) {
				moyen += pokemon.seDeplacer() / nbSportif;
				}else {
					moyen= 0.0;
				}

			}
			
		}

		return moyen;
	}

	@Override
	public String toString() {
		return String.format("Les pokémons %s sont %s et la vitesse moyenne est %s", this.getClass().getSimpleName(),
				getPokemons(), moyenVitesse());
	}

}
