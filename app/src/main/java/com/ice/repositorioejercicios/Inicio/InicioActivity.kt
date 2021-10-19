package com.ice.repositorioejercicios.Inicio

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.ice.repositorioejercicios.AndroidMedio.AndroidMedioActivity
import com.ice.repositorioejercicios.Dagger2.Dagger2Activity
import com.ice.repositorioejercicios.FireBase.FireBaseActivity
import com.ice.repositorioejercicios.ReciclerView.*
import com.ice.repositorioejercicios.KotlinBasico.KotlinBasicoActivity
import com.ice.repositorioejercicios.Picker.PickerActivity
import com.ice.repositorioejercicios.R
import com.ice.repositorioejercicios.SharedPreferences.SharedPreferencesActivity
import com.ice.repositorioejercicios.ViewPage.ViewPageActivity
import com.ice.repositorioejercicios.WebView.WebViewActivity
import kotlinx.android.synthetic.main.activity_inicio.*


class InicioActivity : AppCompatActivity(), InicioContract.View{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        btnFireBase.setOnClickListener{
            val intent = Intent(this, FireBaseActivity::class.java)
            startActivity(intent)
        }

    }

    //Inicio de Actividad Basica
    override fun initActivityNivelBasico(v : View){
        val intent = Intent(this, KotlinBasicoActivity::class.java)
        startActivity(intent)
    }

    //Inicio de Actividad Nivel Medio
    override fun initActivityNivelMedio(v : View){
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
        val intent = Intent(this, ViewPageActivity::class.java)
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

    //Inicio de Actividad Shared Preferences
    override fun initActivitySharedPreferences(view: View) {
        val intent = Intent(this, SharedPreferencesActivity::class.java)
        startActivity(intent)
    }

    //Inicio de Actividad Dagger2 Prueba
    override fun initActivityDagger2Prueba(view: View) {
        val intent = Intent(this, Dagger2Activity::class.java)
        startActivity(intent)
    }

    //Inicio de Actividad FireBases
    override fun initFireBases(view: android.view.View) {
        val intent = Intent(this, FireBaseActivity::class.java)
        startActivity(intent)
    }
}