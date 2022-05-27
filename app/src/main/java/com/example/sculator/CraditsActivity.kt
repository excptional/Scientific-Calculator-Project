package com.example.sculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.ImageButton


class CraditsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cradits)
        val intent = intent

        val backButton: ImageButton = findViewById(R.id.backbutton)

        backButton.setOnClickListener {
            finish()
        }

    }
}