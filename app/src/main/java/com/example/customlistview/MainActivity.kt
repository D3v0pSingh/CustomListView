package com.example.customlistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener {
            Intent(this,ListView_1::class.java).also {
                startActivity(it)
            }
        }

        btn2.setOnClickListener {
            Intent(this,ListView_2::class.java).also {
                startActivity(it)
            }
        }

        btn3.setOnClickListener {
            Intent(this,ListView_3::class.java).also {
                startActivity(it)
            }
        }
    }
}