package com.ice.repositorioejercicios.ViewPage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.badge.BadgeDrawable
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.ice.repositorioejercicios.R
import com.ice.repositorioejercicios.Clases.ViewPageAdapter
import me.relex.circleindicator.CircleIndicator3

class ViewPageActivity : AppCompatActivity(), ViewPageContract.View {

    private val adapter by lazy{ ViewPageAdapter(this)   }


    lateinit var linearPuntos : ViewPager2
    var puntosSlide = arrayOf<TextView>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_page_test)
        val pager = this.findViewById(R.id.pager) as ViewPager2
        pager.adapter = adapter

        var indicator : CircleIndicator3 = this.findViewById<CircleIndicator3>(R.id.indicatorCircle)
        indicator.setViewPager(pager)

        val tab_layout = this.findViewById(R.id.tab_layout) as TabLayout

        val tabLayoutMediator = TabLayoutMediator(tab_layout,pager,
        TabLayoutMediator.TabConfigurationStrategy{ tab, posicion ->
            tab.text = "Opcion ${posicion+1}"
            tab.setIcon(R.drawable.ic_baseline_deck_24)
            val badge : BadgeDrawable = tab.orCreateBadge
            badge.backgroundColor = ContextCompat.getColor(applicationContext, R.color.design_default_color_error)
            badge.setVisible(true)
        })
        tabLayoutMediator.attach()
    }



}