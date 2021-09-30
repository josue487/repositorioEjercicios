package com.ice.repositorioejercicios.clases

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.ice.repositorioejercicios.R
import com.ice.repositorioejercicios.clases.dataClases.SuperHero
import com.squareup.picasso.Picasso

class HeroAdapter (val superHeroList : List<SuperHero>) : RecyclerView.Adapter<HeroAdapter.HeroHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HeroHolder( layoutInflater.inflate(R.layout.item_superhero , parent , false ))
    }

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.render(superHeroList[position] )
    }

    override fun getItemCount(): Int =  superHeroList.size


    class HeroHolder(val view : View) : RecyclerView.ViewHolder(view){
        val superheroName = view.findViewById(R.id.tvSuperHeroName) as TextView
        val realName = view.findViewById(R.id.tvRealName) as TextView
        val publisher = view.findViewById(R.id.tvPublisher) as TextView
        val avatar = view.findViewById(R.id.ivHero) as ImageView

        fun render(superHero: SuperHero){
            superheroName.text = superHero.superHeroName
            realName.text = superHero.realName
            publisher.text = superHero.publisher
            Picasso.get().load(superHero.image).into(avatar)
            view.setOnClickListener(){ Toast.makeText(view.context, "Has seleccionado a ${superHero.superHeroName} " , Toast.LENGTH_SHORT).show() }

        }
    }
}