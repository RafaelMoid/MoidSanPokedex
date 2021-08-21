package com.example.moidsanpokedex.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moidsanpokedex.R
import com.example.moidsanpokedex.model.Pokemon
import kotlinx.android.synthetic.main.layout_lista_jogos.view.*


class PokemonsAdapter(var listaPokemons: ArrayList<Pokemon>) : RecyclerView.Adapter<PokemonsAdapter.PokemonViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val itemView = LayoutInflater.from(parent).inflate(R.layout.layout_lista_jogos, parent, false)

        return PokemonViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        val pokemon = listaPokemons[position]
        holder.bind(pokemon)
    }

    override fun getItemCount(): Int {
        return listaPokemons.size
    }

    class PokemonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(pokemon: Pokemon){
            itemView.nomeDoPokemon.text = pokemon.pokemonName
            itemView.pokemonType.text = pokemon.tipoDoPokemon
            itemView.ratingBar.rating = pokemon.rating.toFloat()

        }
    }
}