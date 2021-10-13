package com.ice.repositorioejercicios.Activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.ice.repositorioejercicios.R


class InicioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)
    }

    //Inicio de Actividad Basica
    fun actividadNivelBasica(v : View){
        val intent = Intent(this, KotlinBasicoActivity::class.java)
        startActivity(intent)
    }

    //Inicio de Actividad Nivel Medio
    fun actividadNivelMedio(v : View){
        val intent = Intent(this, AndroidMedioActivity::class.java)
        startActivity(intent)
    }

    //Inicio de Actividad ReciclerView
    fun actividadReciclerView(v : View){
        val intent = Intent(this, ReciclerViewActivity::class.java)
        startActivity(intent)
    }

    //Inicio de Actividad ViewPage
    fun actividadViewPage(v : View){
        val intent = Intent(this, ViewPageActivityTest::class.java)
        startActivity(intent)
    }

    //Inicio de Actividad DateTimePicker
    fun actividadPicker(v : View){
        val intent = Intent(this, PickerActivity::class.java)
        startActivity(intent)
    }

    //Inicio de Actividad WebView
    fun btnWebView(view: View) {
        val intent = Intent(this, WebViewActivity::class.java)
        startActivity(intent)
    }

    //Inicio de ActividadShared Preferences
    fun btnSharedPreferences(view: View) {
        val intent = Intent(this, SharedPreferencesActivity::class.java)
        startActivity(intent)
    }
}