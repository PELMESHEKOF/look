package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isGone

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val y = findViewById<Button>(R.id.background)
        val g = findViewById<Button>(R.id.g)
        val t = findViewById<TextView>(R.id.t)
            y.setOnClickListener {
                g.isGone = true
                t.isGone = true
                y.isGone = true
                startActivity(Intent(this, color::class.java))
            }
        t.setOnClickListener {
            g.isGone = true
            t.isGone = true
            y.isGone = true
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }}

