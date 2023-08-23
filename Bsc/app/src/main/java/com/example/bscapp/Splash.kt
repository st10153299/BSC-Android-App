package com.example.bscapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import java.util.Timer
import java.util.TimerTask

class Splash : AppCompatActivity() {

    private   lateinit var imggif: ImageView
    var delay: Long = 5000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        imggif = findViewById(R.id.logo)
        //load gif
       // Glide.with(this).load(R.drawable.loading).into(imggif)

        val runsplash = Timer()
        val ShowSplash: TimerTask = object : TimerTask() {
            override fun run() {
                finish()
                val intent = Intent(this@Splash, MainActivity::class.java)
                startActivity(intent)
            }
        }
        runsplash.schedule(ShowSplash, delay)
    }
}