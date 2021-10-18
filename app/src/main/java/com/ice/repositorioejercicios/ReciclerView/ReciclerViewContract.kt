package com.ice.repositorioejercicios.ReciclerView

import com.ice.repositorioejercicios.Clases.dataClases.SuperHero

interface ReciclerViewContract {
    interface View{
        fun initRecycler(superheros : List<SuperHero>)
    }
    interface Presenter{
        fun getListSuperHeros()
    }
    interface Model{
        fun getListSuperHeros() : List<SuperHero>
    }

}