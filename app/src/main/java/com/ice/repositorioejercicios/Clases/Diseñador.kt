package com.ice.repositorioejercicios.Clases

import com.ice.repositorioejercicios.Clases.openClases.Person

class Diseñador(name : String, age : Int) : Person(name,age){
    override fun work(){
        println("Esta persona esta diseñando")
    }
}