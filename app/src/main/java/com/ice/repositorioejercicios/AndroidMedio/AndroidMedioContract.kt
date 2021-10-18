package com.ice.repositorioejercicios.AndroidMedio

import com.ice.repositorioejercicios.Clases.dataClases.Worker

interface AndroidMedioContract {

    interface View{
        fun mostrarDatosPorConsolaString(text : String)
        fun mostrarDatosPorConsolaInt(number : Int )
        fun mostrarDatosPorConsolaDouble(number : Double )
        fun mostrarDatosPorConsolaBoolean(bool : Boolean )
    }

    interface Presenter{
        fun enumClases()
        fun nestedAndInnerClasses()
        fun classInheritance()
        fun interfaces()
        fun visivilityModifiers()
        fun dataClasses()
        fun typeAliases()
        fun  destructuringDeclaration()
        fun myWorker() : Worker
        fun extensions()
        fun lambdas()
        fun myOperateFun(x:Int , y: Int, myFun : (Int, Int) -> Int ) : Int
        fun myAsyncFun(name : String, hello:(String) -> Unit)
    }

    interface Model{

    }

}