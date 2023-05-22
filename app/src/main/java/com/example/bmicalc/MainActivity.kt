package com.example.bmicalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var display:TextView
    lateinit var weight:EditText
    lateinit var height:EditText
    lateinit var calculate:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display = findViewById(R.id.bmiresults)
        weight = findViewById(R.id.editweight)
        height = findViewById(R.id.editheight)
        calculate = findViewById(R.id.btncalculate)

       calculate.setOnClickListener{
           calclateBMI()
       }
    }

    fun calclateBMI() {
        val myweight = weight.text.toString()
        val myheight = height.text.toString()

        if (myweight.isNotBlank() && myheight.isNotBlank()) {
            val thisweight = myweight.toDouble()
            val thisheight = myheight.toDouble()

            val res = thisweight / (thisheight * thisheight)
            var finalres = res.toString()
            display.text = "BMI:$finalres"

        }else{
            display.text = "Please Enter Your Weight and Height"
            }

    }

}


