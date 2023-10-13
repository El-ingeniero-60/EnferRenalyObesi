package com.example.enferrenalyobesi

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //boton para ir a info.extra
        val btn_menu=findViewById<Button>(R.id.btn_start)
        btn_menu.setOnClickListener {
            val passMenu = Intent(this,Menu::class.java)
            startActivity(passMenu)
        }
    }
}