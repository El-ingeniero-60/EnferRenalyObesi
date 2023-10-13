package com.example.enferrenalyobesi

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class Sintomas : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sintomas)
        //REGRESAR AL MENU
        val btn_regr=findViewById<Button>(R.id.btn_regresar)
        btn_regr.setOnClickListener {
            val passRegr = Intent(this,Menu::class.java)
            startActivity(passRegr)
        }
        //CHECKBOX
        val checkboxes = arrayOf(
            findViewById<CheckBox>(R.id.check_1),
            findViewById<CheckBox>(R.id.check_2),
            findViewById<CheckBox>(R.id.check_3),
            findViewById<CheckBox>(R.id.check_4),
            findViewById<CheckBox>(R.id.check_5),
            findViewById<CheckBox>(R.id.check_6),
            findViewById<CheckBox>(R.id.check_7),
            findViewById<CheckBox>(R.id.check_8)
        )
        val botonConsulta = findViewById<Button>(R.id.btn_ac)

        checkboxes.forEach { checkbox ->
            checkbox.setOnCheckedChangeListener { _,_ ->
                val checkboxesSeleccionados = checkboxes.count { it.isChecked }
                botonConsulta.isEnabled = checkboxesSeleccionados >= 2
                botonConsulta.setOnClickListener{
                    Toast.makeText(this, "¡AGENDADO A CONSULTA!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
