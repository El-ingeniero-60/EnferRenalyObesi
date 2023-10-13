package com.example.enferrenalyobesi

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.VideoView
import android.widget.MediaController

class Que_es : AppCompatActivity(){
    private val videoUrl = "https://www.youtube.com/watch?v=_IHWzW7SQ-4" // Reemplaza VIDEO_ID con el ID del video de YouTube
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_que_es)
        //BOTONES-ESTADISTICAS
        val boton1 = findViewById<Button>(R.id.btn1)
        val boton2 = findViewById<Button>(R.id.btn2)
        val boton3 = findViewById<Button>(R.id.btn3)
        //IMAGENES-ESTADISTICAS
        val imagen1 = findViewById<ImageView>(R.id.eImage1)
        val imagen2 = findViewById<ImageView>(R.id.eImage2)
        val imagen3 = findViewById<ImageView>(R.id.eImage3)
        //TEXTOS-ESTADISTICAS
        val text1 = findViewById<TextView>(R.id.eText1)
        val text2 = findViewById<TextView>(R.id.eText2)
        val text3 = findViewById<TextView>(R.id.eText3)
        //CONTAINER
        val container = findViewById<View>(R.id.container)
        //ESTADISITCAS
        boton1.setOnClickListener {
            text1.visibility= View.VISIBLE
            imagen1.visibility = View.VISIBLE
            text2.visibility= View.INVISIBLE
            imagen2.visibility = View.INVISIBLE
            text3.visibility= View.INVISIBLE
            imagen3.visibility = View.INVISIBLE
        }
        boton2.setOnClickListener {
            text2.visibility= View.VISIBLE
            imagen2.visibility = View.VISIBLE
            text1.visibility= View.INVISIBLE
            imagen1.visibility = View.INVISIBLE
            text3.visibility= View.INVISIBLE
            imagen3.visibility = View.INVISIBLE
        }
        boton3.setOnClickListener {
            text3.visibility= View.VISIBLE
            imagen3.visibility = View.VISIBLE
            text1.visibility= View.INVISIBLE
            imagen1.visibility = View.INVISIBLE
            text2.visibility= View.INVISIBLE
            imagen2.visibility = View.INVISIBLE

        }

        container.setOnClickListener {
            text1.visibility= View.INVISIBLE
            imagen1.visibility = View.INVISIBLE
            text2.visibility= View.INVISIBLE
            imagen2.visibility = View.INVISIBLE
            text3.visibility= View.INVISIBLE
            imagen3.visibility = View.INVISIBLE
        }

        //REGRESAR AL MENU
        val btn_reg = findViewById<Button>(R.id.btn_regresar)
        btn_reg.setOnClickListener {
            val passRegr = Intent(this, Menu::class.java)
            startActivity(passRegr)
        }
        //VIDEO
       val video = findViewById<VideoView>(R.id.reproduc)
        val videoPath = "android.resource://" + packageName + "/" + R.raw.video_1
        val mediaController = MediaController(this)
        mediaController.setAnchorView(video)
        video.setMediaController(mediaController)
        video.setVideoURI(Uri.parse(videoPath))
        video.start()
    }

}





