package com.example.bscapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNavigationView.selectedItemId = R.id.bottom_setting

        bottomNavigationView.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener { item ->
            val itemId = item.itemId
            if (itemId == R.id.bottom_home) {
                startActivity(Intent(applicationContext, MainActivity::class.java))
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                finish()
                return@OnItemSelectedListener true
            } else if (itemId == R.id.bottom_search) {
                startActivity(Intent(applicationContext, SetarchActivity::class.java))
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                finish()
                return@OnItemSelectedListener true
            } else if (itemId == R.id.bottom_setting) {
                return@OnItemSelectedListener true
            } else if (itemId == R.id.bottom_Profile) {
                startActivity(Intent(applicationContext, ProfileActivity::class.java))
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                finish()
                return@OnItemSelectedListener true
            }
            false
        })
    }
}