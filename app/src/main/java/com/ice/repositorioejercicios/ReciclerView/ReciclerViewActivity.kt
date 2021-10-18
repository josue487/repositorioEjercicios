package com.ice.repositorioejercicios.ReciclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ice.repositorioejercicios.R
import com.ice.repositorioejercicios.Clases.HeroAdapter
import com.ice.repositorioejercicios.Clases.dataClases.SuperHero

class ReciclerViewActivity : AppCompatActivity() , ReciclerViewContract.View{

    val reciclerViewPresenter = ReciclerViewPresenter(this, ReciclerViewModel())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recicler_view)
        reciclerViewPresenter.getListSuperHeros()
    }



    override fun initRecycler(superheros : List<SuperHero>){
        val superHero = this.findViewById(R.id.rvSuperHero) as RecyclerView
        superHero.layoutManager = LinearLayoutManager(this)
        val adapter = HeroAdapter(superheros)
        superHero.adapter = adapter

    }
}