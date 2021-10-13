package com.ice.repositorioejercicios.KotlinBasico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ice.repositorioejercicios.R
import com.ice.repositorioejercicios.Clases.Programmer

class KotlinBasicoActivity : AppCompatActivity(), KotlinBasicoContract.View {

    val kotlinBasicoPresenter = KotlinBasicoPresenter(this, KotlinBasicoModel())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_basico)

        //Leccion 1
        //variablesYConstantes()
        //kotlinBasicoPresenter.variablesYConstantes()

        //Leccion 2 :D
        //tiposDeDatos()
        //kotlinBasicoPresenter.tiposDeDatos()

        //Leccion 3
        //sentenciaIf()
        //kotlinBasicoPresenter.sentenciaIf()

        //Leccion 4
        //sentenciaWhen()
        //kotlinBasicoPresenter.sentenciaWhen()

        //Leccion 5
        //arrays()
        //kotlinBasicoPresenter.arrays()

        //Leccion 6
        //maps()
        //kotlinBasicoPresenter.maps()

        //Leccion 7
        //loops()
        //kotlinBasicoPresenter.loops()

        //Leccion 8
        //nullSafeti()
        //kotlinBasicoPresenter.nullSafeti()

        //Leccion 9
        //funciones()
        //kotlinBasicoPresenter.funciones()

        //Leccion 10
        //clases()
        //kotlinBasicoPresenter.clases()

    }




    override fun mostrarDatosPorConsolaString(text : String ){
       println(text)
    }
    override fun mostrarDatosPorConsolaInt(number : Int ){
        println(number)
    }
    override fun mostrarDatosPorConsolaDouble(number : Double ){
        println(number)
    }
    override fun mostrarDatosPorConsolaBoolean(bool : Boolean ){
        println(bool)
    }





}