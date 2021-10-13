package com.ice.repositorioejercicios.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.ice.repositorioejercicios.Clases.UserVipApplication.Companion.prefs
import com.ice.repositorioejercicios.R

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
            tvNombre.setBackgroundColor(ContextCompat.getColor(this, R.color.Yellow))
        }
    }


    fun setVipColorBackGround(){
        val contenedor = this.findViewById(R.id.contenedor) as ConstraintLayout
        contenedor.setBackgroundColor(ContextCompat.getColor(this, R.color.Yellow))
    }

    fun cerrarSecion(view: View) {
        prefs.wipe()
        onBackPressed()
    }


}