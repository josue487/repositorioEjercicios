package com.ice.repositorioejercicios.KotlinBasico

import com.ice.repositorioejercicios.Clases.Programmer

class KotlinBasicoPresenter(private val kotlinBasicoView : KotlinBasicoContract.View,
                            private val KotlinBasicoModel : KotlinBasicoContract.Model) : KotlinBasicoContract.Presenter {



    /*
    Aqui vamos a hablar de variables y constantes
     */
    override fun variablesYConstantes() {
        //Variables
        var myFirstVariable = "Hola Mundo"
        kotlinBasicoView.mostrarDatosPorConsolaString(myFirstVariable)
        myFirstVariable = "Bienvenido"
        kotlinBasicoView.mostrarDatosPorConsolaString(myFirstVariable)
        //No podemos asignar un int a una variable string
        //myFirstVariable = 1
        var mySecondVariable = "Suscribete"
        kotlinBasicoView.mostrarDatosPorConsolaString(mySecondVariable)
        mySecondVariable = myFirstVariable
        myFirstVariable="ya te has suscrito?"
        kotlinBasicoView.mostrarDatosPorConsolaString(myFirstVariable)


        //Constantes

        val myFirstConstant = "te ha gustado el tutorial?"
        kotlinBasicoView.mostrarDatosPorConsolaString(myFirstConstant)
        //una constante no puede modificar su valor
        //myFirstConstant = ":'D"
        val mySecondConstant = myFirstVariable
        kotlinBasicoView.mostrarDatosPorConsolaString(mySecondConstant)
    }


    /*
    Aqui vamos a hablar de tipos de datos
     */

    override fun tiposDeDatos() {
        //String
        val myString : String = "Hola Peter"
        val myString2 = "Bienvenido"
        val myString3 = myString + " " + myString2
        kotlinBasicoView.mostrarDatosPorConsolaString(myString3)

        // Enteros (Byte, Short, Int, Long)

        val myInt : Int = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        kotlinBasicoView.mostrarDatosPorConsolaInt(myInt3)

        // Decimales (Float, Double)
        val myDouble = 1.5
        val myFloat = 1.5f
        val myDouble2 = 2.6
        val myDouble3 : Int = 1 //En realidad este es Int
        val myDouble4 = myDouble + myDouble2 + myDouble3
        //Se puede usar el metodo toString y no escribir tanto codigo pero por el momento viene bien para practicar
        kotlinBasicoView.mostrarDatosPorConsolaDouble(myDouble4)

        //Boolean (bool)
        val myBool = true
        val myBool2 = false
        //val myBool3 = myBool + myBool2 no se puede
        kotlinBasicoView.mostrarDatosPorConsolaBoolean(myBool == myBool2)
        kotlinBasicoView.mostrarDatosPorConsolaBoolean(myBool && myBool2)
        kotlinBasicoView.mostrarDatosPorConsolaBoolean(myBool || myBool2)

    }

    /*
    Aqui vamos a hablar de sentencia if
     */
    override fun sentenciaIf(){
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
            kotlinBasicoView.mostrarDatosPorConsolaString("$myNumber es menor que 10 y mayor que 5 o es igual a 53")
        }else if(myNumber == 60){
            kotlinBasicoView.mostrarDatosPorConsolaString("$myNumber es igual a 60")
        }else if(myNumber !=70){
            kotlinBasicoView.mostrarDatosPorConsolaString("$myNumber No es igual a 70")
        }
        else{
            //Sentencia Else
            kotlinBasicoView.mostrarDatosPorConsolaString("$myNumber es mayor que 10 o menor o igual que 5 y no es igual a 53")
        }
    }


    /*
Aqui vamos a hablar de la sentencia when
 */
    override fun sentenciaWhen(){
        //When con String
        val country = "España"
        when(country){
            "España"->{
                kotlinBasicoView.mostrarDatosPorConsolaString("El Idioma es Español")
            } "Mexico" ->{
            kotlinBasicoView.mostrarDatosPorConsolaString("El Idioma es Español")
        } "Peru" ->{
            kotlinBasicoView.mostrarDatosPorConsolaString("El Idioma es Español")
        } "Argentina" ->{
            kotlinBasicoView.mostrarDatosPorConsolaString("El Idioma es Español")
        } "EEUU" ->{
            kotlinBasicoView.mostrarDatosPorConsolaString("El Idioma es Ingles")
        } "Francia" -> {
            kotlinBasicoView.mostrarDatosPorConsolaString("El Idioma es Frances")
        } else ->{
            kotlinBasicoView.mostrarDatosPorConsolaString("No Conocemos el Idioma")
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
            kotlinBasicoView.mostrarDatosPorConsolaString(":D")
        }
        }
    }


    /*
 Aqui vamps a hablar de arrays o arreglos
  */
    override fun arrays(){
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

        kotlinBasicoView.mostrarDatosPorConsolaString(myArray.toString())

        //Añadir un conjunto de Datos
        myArray.addAll(listOf("Hola" , "Bienvenidos al Tutorial"))

        kotlinBasicoView.mostrarDatosPorConsolaString(myArray.toString())

        //Acceso a Datos

        val myCompany : String = myArray[2]
        kotlinBasicoView.mostrarDatosPorConsolaString(myCompany)

        //Modificacion de Datos
        myArray[5] = "Suscribete y activa la campana"
        kotlinBasicoView.mostrarDatosPorConsolaString(myArray.toString())

        //Eliminar Datos
        myArray.removeAt(4)
        kotlinBasicoView.mostrarDatosPorConsolaString(myArray.toString())

        //Recorrer
        myArray.forEach{
            kotlinBasicoView.mostrarDatosPorConsolaString(it)
        }

        //Otras Operaciones
        kotlinBasicoView.mostrarDatosPorConsolaString(myArray.count().toString())
        myArray.clear()
        kotlinBasicoView.mostrarDatosPorConsolaString(myArray.count().toString())

        myArray.first()
        myArray.last()
        myArray.sort()

    }



    /*
          Aqui vamos a hablar de mapas, tambien llamados diccionarios
     */
    override fun maps(){
        //Sintaxis
        var myMap : Map<String, Int> = mapOf()
        kotlinBasicoView.mostrarDatosPorConsolaString(myMap.toString())
        //Añadir Elementos
        //myMap = mapOf("Brais" to 1, "Pedro" to 2, "Sara" to 5)
        myMap = mutableMapOf("Brais" to 1, "Pedro" to 2, "Sara" to 5)
        kotlinBasicoView.mostrarDatosPorConsolaString(myMap.toString())

        //Añadir un solo valor
        myMap["Ana"] = 7
        myMap.put("Maria" , 8)
        kotlinBasicoView.mostrarDatosPorConsolaString(myMap.toString())

        //Actualizacion de un Dato
        myMap.put("Brais", 3)
        myMap["Brais"] = 4
        kotlinBasicoView.mostrarDatosPorConsolaString(myMap.toString())

        myMap.put("Marcos", 3)
        kotlinBasicoView.mostrarDatosPorConsolaString(myMap.toString())

        //acceso a un dato
        kotlinBasicoView.mostrarDatosPorConsolaString(myMap["Brais"].toString())

        // eliminacion de un dato
        myMap.remove("Brais")
        kotlinBasicoView.mostrarDatosPorConsolaString(myMap.toString())
    }



    //Aqui vamos a hablar de bucles

    override fun loops(){
        //Bucles
        val myArray : List<String> = listOf("Hola" , "Bienvenidos al Tutorial", "Suscribete" ,)
        var myMap : Map<String, Int> = mutableMapOf("Brais" to 1, "Pedro" to 2, "Sara" to 5)
        //For
        for (myString in myArray){
            kotlinBasicoView.mostrarDatosPorConsolaString(myString)
        }
        for(myElement in myMap){
            kotlinBasicoView.mostrarDatosPorConsolaString("${myElement.key} - ${myElement.value}")
        }
        for (x in 0..10){
            kotlinBasicoView.mostrarDatosPorConsolaInt(x)
        }

        for (x in 0 until 10){
            kotlinBasicoView.mostrarDatosPorConsolaInt(x)
        }
        for (x in 0..10 step 2){
            kotlinBasicoView.mostrarDatosPorConsolaInt(x)
        }

        for (x in 10 downTo 0 step 3){
            kotlinBasicoView.mostrarDatosPorConsolaInt(x)
        }

        val myNumericArray = (0..20)
        for (myNum in myNumericArray){
            kotlinBasicoView.mostrarDatosPorConsolaInt(myNum)
        }


        //While
        var x = 0

        while (x<10){
            kotlinBasicoView.mostrarDatosPorConsolaInt(x)
            x++
        }

    }




    /*
    Aqui vamos a hablar de seguridad contra nulos (Null Safety)
     */
    override fun nullSafeti(){
        var myString = "MoureDev"
        // myString = null Esto generaria error de compilacion
        kotlinBasicoView.mostrarDatosPorConsolaString(myString)
        var mySafetyString : String? = "MoureDev null Safety"
        mySafetyString = null
        kotlinBasicoView.mostrarDatosPorConsolaString(myString)

        if(mySafetyString != null){
            kotlinBasicoView.mostrarDatosPorConsolaString(myString!!) //Fuerza que no sea nulo
        }else{
            kotlinBasicoView.mostrarDatosPorConsolaString(myString)
        }
        mySafetyString = "Sus"
//        println(myString)

        //Safe call

        kotlinBasicoView.mostrarDatosPorConsolaInt(mySafetyString?.length)

        mySafetyString?.let {
            kotlinBasicoView.mostrarDatosPorConsolaString(it)
        } ?: run{
            kotlinBasicoView.mostrarDatosPorConsolaString(mySafetyString)
        }
    }




    /*
    Aqui vamos a hablar de funciones
     */
    override fun funciones(){
        sayHello()
        sayMyNameAndAge("Josué", 24)
        kotlinBasicoView.mostrarDatosPorConsolaInt(sumarDosNumeros(1,2))
        kotlinBasicoView.mostrarDatosPorConsolaInt(sumarDosNumeros(1, sumarDosNumeros(1,2)))

    }

    //Funcion Simple
    override fun sayHello(){
        kotlinBasicoView.mostrarDatosPorConsolaString("Hola!")
    }

    //Funciones con parametros de entrada
    override fun sayMyNameAndAge(nombre : String, edad : Int){
        kotlinBasicoView.mostrarDatosPorConsolaString("Hola, mi nombre es $nombre y mi edad es $edad")
    }

    //Funciones con un valor de retorno
    override fun sumarDosNumeros(primerNumero : Int, segundoNumero : Int) : Int{
        return primerNumero + segundoNumero
    }




    //Aqui vamos a Hablar de clases
    override fun clases(){
        val brais  = Programmer("Brais", 32, arrayOf(Programmer.Language.KOTLIN, Programmer.Language.JAVA))
        kotlinBasicoView.mostrarDatosPorConsolaString(brais.name)
        brais.age=24
        val sara = Programmer("Sara",25 , arrayOf(Programmer.Language.JAVASCRIPT), arrayOf(brais))
        sara.code()
        kotlinBasicoView.mostrarDatosPorConsolaString("${sara.friends?.first()} es amigo de ${sara.name}")
    }


}