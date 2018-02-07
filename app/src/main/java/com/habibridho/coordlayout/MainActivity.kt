package com.habibridho.coordlayout

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSnackBar.setOnClickListener {
            val intent = Intent(this, SnackActivity::class.java)
            startActivity(intent)
        }

        btnCard.setOnClickListener{
            val intent = Intent(this, CardActivity::class.java)
            startActivity(intent)
        }

        btnCollapsing.setOnClickListener {
            val intent = Intent(this, CollapsingActivity::class.java)
            startActivity(intent)
        }
    }
}
