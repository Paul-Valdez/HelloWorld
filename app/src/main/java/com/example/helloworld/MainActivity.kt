package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.helloButton)
        button.setOnClickListener {
            Log.v("Hello world", "Button clicked!")
            Toast.makeText(this, "Hello to you too!", Toast.LENGTH_SHORT).show()
        }
        val exitButton = findViewById<Button>(R.id.exitButton)
        exitButton.setOnClickListener {
            Log.v("Exit", "Exit clicked!")
            Toast.makeText(this, "Goodbye!", Toast.LENGTH_SHORT).show()
            finishAndRemoveTask()
        }
    }
}