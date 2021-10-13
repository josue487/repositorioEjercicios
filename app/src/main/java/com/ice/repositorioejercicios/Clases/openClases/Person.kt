package com.ice.repositorioejercicios.Clases.openClases

import com.ice.repositorioejercicios.Clases.abstractClases.Work
import com.ice.repositorioejercicios.Interfaces.Game

open class Person (name : String, age : Int) : Work(), Game {

    //Cualquier clase tiene una superclase común "Any"

    open fun work(){
        println("Esta persona esta trabajando")
    }

    override fun goToWork() {
        println("Esta persona va al trabajo")
    }

//    override val game: String
//        get() = "Amoung Us"

    override val game: String = "Amoung Us"

    override fun play() {
        println("Esta persona esta jugando a $game")
    }

 //   override fun stream() {
 //       super.stream()
 //   }
}