package com.ice.repositorioejercicios.FireBase

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.facebook.login.LoginManager
import com.google.firebase.auth.FirebaseAuth
import com.ice.repositorioejercicios.R
import kotlinx.android.synthetic.main.activity_home_fbactivity.*


enum class ProviderType{
    BASIC,
    GOOGLE,
    FACEBOOK
}

class HomeFBActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_fbactivity)
        //Setup
        val bundle : Bundle? = intent.extras
        val email = bundle?.getString("email")
        val provider = bundle?.getString("provider")
        setup( email ?:"",provider ?:"")

        //Guardado de Datos
        val prefs = getSharedPreferences("User", Context.MODE_PRIVATE).edit()
        prefs.putString("email",email)
        prefs.putString("provider",provider)
        prefs.apply()
    }

    private fun setup(email:String,provider : String){
        title = "Inicio"
        tvEmailHome.text = email
        tvProviderHome.text = provider

        btnCerrarSesion.setOnClickListener{
            //Borrado de datos con shared preferences
            val prefs = getSharedPreferences("User", Context.MODE_PRIVATE).edit()
            prefs.clear()
            prefs.apply()

            if(provider==ProviderType.FACEBOOK.name){
                LoginManager.getInstance().logOut()
            }

            FirebaseAuth.getInstance().signOut()
            onBackPressed()
        }
    }





}