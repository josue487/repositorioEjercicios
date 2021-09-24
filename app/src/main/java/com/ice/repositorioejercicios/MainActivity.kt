package com.ice.repositorioejercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //variablesYConstantes()
        tiposDeDatos()
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

   /*
   Aqui vamos a hablar de tipos de datos
    */
    private fun tiposDeDatos(){
        //String

       val myString : String = "Hola Peter"
       val myString2 = "Bienvenido"
       val myString3 = myString + " " + myString2

       // Enteros (Byte, Short, Int, Long)

       val myInt : Int = 1
       val myInt2 = 2
       val myInt3 = myInt + myInt2
       println(myInt3)

       // Decimales (Float, Double)
       val myDouble = 1.5
       val myFloat = 1.5f
       val myDouble2 = 2.6
       val myDouble3 : Int = 1 //En realidad este es Int
       val myDouble4 = myDouble + myDouble2 + myDouble3
       println(myDouble4)

       //Boolean (bool)
       val myBool = true
       val myBool2 = false
       //val myBool3 = myBool + myBool2
       println(myBool == myBool2)
       println(myBool && myBool2)
       println(myBool || myBool2)
    }
}