package com.example.hellovilag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val btn_click_me = findViewById(R.id.my_button) as Button
        var i = 0
// set on-click listener
        btn_click_me.setOnClickListener {
            i = i + 1
            Toast.makeText(this@MainActivity, i.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}