package com.example.my_intent

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        /*
        val btnReceiver = findViewById<Button>(R.id.button2)
        val bundle = intent.extras
        val id = bundle!!.get("id_value")
        val language = bundle?.get("langugae_version")

        Toast.makeText(this, id.toString()+" "+language, Toast.LENGTH_LONG).show()

        btnReceiver.setOnClickListener{
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        */
    }
}