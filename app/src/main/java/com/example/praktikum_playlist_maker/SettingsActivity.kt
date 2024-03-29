package com.example.praktikum_playlist_maker

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val backButton = findViewById<ImageView>(R.id.back_button)

        backButton.setOnClickListener {
            val backIntent = Intent(this, MainActivity::class.java)
            startActivity(backIntent)
        }
    }
}