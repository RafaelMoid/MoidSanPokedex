package com.example.moidsanpokedex.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moidsanpokedex.model.Pokemon
import kotlinx.android.synthetic.main.layout_lista_jogos.view.*


class PokemonsAdapter(var listaPokemons: ArrayList<Pokemon>) : RecyclerView.Adapter<PokemonsAdapter.PokemonViewHolder>() {

    class PokemonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(pokemon: Pokemon){
            itemView.nomeDoPokemon.text = pokemon.pokemonName
            itemView.pokemonType.text = pokemon.tipoDoPokemon
            itemView.ratingBar.rating = pokemon.rating.toFloat()

            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}