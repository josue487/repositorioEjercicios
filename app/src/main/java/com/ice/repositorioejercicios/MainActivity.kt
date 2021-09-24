package com.ice.repositorioejercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Leccion 1
        //variablesYConstantes()

        //Leccion 2 :D
        //tiposDeDatos()

        //Leccion 3
        //sentenciaIf()

        //Leccion 4
        //sentenciaWhen()

        //Leccion 5
        arrays()
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

    /*
    Aqui vamos a hablar de sentencia if
     */
    private fun sentenciaIf(){
        val myNumber = 12
        //Operadores Condicionales
        //> Mayor
        //< Menor
        // >= Mayor o Igual que
        // >= Menor o igual que
        // == Igualdad
        // != Desigual
        if(!(myNumber <= 10 && myNumber > 5) || (myNumber==53)){
            //Sentencia if
            println("$myNumber es menor que 10 y mayor que 5 o es igual a 53")
        }else if(myNumber == 60){
            println("$myNumber es igual a 60")
        }else if(myNumber !=70){
            println("$myNumber No es igual a 70")
        }
        else{
            //Sentencia Else
            println("$myNumber es mayor que 10 o menor o igual que 5 y no es igual a 53")
        }
    }

    /*
    Aqui vamos a hablar de la sentencia when
     */
    private fun sentenciaWhen(){
        //When con String
        val country = "España"
        when(country){
            "España"->{
                println("El Idioma es Español")
            } "Mexico" ->{
                   println("El Idioma es Español")
            } "Peru" ->{
                   println("El Idioma es Español")
            } "Argentina" ->{
                   println("El Idioma es Español")
            } "EEUU" ->{
                   println("El Idioma es Ingles")
            } "Francia" -> {
                  println("El Idioma es Frances")
            } else ->{
            println("No Conocemos el Idioma")
            }
        }

        //When con Int
        val age = 10
        when(age){
            0, 1, 2-> {
                "Eres un bebe"
            } in 3 .. 10 -> {
                "Eres un niño"
            } in 11 .. 17 -> {
                "Eres un Adolecente"
            } in 18 .. 69 -> {
                "Eres un adulto"
            } in 70 .. 99 -> {
                "Eres Anciano"
            } else -> {
                println(":D")
            }
        }

    }

    /*
    Aqui vamps a hablar de arrays o arreglos
     */
    private fun arrays(){
        val name = "arrays"
        val surname = "Moure"
        val company = "MoureDev"
        val age = "32"
        //Creacion de un Array
        val myArray = arrayListOf<String>()
        //Añadir datos de uno en uno
        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)

        println(myArray)

        //Añadir un conjunto de Datos
        myArray.addAll(listOf("Hola" , "Bienvenidos al Tutorial"))

        println(myArray)

        //Acceso a Datos

        val myCompany : String = myArray[2]
        println(myCompany)

        //Modificacion de Datos
        myArray[5] = "Suscribete y activa la campana"
        println(myArray)

        //Eliminar Datos
        myArray.removeAt(4)
        println(myArray)

        //Recorrer
        myArray.forEach{
            println(it)
        }

        //Otras Operaciones
        println(myArray.count())
        myArray.clear()
        println(myArray.count())

        myArray.first()
        myArray.last()
        myArray.sort()
        
    }
}