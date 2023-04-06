package com.example.simplebmicalc_mark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var displayans: TextView
    private lateinit var editweight: EditText
    private lateinit var editheight: EditText
    private lateinit var calculatebmi: Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayans = findViewById(R.id.ansdisplay)
        editweight = findViewById(R.id.edtwieght)
        editheight = findViewById(R.id.edtheight)
        calculatebmi = findViewById(R.id.btncalcbmi)

        calculatebmi.setOnClickListener {
            //Toast.makeText(this, "trying to calculate bmi", Toast.LENGTH_SHORT).show()

            var weight = editweight.text.toString().trim()
            var height = editheight.text.toString().trim()

            //user validation
            if (weight.isEmpty() || height.isEmpty()){
                Toast.makeText(this, "ENTER A NUMBER!", Toast.LENGTH_SHORT).show()

            }
            else{
                //Toast.makeText(this, "trying to add two numbers", Toast.LENGTH_SHORT).show()
                var bmi = weight.toDouble() / (height.toDouble() * height.toDouble())
                displayans.text = bmi.toString()

            }









        }




    }
}