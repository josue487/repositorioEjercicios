package com.ice.repositorioejercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class PickerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picker)
        val etDate = this.findViewById(R.id.etDate) as EditText
        etDate.setOnClickListener{showDatePickerDialog()}
    }

    private fun showDatePickerDialog() {
        
    }
}