package com.egsystem.homepage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initClick()
    }

    private fun initClick() {
        val cardView1 = findViewById<CardView>(R.id.cardView1)
        cardView1.setOnClickListener {
            val intent = Intent(this, DashboardOneActivity::class.java)
            startActivity(intent)
        }

        val cardView2 = findViewById<CardView>(R.id.cardView2)
        cardView2.setOnClickListener {
            val intent = Intent(this, DashboardTwoActivity::class.java)
            startActivity(intent)
        }


    }
}