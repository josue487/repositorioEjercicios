package com.ice.repositorioejercicios.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import com.ice.repositorioejercicios.R
import com.ice.repositorioejercicios.ResultActivity
import com.ice.repositorioejercicios.clases.UserVipApplication.Companion.prefs

class SharedPreferencesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preferences)
        checkUserValues()
    }

    fun checkUserValues(){
        if(prefs.getNombre().isNotEmpty()){
            goToDetail()
        }
    }

    private fun accederAlDetalle( v : View){
        val etNombre = this.findViewById(R.id.etNombre) as EditText
        val cbVip = this.findViewById(R.id.cbVip) as CheckBox
        if(etNombre.text.toString().isNotEmpty()){
            //Guardar El Usuario
            prefs.guardarNombre(etNombre.text.toString())
            prefs.guardarVIP(cbVip.isChecked)
            goToDetail()
        }else{
            Toast.makeText(this,"No Tiene Nada Escrito",Toast.LENGTH_SHORT).show()
        }

    }

    fun goToDetail(){
        startActivity(Intent(this,ResultActivity::class.java))
    }

    fun goToDetail(view: View) {
        startActivity(Intent(this,ResultActivity::class.java))
    }

}