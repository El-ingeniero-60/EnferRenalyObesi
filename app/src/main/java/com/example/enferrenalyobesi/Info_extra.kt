package com.example.enferrenalyobesi

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView

class Info_extra : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_extra)
        //REGRESAR AL MENU
        val btn_regr=findViewById<Button>(R.id.btn_regresar)
        btn_regr.setOnClickListener {
            val passRegr = Intent(this, Menu::class.java)
            startActivity(passRegr)
        }
        //BOTONES DE INFORMACION
            val info1 = findViewById<Button>(R.id.btn_info1)
            val info2 = findViewById<Button>(R.id.btn_info2)
            val info3 = findViewById<Button>(R.id.btn_info3)
            val info4 = findViewById<Button>(R.id.btn_info4)
        //ACCESO A INFORMACION

            info1.setOnClickListener {
                val enlace1="https://www.insp.mx/avisos/5296-enfermedad-renal-cronica-mexico.html"
                val entrar = Intent(Intent.ACTION_VIEW, Uri.parse(enlace1))
                if (entrar.resolveActivity(packageManager) != null) {
                    startActivity(entrar)
                } else {
                    Toast.makeText(this, "No hay aplicaciones para abrir el enlace", Toast.LENGTH_SHORT).show()
                }
            }
            info2.setOnClickListener {
                val enlace2="https://www.niddk.nih.gov/health-information/informacion-de-la-salud/enfermedades-rinones/insuficiencia-renal/que-es"
                val entrar2 = Intent(Intent.ACTION_VIEW, Uri.parse(enlace2))
                if (entrar2.resolveActivity(packageManager) != null) {
                    startActivity(entrar2)
                } else {
                    Toast.makeText(this, "No hay aplicaciones para abrir el enlace", Toast.LENGTH_SHORT).show()
                }
            }
            info3.setOnClickListener {
                val enlace3="https://www.paho.org/es/temas/enfermedad-cronica-rinon#:~:text=La%20enfermedad%20renal%20cr%C3%B3nica%20del,son%20excretados%20en%20la%20orina"
                val entrar3= Intent(Intent.ACTION_VIEW, Uri.parse(enlace3))
                if (entrar3.resolveActivity(packageManager) != null) {
                    startActivity(entrar3)
                } else {
                    Toast.makeText(this, "No hay aplicaciones para abrir el enlace", Toast.LENGTH_SHORT).show()
                }
            }
            info4.setOnClickListener {
                val enlace4="https://www.amgen.com.mx/media/news-release-listing/2022/03/LA-ENFERMEDAD-RENAL-CRONICA#:~:text=de%20Amgen%20Mexico.-,LA%20ENFERMEDAD%20RENAL%20CR%C3%93NICA%20PREVALECE%20EN%20M%C3%89XICO%2C%20CON%206.2%20MILLONES,PACIENTES%20EN%20SUS%20DISTINTAS%20ETAPAS&text=Ciudad%20de%20M%C3%A9xico%20a%2C%209%20de%20marzo%20de%202022"
                val entrar4 = Intent(Intent.ACTION_VIEW, Uri.parse(enlace4))
                if (entrar4.resolveActivity(packageManager) != null) {
                    startActivity(entrar4)
                } else {
                    Toast.makeText(this, "No hay aplicaciones para abrir el enlace", Toast.LENGTH_SHORT).show()
                }
            }
            //video
            val video = findViewById<VideoView>(R.id.video2)
            val videoPath = "android.resource://" + packageName + "/" + R.raw.video_2
            val mediaController = MediaController(this)
            mediaController.setAnchorView(video)
            video.setMediaController(mediaController)
            video.setVideoURI(Uri.parse(videoPath))
            video.start()
        }
    }
