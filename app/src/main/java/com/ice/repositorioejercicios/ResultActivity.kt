package com.ice.repositorioejercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.ice.repositorioejercicios.clases.UserVipApplication.Companion.prefs

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        iniciarApp()
    }


    fun iniciarApp() {
        val tvNombre = this.findViewById(R.id.tvNombre) as TextView
        tvNombre.text = "Bienvenido ${prefs.getNombre()}"
        if (prefs.getVip()){
            setVipColorBackGround()
        }
    }


    fun setVipColorBackGround(){
        val contenedor = this.findViewById(R.id.contenedor) as ConstraintLayout
        contenedor.setBackgroundColor(ContextCompat.getColor(this,R.color.black))
    }

    fun cerrarSecion(view: View) {
        prefs.wipe()
        onBackPressed()
    }


}