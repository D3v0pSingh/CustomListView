package com.example.customlistview

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class CustomAdapter(var con: Context, private val arraylist: ArrayList<AllUserData>) :
    ArrayAdapter<AllUserData>(con, R.layout.single_entry_layout, arraylist) {
    //while defining context we can also use "private val con:Activity" instead of "var con:Context"
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //1.Bringing inflater into picture
        val inflater: LayoutInflater = LayoutInflater.from(con)//inflater has been created
        val view: View = inflater.inflate(R.layout.single_entry_layout, null)//creating object of view class and inflating layout

        //2. Locating data that is to be set
        val image: ImageView = view.findViewById(R.id.profilepic)//finding image
        val userName: TextView = view.findViewById(R.id.personName)//finding userName
        val phnum: TextView = view.findViewById(R.id.phoneNumber)//finding phone number

        //3.Getting and combining all data from data class into arrayList
        image.setImageResource(arraylist[position].Image) //getting our image from dataclass and setting in arraylist indices
        userName.setText(arraylist[position].name)//getting userName from dataclass and setting in arrayList indices
        phnum.setText(arraylist[position].phoneNum)//getting phonenumber from dataclass and setting in arrayadapter indices

        //4.returning the view
        return view
    }

}