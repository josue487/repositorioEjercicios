package com.ice.repositorioejercicios

class Programmer(val name : String,var age : Int,val languages : Array<Language>, val friends : Array<Programmer>? = null) {

    fun code(){
        for(language : Language in languages){
            println("Se programar en $language")
        }
    }

    enum class Language{
        KOTLIN,
        SWIFT,
        JAVA,
        JAVASCRIPT
    }
}