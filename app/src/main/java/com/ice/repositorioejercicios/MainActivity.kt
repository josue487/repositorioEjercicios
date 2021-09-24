package com.ice.repositorioejercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variablesYConstantes()
    }

    /*
    Aqui vamos a hablar de variables y constantes
     */
    private fun variablesYConstantes(){
        //Variables
        var myFirstVariable = "Hola Mundo"
        println(myFirstVariable)
        myFirstVariable = "Bienvenido"
        println(myFirstVariable)
        //No podemos asignar un int a una variable string
        //myFirstVariable = 1
        var mySecondVariable = "Suscribete"
        println(mySecondVariable)
        mySecondVariable = myFirstVariable
        myFirstVariable="ya te has suscrito?"
        println(myFirstVariable)
        println("no")

        //Constantes

        val myFirstConstant = "te ha gustado el tutorial?"
        println(myFirstConstant)
        //una constante no puede modificar su valor
        //myFirstConstant = ":D"
        val mySecondConstant = myFirstVariable
        println(mySecondConstant)
    }
}