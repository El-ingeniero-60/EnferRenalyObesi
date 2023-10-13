package com.example.enferrenalyobesi

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        //boton para ir a que es
        val btn_que=findViewById<Button>(R.id.btn_op1)
        btn_que.setOnClickListener {
            val passQue = Intent(this,Que_es::class.java)
            startActivity(passQue)
        }
        //boton para ir a factores de riesgo
        val btn_fact=findViewById<Button>(R.id.btn_op2)
        btn_fact.setOnClickListener {
            val passFact = Intent(this,Factores_riesgo::class.java)
            startActivity(passFact)
        }
        //boton para ir a recomendaciones
        val btn_recomen=findViewById<Button>(R.id.btn_op3)
        btn_recomen.setOnClickListener {
            val passRecomen = Intent(this,Recomedaciones::class.java)
            startActivity(passRecomen)
        }
        //boton para ir a sintomas
        val btn_sintomas=findViewById<Button>(R.id.btn_op4)
        btn_sintomas.setOnClickListener {
            val passSint = Intent(this,Sintomas::class.java)
            startActivity(passSint)
        }
        //boton para ir a info.extra
        val btn_infoex=findViewById<Button>(R.id.btn_op5)
        btn_infoex.setOnClickListener {
            val passInfoEx = Intent(this,Info_extra::class.java)
            startActivity(passInfoEx)
        }
        //boton para ir a creditos
        val btn_credi =findViewById<Button>(R.id.btn_creditos)
        btn_credi.setOnClickListener {
            val passCreditos = Intent(this, Creditos::class.java)
            startActivity(passCreditos)
        }
        //boton para ir a Menu
        val btn_regr=findViewById<Button>(R.id.btn_regresar)
        btn_regr.setOnClickListener {
            val passRegr = Intent(this,MainActivity::class.java)
            startActivity(passRegr)
        }
    }
}