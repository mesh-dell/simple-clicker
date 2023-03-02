package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

lateinit  var counter : TextView
    lateinit var btn : FloatingActionButton
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counter = findViewById(R.id.counter)
        btn = findViewById(R.id.btn1)
        btn.setOnClickListener{
            var num = counter.text.toString().toInt()
            num++
            //updating the UI
            counter.text = num.toString()

        }
    }
}