package com.ice.repositorioejercicios.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ice.repositorioejercicios.Clases.MyNestedAndInnerClass
import com.ice.repositorioejercicios.R
import com.ice.repositorioejercicios.Clases.*
import com.ice.repositorioejercicios.Clases.dataClases.Worker
import com.ice.repositorioejercicios.Clases.openClases.Person
import com.ice.repositorioejercicios.customFormat
import com.ice.repositorioejercicios.formatSize
import java.util.*
import kotlin.collections.ArrayList
import kotlin.concurrent.thread

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
        //typeAliases()

        //Destructuring Declarations
        //destructuringDeclaration()

        //Extensions
        //extensions()

        //Lambdas
        lambdas()

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

        userDireccion= Direccion.SOUTH
        println("Direccion : $userDireccion")

        userDireccion= Direccion.WEST
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

        //val myNestedClass = MyNestedClass() //CON ALIAS
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


    //Leccion 8 : Destructuring Declaration
    private  fun  destructuringDeclaration(){
        val (name, _, work) = Worker("Brais Moure", 34 , "Programador")
        println("$name, $work")
        val moureDev = Worker("MoureDev", 34 , "Programador")
        println(moureDev.component1())
        val (braisName, braisAge) = myWorker()
        println("$braisName, $braisAge")
        val myMap = mapOf(1 to "Brais", 2 to "Pedro", 5 to "Sara")
//        for (element in myMap){
//            println("${element.component1()}, ${element.component2()}")
//        }
        for ((id, name) in myMap){
            println("${id}, ${name}")
        }
    }

    private fun myWorker() : Worker {
        return Worker("Brais Moure", 34 , "Programador")
    }

    //Leccion 9 : Extensions
    private  fun extensions(){
        val myDate = Date()
        //Creado Custom Format en Extensions
        println(myDate.customFormat())
        println(myDate.formatSize)

        val myDateNullable : Date? = null
        println(myDateNullable.customFormat())
        println(myDateNullable.formatSize)

    }

    //Leccion 10 Lambdas
    private fun lambdas(){
        val myIntList = arrayListOf<Int>(0,1,2,3,4,5,6,7,8,9,10)

        val myFilterIntList = myIntList.filter { myInt ->
            println(myInt)
            if(myInt==1){
                return@filter true
            }
            myInt > 5
        }
        println(myFilterIntList)

 //       val mySumFun = fun (x:Int, y:Int) : Int{ OPCION LARGA MUCHAS LINEAS DE CODIGO
 //           return x+y
 //       }

        val mySumFun = fun (x:Int, y:Int) : Int = x+y  //OPCION CORTA 1 LINEA DE CODIGO
        val myMultFun = fun(x:Int, y:Int): Int = x*y

        myAsyncFun("MoureDev"){
            println(it)
        }

        println(myOperateFun(5,10,mySumFun))
        println(myOperateFun(5,10,myMultFun))
        println(myOperateFun(5,10) { x, y -> x-y })

    }

    private  fun myOperateFun(x:Int , y: Int, myFun : (Int, Int) -> Int ) : Int{
        return myFun(x,y)
    }

    //Funcion Asincronica
    private fun myAsyncFun(name : String, hello:(String) -> Unit){
        val myNewString="Hello $name"
        //Hilo
        thread {
            Thread.sleep(5000)
            hello(myNewString)
        }

        thread {
            Thread.sleep(1000)
            hello(myNewString)
        }

        thread {
            Thread.sleep(7000)
            hello(myNewString)
        }
    }
}