package com.example.moidsanpokedex.datasource

import com.example.moidsanpokedex.model.Pokemon

class DataSource {

    companion object {

        fun getPokemons():ArrayList<Pokemon>{
            var pokemons = ArrayList<Pokemon>()

            pokemons.add(Pokemon(1,"Bulbassaur",4.0f,"Grass&Poison"))
            pokemons.add(Pokemon(2,"Ivyssaur",4.0f,"Grass&Poison"))
            pokemons.add(Pokemon(3,"Venonssaur",5.0f,"Grass&Poison"))
            pokemons.add(Pokemon(4,"Squirtle",3.0f,"Water"))
            pokemons.add(Pokemon(5,"Wartottle",3.0f,"Water"))
            pokemons.add(Pokemon(6,"Blastoise",4.5f,"Water"))
            pokemons.add(Pokemon(7,"Charmander",4.0f,"Fire"))
            pokemons.add(Pokemon(8,"Charmeleon",4.0f,"Fire"))
            pokemons.add(Pokemon(9,"Charizard",5.0f,"Fire&Flying"))

            return pokemons

        }

    }
}