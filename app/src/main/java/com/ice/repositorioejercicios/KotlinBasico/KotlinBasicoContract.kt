package com.ice.repositorioejercicios.KotlinBasico

interface KotlinBasicoContract {

    interface View{

        fun mostrarDatosPorConsolaString(text : String)
        fun mostrarDatosPorConsolaInt(number : Int )
        fun mostrarDatosPorConsolaDouble(number : Double )
        fun mostrarDatosPorConsolaBoolean(bool : Boolean )

    }

    interface Presenter{
        fun variablesYConstantes()
        fun tiposDeDatos()
        fun sentenciaIf()
        fun sentenciaWhen()
        fun arrays()
        fun maps()
        fun loops()
        fun nullSafeti()
        fun funciones()
        fun sayHello()
        fun sayMyNameAndAge(nombre : String, edad : Int)
        fun sumarDosNumeros(primerNumero : Int, segundoNumero : Int) : Int
        fun clases()
    }

    interface Model{

    }

}