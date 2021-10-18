package com.ice.repositorioejercicios.AndroidMedio

import com.ice.repositorioejercicios.Clases.Diseñador
import com.ice.repositorioejercicios.Clases.MyNestedAndInnerClass
import com.ice.repositorioejercicios.Clases.Programador
import com.ice.repositorioejercicios.Clases.VisibilityTwo
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

class AndroidMedioPresenter(private val androidMedioView : AndroidMedioContract.View, private val androidMedioModel: AndroidMedioContract.Model) : AndroidMedioContract.Presenter {

    //EnumClasses
    override fun enumClases(){
        var userDireccion : AndroidMedioActivity.Direccion? = null
        androidMedioView.mostrarDatosPorConsolaString("Direccion : $userDireccion")

        userDireccion= AndroidMedioActivity.Direccion.SOUTH
        androidMedioView.mostrarDatosPorConsolaString("Direccion : $userDireccion")

        userDireccion= AndroidMedioActivity.Direccion.WEST
        androidMedioView.mostrarDatosPorConsolaString("Direccion : $userDireccion")

        androidMedioView.mostrarDatosPorConsolaString("Propiedad name : ${userDireccion.name}")
        androidMedioView.mostrarDatosPorConsolaString("Propiedad ordinal : ${userDireccion.ordinal}")

        //Funciones
        androidMedioView.mostrarDatosPorConsolaString(userDireccion.descripcion())

        //Inicializacion
        androidMedioView.mostrarDatosPorConsolaInt(userDireccion.dir)
    }


    //Leccion 2 Nested and Inner Classes
    override fun nestedAndInnerClasses(){
        //Clase Anidada (nested)

        //val myNestedClass = MyNestedClass() //CON ALIAS
        val myNestedClass = MyNestedAndInnerClass.MyNestedClass() //SIN ALIAS


        val sum = myNestedClass.sum(10,5)
        androidMedioView.mostrarDatosPorConsolaString("El resultado de la suma es: $sum")

        //Clase Interna (inner)
        val myInnerClass = MyNestedAndInnerClass().MyInnerClass()
        val sum2 = myInnerClass.sumTwo(10)
        androidMedioView.mostrarDatosPorConsolaString("El resultado de sumar 2 es $sum2")

    }

    //Leccion 3 class InherItance (Herencia)
    override fun classInheritance(){
        val programmer = Programador("Brais",33, "Kotlin")
        androidMedioView.mostrarDatosPorConsolaString(programmer.work())
        androidMedioView.mostrarDatosPorConsolaString(programmer.sayLenguaje())
        androidMedioView.mostrarDatosPorConsolaString(programmer.goToWork())
        val designer = Diseñador("Juan", 30)
        androidMedioView.mostrarDatosPorConsolaString(designer.work())
        androidMedioView.mostrarDatosPorConsolaString(designer.goToWork())
    }




    //leccion 4 Interfaces
    override fun interfaces() {
        val gamer = Person ("Brais", 3)
        androidMedioView.mostrarDatosPorConsolaString(gamer.play())
        androidMedioView.mostrarDatosPorConsolaString(gamer.stream())
    }




    //Leccion 5 Visibility Modifiers

    //sin declarar por defecto public
    override fun visivilityModifiers(){
        //val visibility = Visibility()
        //visibility.name="Brais"
        //visibility.sayMyName()
        val visibilityTwo = VisibilityTwo()

    }



    //Leccion 6 : Data Classes
    override  fun dataClasses(){

        val brais = Worker("Brais Moure", 33 , "Programador")
        brais.lastWork="Musico"

        val sara = Worker()

        val moureDev = Worker("Brais Moure", 33 , "Programador")
        brais.lastWork="Musico"

        //equals y hasCode
//        if (brais.equals(moureDev)){   O
        if (brais==moureDev){
            androidMedioView.mostrarDatosPorConsolaString("Son Iguales")
        }
        else{
            androidMedioView.mostrarDatosPorConsolaString("No son Iguales")
        }

        //To String
        androidMedioView.mostrarDatosPorConsolaString(brais.toString())

        //Copy
        val brais2 = brais.copy(age = 34)
        androidMedioView.mostrarDatosPorConsolaString(brais.toString())
        androidMedioView.mostrarDatosPorConsolaString(brais2.toString())

        //ComponentN
        val (name, age) = moureDev
        androidMedioView.mostrarDatosPorConsolaString(name)
        androidMedioView.mostrarDatosPorConsolaInt(age)

    }


