package com.ice.repositorioejercicios.SharedPreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import com.ice.repositorioejercicios.Result.ResultActivity
import com.ice.repositorioejercicios.R

class SharedPreferencesActivity : AppCompatActivity(), SharedPreferencesContract.View {

    val sharedPreferencesPresenter = SharedPreferencesPresenter(this,SharedPreferencesModel())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preferences)
        sharedPreferencesPresenter.checkUserValues()
    }

    override fun checkUserValues(existName : Boolean){
        if(existName){
            goToDetail()
        }
    }

    override fun goToDetail(){
        startActivity(Intent(this, ResultActivity::class.java))
    }

    override fun accederAlDetalle(view: View) {
        val etNombre = this.findViewById(R.id.etNombre) as EditText
        val cbVip = this.findViewById(R.id.cbVip) as CheckBox
        if(etNombre.text.toString().isNotEmpty()){
            sharedPreferencesPresenter.guardarUsuario(cbVip.isChecked,etNombre.text.toString())
            goToDetail()
        }else{
            Toast.makeText(this,"Debe Completar el campo Nombre",Toast.LENGTH_SHORT).show()
        }
    }



}