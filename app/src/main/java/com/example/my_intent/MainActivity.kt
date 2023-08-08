package com.example.my_intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    val id: Int = 10
    val language: String = "Kotlin"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        val btnIntent = findViewById<Button>(R.id.button)

        btnIntent.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)

//            intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javapoint"))
            intent.setData(Uri.parse("https://www.javapoint"))
            startActivity(intent)
        }
        */
    }
}