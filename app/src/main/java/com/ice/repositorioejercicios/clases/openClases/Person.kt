package com.ice.repositorioejercicios.clases.openClases

import com.ice.repositorioejercicios.clases.abstractClases.Work
import com.ice.repositorioejercicios.interfaces.Game

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