package com.ice.repositorioejercicios.AndroidMedio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ice.repositorioejercicios.Clases.MyNestedAndInnerClass
import com.ice.repositorioejercicios.R
import com.ice.repositorioejercicios.Clases.*
import com.ice.repositorioejercicios.Clases.dataClases.Worker
import com.ice.repositorioejercicios.Clases.openClases.Person
import com.ice.repositorioejercicios.KotlinBasico.KotlinBasicoModel
import com.ice.repositorioejercicios.KotlinBasico.KotlinBasicoPresenter
import com.ice.repositorioejercicios.customFormat
import com.ice.repositorioejercicios.formatSize
import java.util.*
import kotlin.collections.ArrayList
import kotlin.concurrent.thread



class AndroidMedioActivity : AppCompatActivity() , AndroidMedioContract.View{

    val androidMedioPresenter = AndroidMedioPresenter(this, AndroidMedioModel())


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_medio2)

        //Enum Clases
        //enumClases()
        //androidMedioPresenter.enumClases()

        // Nested and Inner Class
        //nestedAndInnerClasses()
        //androidMedioPresenter.nestedAndInnerClasses()

        //Class Inheritance
        //classInheritance()
        //androidMedioPresenter.classInheritance()

        //Interfaces
        //interfaces()
        //androidMedioPresenter.interfaces()

        //Visivility modifiers
        //visivilityModifiers()
        //androidMedioPresenter.visivilityModifiers()

        //Data Classes
        //dataClasses()
        //androidMedioPresenter.dataClasses()

        //Type Aliases
        //typeAliases()
        //androidMedioPresenter.typeAliases()

        //Destructuring Declarations
        //destructuringDeclaration()
        //androidMedioPresenter.destructuringDeclaration()

        //Extensions
        //extensions()
        //androidMedioPresenter.extensions()

        //Lambdas
        //androidMedioPresenter.lambdas()

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




    override fun mostrarDatosPorConsolaString(text: String) {
        println(text)
    }

    override fun mostrarDatosPorConsolaInt(number: Int) {
        println(number)
    }

    override fun mostrarDatosPorConsolaDouble(number: Double) {
        println(number)
    }

    override fun mostrarDatosPorConsolaBoolean(bool: Boolean) {
        println(bool)
    }
}