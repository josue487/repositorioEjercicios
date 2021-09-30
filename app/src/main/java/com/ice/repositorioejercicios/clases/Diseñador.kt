package com.ice.repositorioejercicios.clases

import com.ice.repositorioejercicios.clases.openClases.Person

class Diseñador(name : String, age : Int) : Person(name,age){
    override fun work(){
        println("Esta persona esta diseñando")
    }
}