    // Leccion 7 : Type Aliases (Alias)
//    private var myMap : MutableMap<Int, ArrayList<String>> = mutableMapOf() ANTES de Alias
    private var myMap : MyMapList = mutableMapOf()  //Despues de Alias
    override fun typeAliases(){
        var myNewMap : MyMapList = mutableMapOf()
        myNewMap[1] = arrayListOf("Brais" , "Moure")
        myNewMap[2] = arrayListOf("MoureDev" , "By Brais Moure")
        myMap = myNewMap
    }


    //Leccion 8 : Destructuring Declaration
    override  fun  destructuringDeclaration(){
        val (name, _, work) = Worker("Brais Moure", 34 , "Programador")
        androidMedioView.mostrarDatosPorConsolaString("$name, $work")
        val moureDev = Worker("MoureDev", 34 , "Programador")
        androidMedioView.mostrarDatosPorConsolaString(moureDev.component1())
        val (braisName, braisAge) = myWorker()
        androidMedioView.mostrarDatosPorConsolaString("$braisName, $braisAge")
        val myMap = mapOf(1 to "Brais", 2 to "Pedro", 5 to "Sara")
//        for (element in myMap){
//            println("${element.component1()}, ${element.component2()}")
//        }
        for ((id, name) in myMap){
            androidMedioView.mostrarDatosPorConsolaString("${id}, ${name}")
        }
    }

    override fun myWorker() : Worker {
        return Worker("Brais Moure", 34 , "Programador")
    }



    //Leccion 9 : Extensions
    override  fun extensions(){
        val myDate = Date()
        //Creado Custom Format en Extensions
        androidMedioView.mostrarDatosPorConsolaString(myDate.customFormat().toString())
        androidMedioView.mostrarDatosPorConsolaInt(myDate.formatSize)

        val myDateNullable : Date? = null
        androidMedioView.mostrarDatosPorConsolaString(myDateNullable.customFormat().toString())
        androidMedioView.mostrarDatosPorConsolaInt(myDateNullable.formatSize)

    }




    //Leccion 10 Lambdas
    override fun lambdas(){
        val myIntList = arrayListOf<Int>(0,1,2,3,4,5,6,7,8,9,10)

        val myFilterIntList = myIntList.filter { myInt ->
            androidMedioView.mostrarDatosPorConsolaInt(myInt)
            if(myInt==1){
                return@filter true
            }
            myInt > 5
        }
        androidMedioView.mostrarDatosPorConsolaString(myFilterIntList.toString())

        //       val mySumFun = fun (x:Int, y:Int) : Int{ OPCION LARGA MUCHAS LINEAS DE CODIGO
        //           return x+y
        //       }

        val mySumFun = fun (x:Int, y:Int) : Int = x+y  //OPCION CORTA 1 LINEA DE CODIGO
        val myMultFun = fun(x:Int, y:Int): Int = x*y

        myAsyncFun("MoureDev"){
            androidMedioView.mostrarDatosPorConsolaString(it)
        }

        androidMedioView.mostrarDatosPorConsolaInt(myOperateFun(5,10,mySumFun))
        androidMedioView.mostrarDatosPorConsolaInt(myOperateFun(5,10,myMultFun))
        androidMedioView.mostrarDatosPorConsolaInt(myOperateFun(5,10) { x, y -> x-y })

    }

    override fun myOperateFun(x:Int , y: Int, myFun : (Int, Int) -> Int ) : Int{
        return myFun(x,y)
    }



    //Funcion Asincronica
    override fun myAsyncFun(name : String, hello:(String) -> Unit){
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