package com.ice.repositorioejercicios

private class Visibility {
    var name : String? = null

    private fun sayMyName(){
        name?.let{
            println("Mi Nombre es $it")
        } ?: run{
            println("No tengo Nombre")
        }
    }
}


open class VisibilityTwo{
    protected fun sayMyNameTwo(){
        val visibility = Visibility()
        visibility.name = "Brais"
    }
}


class VisibilityThree : VisibilityTwo (){
    internal val age : Int? = null
    fun sayMyNameThree(){
        sayMyNameTwo()
    }
}