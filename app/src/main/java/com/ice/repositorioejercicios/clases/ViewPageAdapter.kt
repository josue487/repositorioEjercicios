package com.ice.repositorioejercicios.clases

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ice.repositorioejercicios.DemoObjectFragment

class ViewPageAdapter(fragmentActivity : FragmentActivity) : FragmentStateAdapter(fragmentActivity){

    private val ARG_OBJECT = "Object"

    override fun getItemCount(): Int = 48

    override fun createFragment(position: Int): Fragment {
        //Metodo para cantidades conocidas
//        when(position){
//            1->{return Fragment()}
//            2->{return Fragment2()}
//            3->{return Fragment3()}
//        }

        //Metodo para n cantidades
        val fragment = DemoObjectFragment()
        fragment.arguments = Bundle().apply {
            putInt(ARG_OBJECT,position+1)
        }
        return fragment
    }
}