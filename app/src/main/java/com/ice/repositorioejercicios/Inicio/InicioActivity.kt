package com.ice.repositorioejercicios.Inicio

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.ice.repositorioejercicios.Activities.*
import com.ice.repositorioejercicios.KotlinBasico.KotlinBasicoActivity
import com.ice.repositorioejercicios.R


class InicioActivity : AppCompatActivity(), InicioContract.View{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)
    }

    //Inicio de Actividad Basica
    override fun initActivityNivelBasico(v : View){
        val intent = Intent(this, KotlinBasicoActivity::class.java)
        startActivity(intent)
    }

    //Inicio de Actividad Nivel Medio
    override fun initActivityçNivelMedio(v : View){
        val intent = Intent(this, AndroidMedioActivity::class.java)
        startActivity(intent)
    }

    //Inicio de Actividad ReciclerView
    override fun initActivityReciclerView(v : View){
        val intent = Intent(this, ReciclerViewActivity::class.java)
        startActivity(intent)
    }

    //Inicio de Actividad ViewPage
    override fun initActivityViewPage(v : View){
        val intent = Intent(this, ViewPageActivityTest::class.java)
        startActivity(intent)
    }

    //Inicio de Actividad DateTimePicker
    override fun initActivityPicker(v : View){
        val intent = Intent(this, PickerActivity::class.java)
        startActivity(intent)
    }

    //Inicio de Actividad WebView
    override fun initActivityWebView(view: View) {
        val intent = Intent(this, WebViewActivity::class.java)
        startActivity(intent)
    }

    //Inicio de ActividadShared Preferences
    override fun initActivitySharedPreferences(view: View) {
        val intent = Intent(this, SharedPreferencesActivity::class.java)
        startActivity(intent)
    }
}