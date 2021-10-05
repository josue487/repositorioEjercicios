package com.ice.repositorioejercicios.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.ice.repositorioejercicios.DatePickerFragment
import com.ice.repositorioejercicios.R
import com.ice.repositorioejercicios.TimePickerFragment

class PickerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picker)
        //Date Picker
        val etDate = this.findViewById(R.id.etDate) as EditText
        etDate.setOnClickListener{showDatePickerDialog()}

        //Time Picker
        val etTime = this.findViewById(R.id.etTime) as EditText
        etTime.setOnClickListener{showTimePickerDialog()}

    }


    //Date Picker
    private fun showDatePickerDialog() {
        val datePicker = DatePickerFragment {day, month, year -> onDateSelected(day,month,year) }
        datePicker.show(supportFragmentManager, "datePicker")
    }

    fun onDateSelected(day:Int, month:Int, year:Int){
        val etDate = this.findViewById(R.id.etDate) as EditText
        etDate.setText("Has Seleccionado el Dia $day, el Mes $month, el Año $year")
    }

    //Time Picker
    private fun showTimePickerDialog() {
        //val timePicker = TimePickerFragment {time -> onTimeSelected(time)} Al Ser Un Solo Parametro
        val timePicker = TimePickerFragment {onTimeSelected(it)}
        timePicker.show(supportFragmentManager,"timePicker")
    }

    fun onTimeSelected(time : String){
        val etTime = this.findViewById(R.id.etTime) as EditText
        etTime.setText("Has Seleccionado las $time")
    }
}