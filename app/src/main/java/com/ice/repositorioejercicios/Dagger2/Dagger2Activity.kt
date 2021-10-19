package com.ice.repositorioejercicios.Dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ice.repositorioejercicios.Clases.UserVipApplication
import com.ice.repositorioejercicios.Dagger2.Model.Body
import com.ice.repositorioejercicios.R
import javax.inject.Inject

class Dagger2Activity : AppCompatActivity() {

    @Inject
    lateinit var body: Body

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger2)

        (application as UserVipApplication).getComponent().inject(this)
    }
}