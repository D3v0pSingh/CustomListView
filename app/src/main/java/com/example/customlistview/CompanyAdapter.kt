package com.example.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CompanyAdapter(var con: Context, private val arrayList: ArrayList<SingleUnit>):
    ArrayAdapter<SingleUnit>(con,R.layout.single_entry_layout2,arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater:LayoutInflater = LayoutInflater.from(con)
        val view:View = inflater.inflate(R.layout.single_entry_layout2,null)

        val lg = view.findViewById(R.id.logo)as ImageView
        val lgname = view.findViewById(R.id.logoname) as TextView
        val lgType = view.findViewById(R.id.type) as TextView

        lg.setImageResource(arrayList[position].companyLogo)
        lgname.setText(arrayList[position].companyName)
        lgType.setText(arrayList[position].companyType)

        return view




        return super.getView(position, convertView, parent)
    }
}