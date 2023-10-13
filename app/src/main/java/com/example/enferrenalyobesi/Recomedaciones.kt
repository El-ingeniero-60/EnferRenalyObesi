package com.example.enferrenalyobesi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Recomedaciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recomedaciones)
        //REGRESAR AL MENU
        val btn_regr=findViewById<Button>(R.id.btn_volver)
        btn_regr.setOnClickListener {
            val passRegr = Intent(this,Menu::class.java)
            startActivity(passRegr)
        }
    }
}