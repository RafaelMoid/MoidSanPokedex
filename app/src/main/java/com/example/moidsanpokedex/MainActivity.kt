package com.example.moidsanpokedex

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moidsanpokedex.adapter.PokemonsAdapter
import com.example.moidsanpokedex.datasource.DataSource
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciarRecyclerView()

    }

    private fun iniciarRecyclerView() {
        recyclerViewPokemons.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerViewPokemons.adapter = PokemonsAdapter(DataSource.getPokemons())
    }
}