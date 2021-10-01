package com.ice.repositorioejercicios.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.ice.repositorioejercicios.R
import com.ice.repositorioejercicios.clases.ViewPageAdapter

class ViewPageActivityTest : AppCompatActivity() {

    private val adapter by lazy{ ViewPageAdapter(this)   }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_page_test)
        val pager = this.findViewById(R.id.pager) as ViewPager2
        pager.adapter = adapter
    }
}