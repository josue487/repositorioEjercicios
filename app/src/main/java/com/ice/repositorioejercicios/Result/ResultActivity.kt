package com.ice.repositorioejercicios.Result

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.ice.repositorioejercicios.R

class ResultActivity : AppCompatActivity(), ResultContract.View {

    val resultPresenter = ResultPresenter(this, ResultModel())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
    }


    override fun iniciarApp(name : String, vip : Boolean) {
        val tvNombre = this.findViewById(R.id.tvNombre) as TextView
        tvNombre.text = "Bienvenido $name"
        if (vip){
            setVipColorBackGround()
        }
    }


    fun setVipColorBackGround(){
        val contenedor = this.findViewById(R.id.contenedor) as ConstraintLayout
        contenedor.setBackgroundColor(ContextCompat.getColor(this, R.color.Yellow))
    }

    fun cerrarSecion(view: View) {
        resultPresenter.cerrarSecion()
        onBackPressed()
    }


}