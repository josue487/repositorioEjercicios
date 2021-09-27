package com.ice.repositorioejercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AndroidMedioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_medio2)
        //Enum Clases
        enumClases()
    }

    //Leccion 1 Kotlin Intermedio : Enum Clases

    enum class Direccion(val dir : Int){

        NORTH(1), SOUTH(-1), EAST(1), WEST(-1);

        fun descripcion() : String {

            return when(this){
                NORTH -> {
                   "La direccion es Norte"
                } SOUTH -> {
                    "La direccion es Sur"
                } EAST -> {
                    "La direccion es Este"
                } WEST -> {
                    "La direccion es Oeste"
                }
            }
        }
    }

    private fun enumClases(){
        var userDireccion : Direccion? = null
        println("Direccion : $userDireccion")

        userDireccion=Direccion.SOUTH
        println("Direccion : $userDireccion")

        userDireccion=Direccion.WEST
        println("Direccion : $userDireccion")

        println("Propiedad name : ${userDireccion.name}")
        println("Propiedad ordinal : ${userDireccion.ordinal}")

        //Funciones
        println(userDireccion.descripcion())

        //Inicializacion
        println(userDireccion.dir)
    }

}