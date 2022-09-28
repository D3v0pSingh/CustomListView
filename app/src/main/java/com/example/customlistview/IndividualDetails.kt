package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_individual_details.*

class IndividualDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_individual_details)

        val name = intent.getStringExtra("name")
        val founder = intent.getStringExtra("founder")
        val income = intent.getStringExtra("income")
        val image = intent.getIntExtra("logo",0)

        profileimage.apply {
            setImageResource(image)
        }
        legacy.apply{
            setText(name)
        }
        found.apply{
            setText(founder)
        }
        price.apply{
            setText(income)
        }
    }
}