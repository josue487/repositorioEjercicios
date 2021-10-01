package com.ice.repositorioejercicios.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ice.repositorioejercicios.R
import com.ice.repositorioejercicios.clases.Programmer

class KotlinBasicoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_basico)

        //Leccion 1
        //variablesYConstantes()

        //Leccion 2 :D
        //tiposDeDatos()

        //Leccion 3
        //sentenciaIf()

        //Leccion 4
        //sentenciaWhen()

        //Leccion 5
        //arrays()

        //Leccion 6
        //maps()

        //Leccion 7
        //loops()

        //Leccion 8
        //nullSafeti()

        //Leccion 9
        //funciones()

        //Leccion 10
        clases()
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
/*
      Aqui vamos a hablar de mapas, tambien llamados diccionarios
 */
    private fun maps(){
    //Sintaxis
      var myMap : Map<String, Int> = mapOf()
      println(myMap)
    //Añadir Elementos
    //myMap = mapOf("Brais" to 1, "Pedro" to 2, "Sara" to 5)
    myMap = mutableMapOf("Brais" to 1, "Pedro" to 2, "Sara" to 5)
    println(myMap)

    //Añadir un solo valor
    myMap["Ana"] = 7
    myMap.put("Maria" , 8)
    println(myMap)

    //Actualizacion de un Dato
    myMap.put("Brais", 3)
    myMap["Brais"] = 4
    println(myMap)

    myMap.put("Marcos", 3)
    println(myMap)

    //acceso a un dato
    println(myMap["Brais"])

    // eliminacion de un dato
    myMap.remove("Brais")
    println(myMap)
    }

    //Aqui vamos a hablar de bucles

    private fun loops(){
        //Bucles
        val myArray : List<String> = listOf("Hola" , "Bienvenidos al Tutorial", "Suscribete" ,)
        var myMap : Map<String, Int> = mutableMapOf("Brais" to 1, "Pedro" to 2, "Sara" to 5)
        //For
        for (myString in myArray){
            println(myString)
        }
        for(myElement in myMap){
             println("${myElement.key} - ${myElement.value}")
        }
        for (x in 0..10){
            println(x)
        }

        for (x in 0 until 10){
            println(x)
        }
        for (x in 0..10 step 2){
            println(x)
        }

        for (x in 10 downTo 0 step 3){
            println(x)
        }

        val myNumericArray = (0..20)
        for (myNum in myNumericArray){
            println(myNum)
        }


        //While
        var x = 0

        while (x<10){
            println(x)
            x++
        }

    }

    /*
    Aqui vamos a hablar de seguridad contra nulos (Null Safety)
     */
    private fun nullSafeti(){
        var myString = "MoureDev"
       // myString = null Esto generaria error de compilacion
        println(myString)
        var mySafetyString : String? = "MoureDev null Safety"
        mySafetyString = null
        println(myString)

        if(mySafetyString != null){
            println(myString!!) //Fuerza que no sea nulo
        }else{
            println(myString)
        }
        mySafetyString = "Sus"
//        println(myString)

        //Safe call

        println(mySafetyString?.length)

        mySafetyString?.let {
            println(it)
        } ?: run{
           println(mySafetyString)
        }
    }

    /*
    Aqui vamos a hablar de funciones
     */
    fun funciones(){
        sayHello()
        sayMyNameAndAge("Josué", 24)
        println(sumarDosNumeros(1,2))
        println(sumarDosNumeros(1, sumarDosNumeros(1,2)))

    }

    //Funcion Simple
    fun sayHello(){
        println("Hola!")
    }

    //Funciones con parametros de entrada
    fun sayMyNameAndAge(nombre : String, edad : Int){
        println("Hola, mi nombre es $nombre y mi edad es $edad")
    }

    //Funciones con un valor de retorno
    fun sumarDosNumeros(primerNumero : Int, segundoNumero : Int) : Int{
         return primerNumero + segundoNumero
    }

    //Aqui vamos a Hablar de clases
    fun clases(){
        val brais  = Programmer("Brais", 32, arrayOf(Programmer.Language.KOTLIN, Programmer.Language.JAVA))
        println(brais.name)
        brais.age=24
        val sara = Programmer("Sara",25 , arrayOf(Programmer.Language.JAVASCRIPT), arrayOf(brais))
        sara.code()
        println("${sara.friends?.first()} es amigo de ${sara.name}")
    }

}