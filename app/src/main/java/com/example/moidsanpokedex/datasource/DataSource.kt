package com.example.moidsanpokedex.datasource

import com.example.moidsanpokedex.model.Pokemon

class DataSource {

    companion object {

        fun getPokemons():ArrayList<Pokemon>{
            var pokemons = ArrayList<Pokemon>()

            pokemons.add(Pokemon(1,"Bulbassaur","Grass&Poison"))
            pokemons.add(Pokemon(2,"Ivyssaur","Grass&Poison"))
            pokemons.add(Pokemon(3,"Venonssaur","Grass&Poison"))
            pokemons.add(Pokemon(4,"Squirtle","Water"))
            pokemons.add(Pokemon(5,"Wartottle","Water"))
            pokemons.add(Pokemon(6,"Blastoise","Water"))
            pokemons.add(Pokemon(7,"Charmander","Fire"))
            pokemons.add(Pokemon(8,"Charmeleon","Fire"))
            pokemons.add(Pokemon(9,"Charizard","Fire&Flying"))

            return pokemons

        }

    }
}