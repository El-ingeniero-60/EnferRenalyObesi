package com.example.enferrenalyobesi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Factores_riesgo : AppCompatActivity() {
    lateinit var tv_1: TextView
    lateinit var tv_2: TextView
    lateinit var tv_3: TextView
    lateinit var iv_1: ImageView
    lateinit var iv_2: ImageView
    lateinit var iv_3: ImageView
    lateinit var tv_4: TextView
    lateinit var tv_5: TextView
    lateinit var tv_6: TextView
    lateinit var iv_4: ImageView
    lateinit var iv_5: ImageView
    lateinit var iv_6: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factores_riesgo)
        //ACCION PARA MOSTRAR INFORMACION ADICIONAL EN LOS FACTORES
        tv_1 = findViewById(R.id.tv_1)
        tv_2 = findViewById(R.id.tv_2)
        tv_3 = findViewById(R.id.tv_3)
        tv_4 = findViewById(R.id.tv_4)
        tv_5 = findViewById(R.id.tv_5)
        tv_6 = findViewById(R.id.tv_6)

        iv_1 = findViewById(R.id.iv_1)
        iv_2 = findViewById(R.id.iv_2)
        iv_3 = findViewById(R.id.iv_3)
        iv_4 = findViewById(R.id.iv_4)
        iv_5 = findViewById(R.id.iv_5)
        iv_6 = findViewById(R.id.iv_6)

        val btn_1: Button = findViewById(R.id.btn_1)
        val btn_2: Button = findViewById(R.id.btn_2)
        val btn_3: Button = findViewById(R.id.btn_3)
        val btn_4: Button = findViewById(R.id.btn_4)
        val btn_5: Button = findViewById(R.id.btn_5)
        val btn_6: Button = findViewById(R.id.btn_6)

        btn_1.setOnClickListener {
            toggleVisibility(tv_1, iv_1)
            hideOthers(tv_1, iv_1)
        }

        btn_2.setOnClickListener {
            toggleVisibility(tv_2, iv_2)
            hideOthers(tv_2, iv_2)
        }

        btn_3.setOnClickListener {
            toggleVisibility(tv_3, iv_3)
            hideOthers(tv_3, iv_3)
        }
        btn_4.setOnClickListener {
            toggleVisibility(tv_4, iv_4)
            hideOthers(tv_4, iv_4)
        }

        btn_5.setOnClickListener {
            toggleVisibility(tv_5, iv_5)
            hideOthers(tv_5, iv_5)
        }

        btn_6.setOnClickListener {
            toggleVisibility(tv_6, iv_6)
            hideOthers(tv_6, iv_6)
        }
        //REGRESAR AL MENU
        val btn_regr=findViewById<Button>(R.id.btn_reg)
        btn_regr.setOnClickListener {
            val passRegr = Intent(this,Menu::class.java)
            startActivity(passRegr)
        }
    }
    private fun toggleVisibility(vararg views: View) {
        for (view in views) {
            if (view.visibility == View.VISIBLE) {
                view.visibility = View.GONE
            } else {
                view.visibility = View.VISIBLE
            }
        }
    }

    private fun hideOthers(vararg exceptViews: View) {
        val allViews = arrayOf(tv_1, tv_2, tv_3,tv_4, tv_5, tv_6, iv_1, iv_2, iv_3, iv_4, iv_5, iv_6)
        for (view in allViews) {
            if (!exceptViews.contains(view) && view.visibility == View.VISIBLE) {
                view.visibility = View.GONE
            }
        }
    }
}