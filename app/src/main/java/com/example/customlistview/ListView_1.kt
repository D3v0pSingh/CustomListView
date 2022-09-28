package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list_view1.*

class ListView_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view1)


        val list = arrayOf("apple","orange","banana","guava","lime","chocolate","mango","santra","mausambi")
        val arrayadapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,list)
        listview1.adapter=arrayadapter
        listview1.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this,"You have pressed ${list[i]}",Toast.LENGTH_SHORT).show()
        }
    }
}