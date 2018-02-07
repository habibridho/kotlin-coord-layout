package com.habibridho.coordlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_snack.*

class SnackActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack)

        showButton.setOnClickListener {
            Snackbar.make(coordinatorLayout,
                    "This is a simple snackbar.", Snackbar.LENGTH_LONG)
                    .setAction("CLOSE", { _ -> Toast.makeText(this, "Closed", Toast.LENGTH_SHORT).show() })
                    .show()
        }
    }
}
