package com.ice.repositorioejercicios

class Programador (name : String, age : Int , val lenguaje : String ) : Person(name,age) , Vehicle {

    override fun work(){
        println("Esta persona esta programando")
    }

    fun sayLenguaje () {
        println("Este programador usa el lenguaje de: $lenguaje")
    }

    override fun goToWork() {
        println("Esta persona va a google")
    }

    override fun drive() {
        println("Esta persona esta conduciendo un auto")
    }
}