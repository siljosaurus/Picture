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
        setTitle("Converter")


        val calculateButton = findViewById<Button>(R.id.calculateButton)
        calculateButton.setOnClickListener {
            Log.d("ConverterActivity", "I was pressed!")


            val cmInput = findViewById<EditText>(R.id.centimeterInput)
            val input = cmInput.text.toString()

            // Lukke tastaturet


            if (input.isEmpty() ) { // Håndterer tomt input
                Toast.makeText(this, "Field is empty, enter a value.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            else if (input.length <= 0 || input.length > 999999) { // Håndterer ugyldig input
                Toast.makeText(this, "Value must be greater than 0, but not greater than 7 digits", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            else {  // Håndterer gyldig input
                val nr = input.toDouble()
                convertToInch(nr)
                val answer = convertToInch(nr)

                Log.d("ConverterActivity", "Answer: $answer")
            }
        }

        val goToList = findViewById<Button>(R.id.goToListButton)
        goToList.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
            Log.d("ConverterActivity", "Changed Layout to the ListActivity")
        }
    }

    fun convertToCM(number: Double) = number*2.54

    fun convertToInch(number: Double) = number*0.39370079
}
