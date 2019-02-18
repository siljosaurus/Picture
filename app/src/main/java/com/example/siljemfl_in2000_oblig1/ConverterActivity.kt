package com.example.siljemfl_in2000_oblig1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class ConverterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_converter)


        val calculateButton = findViewById<Button>(R.id.calculateButton)
        calculateButton.setOnClickListener {
            Log.d("ConverterActivity", "I was pressed!")

            val cmInput = findViewById<EditText>(R.id.centimeterInput)
            val input = cmInput.text.toString()

            Toast.makeText(this@ConverterActivity, "I clicked", Toast.LENGTH_SHORT).show()


            Log.d("ConverterActivity", "Input: $input")


            // val reference = convertToInch(cmInput.toString())
            // Log.d("ConverterActivity", "Converted from $cmInput to $reference")

        }

        val goToList = findViewById<Button>(R.id.goToListButton)
        goToList.setOnClickListener {

            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
            Log.d("ConverterActivity", "Changed Layout to the ListActivity")
        }

    }


    fun convertToCM(number: Double) = number*2.54

    fun convertToInch(number: Double) = number*0.3937
}
