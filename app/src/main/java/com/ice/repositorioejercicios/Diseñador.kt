package com.ice.repositorioejercicios

class Diseñador(name : String, age : Int) : Person(name,age){
    override fun work(){
        println("Esta persona esta diseñando")
    }
}