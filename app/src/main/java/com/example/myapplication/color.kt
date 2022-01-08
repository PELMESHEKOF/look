package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import com.madrapps.pikolo.RGBColorPicker
import com.madrapps.pikolo.listeners.OnColorSelectionListener

class color : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)

        var back = findViewById<ConstraintLayout>(R.id.backgr)

        var r =  findViewById<RGBColorPicker>(R.id.color).setColorSelectionListener( object :
            OnColorSelectionListener{

            override fun onColorSelected(color: Int) {
                back.setBackgroundColor(color)
            }

            override fun onColorSelectionEnd(color: Int) {

            }

            override fun onColorSelectionStart(color: Int) {
            }

        })
    }
}