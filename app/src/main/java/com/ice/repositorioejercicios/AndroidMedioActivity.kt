package com.ice.repositorioejercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//Alias
typealias MyMapList = MutableMap<Int, ArrayList<String>>
typealias MyFun = (Int, String, MyMapList) -> Boolean  //Sin explicar
typealias MyNestedClass = MyNestedAndInnerClass.MyNestedClass

class AndroidMedioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_medio2)

        //Enum Clases
        //enumClases()

        // Nested and Inner Class
        //nestedAndInnerClasses()

        //Class Inheritance
        //classInheritance()

        //Interfaces
        //interfaces()

        //Visivility modifiers
        //visivilityModifiers()

        //Data Classes
        //dataClasses()

        //Type Aliases
        typeAliases()
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

    //Leccion 2 Nested and Inner Classes
    private fun nestedAndInnerClasses(){
        //Clase Anidada (nested)

//        val myNestedClass = MyNestedClass() //CON ALIAS

        val myNestedClass = MyNestedAndInnerClass.MyNestedClass() //SIN ALIAS
        val sum = myNestedClass.sum(10,5)
        println("El resultado de la suma es: $sum")

        //Clase Interna (inner)
        val myInnerClass = MyNestedAndInnerClass().MyInnerClass()
        val sum2 = myInnerClass.sumTwo(10)
        println("El resultado de sumar 2 es $sum2")
    }

    //Leccion 3 class InherItance (Herencia)
    private fun classInheritance(){
        val programmer = Programador("Brais",33, "Kotlin")
        programmer.work()
        programmer.sayLenguaje()
        programmer.goToWork()
        val designer = Diseñador("Juan", 30)
        designer.work()
        designer.goToWork()
    }

    //leccion 4 Interfaces
    private fun interfaces() {
        val gamer = Person ("Brais", 3)
        gamer.play()
        gamer.stream()
    }

    //Leccion 5 Visibility Modifiers

    //sin declarar por defecto public
    private fun visivilityModifiers(){
        //val visibility = Visibility()
        //visibility.name="Brais"
        //visibility.sayMyName()
        val visibilityTwo = VisibilityTwo()

    }

    //Leccion 6 : Data Classes
    private  fun dataClasses(){

        val brais = Worker("Brais Moure", 33 , "Programador")
        brais.lastWork="Musico"

        val sara = Worker()

        val moureDev = Worker("Brais Moure", 33 , "Programador")
        brais.lastWork="Musico"

        //equals y hasCode
//        if (brais.equals(moureDev)){   O
        if (brais==moureDev){
            println("Son Iguales")
        }
        else{
            println("No son Iguales")
        }

        //To String
        println(brais.toString())

        //Copy
        val brais2 = brais.copy(age = 34)
        println(brais.toString())
        println(brais2.toString())

        //ComponentN
        val (name, age) = moureDev
        println(name)
        println(age)

    }

    // Leccion 7 : Type Aliases (Alias)
//    private var myMap : MutableMap<Int, ArrayList<String>> = mutableMapOf() ANTES de Alias
    private var myMap : MyMapList = mutableMapOf()  //Despues de Alias
    private fun typeAliases(){
        var myNewMap : MyMapList = mutableMapOf()
        myNewMap[1] = arrayListOf("Brais" , "Moure")
        myNewMap[2] = arrayListOf("MoureDev" , "By Brais Moure")
        myMap = myNewMap
    }
}