package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var t =  findViewById<TextView>(R.id.textView)
        var r  = findViewById<EditText>(R.id.otvet).toString()
        var editText =  findViewById<TextView>(R.id.textView2)
        while (true){

            var a = (0..9).random()
                a.toInt()
            var b = (0..100).random()
                b.toInt()
//            var p = ("+,-,*,/").random()
            var q = a * b
            q.toString()
var w = "$a * $b"
            t.text = ("$w")
            if (q.equals(r)) {
               editText.text = ("Верно")
            } else {
                editText.text = ("Heверно")
            }



        }
    }
}





