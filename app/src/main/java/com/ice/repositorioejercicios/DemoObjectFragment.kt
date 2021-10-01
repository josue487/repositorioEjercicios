package com.ice.repositorioejercicios

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2

class DemoObjectFragment : Fragment() {

    companion object{
        private val ARG_OBJECT = "Object"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_demo_object, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tvFragment: TextView = view.findViewById(R.id.tvFragment)
        arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {
            tvFragment.text = "Fragmento Test" + getInt(ARG_OBJECT).toString()
        }
    }
}