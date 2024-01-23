package com.example .zadaniemobline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.google.android.material.navigation.NavigationView


class frekwencja : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frekwencja)

        val tablica = intent.getStringArrayExtra("Przerzucanie")

        supportActionBar?.hide()
        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.visibility = View.GONE

        findViewById<Button>(R.id.btnwyjdz).setOnClickListener {
            navigationView.visibility = View.GONE
        }

        findViewById<ImageView>(R.id.ikonka).setOnClickListener {
            navigationView.visibility = View.VISIBLE
        }

        findViewById<Button>(R.id.frekwencja).setOnClickListener {
            startActivity(Intent(this, frekwencja::class.java).putExtra("Przerzucanie", tablica))
        }


        findViewById<Button>(R.id.oceny).setOnClickListener {
            startActivity(Intent(this, TabOcen::class.java).putExtra("Przerzucanie", tablica))
        }


        findViewById<Button>(R.id.inf).setOnClickListener {
            startActivity(Intent(this,infouztykownik::class.java).putExtra("Przerzucanie", tablica))
        }
    }
}