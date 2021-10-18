package com.ice.repositorioejercicios.Clases

import com.ice.repositorioejercicios.Clases.openClases.Person
import com.ice.repositorioejercicios.Interfaces.Vehicle

class Programador (name : String, age : Int , val lenguaje : String ) : Person(name,age) , Vehicle {

    override fun work() : String{
       return "Esta persona esta programando"
    }

    fun sayLenguaje () : String {
        return "Este programador usa el lenguaje de: $lenguaje"
    }

    override fun goToWork() : String {
        return "Esta persona va a google"
    }

    override fun drive() : String {
        return "Esta persona esta conduciendo un auto"
    }
}