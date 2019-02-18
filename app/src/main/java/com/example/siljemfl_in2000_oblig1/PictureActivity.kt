package com.example.siljemfl_in2000_oblig1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.util.Log
import android.widget.ImageView
import android.widget.Button
import com.bumptech.glide.Glide

class PictureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture)

        val ojdHus = findViewById<ImageView>(R.id.olejohanDahl)
        Glide.with(this).load("https://upload.wikimedia.org/wikipedia/commons/e/eb/Ole-Johan_Dahls_hus_20110911-11.JPG").into(ojdHus)

        val goToConverter = findViewById<Button>(R.id.goToConverterButton)
        goToConverter.setOnClickListener {

            val intent = Intent(this, ConverterActivity::class.java)
            startActivity(intent)
            Log.d("PictureActivity", "Changed layout to the ConverterActivity!")
        }

    }

}
