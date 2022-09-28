package com.example.customlistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_list_view3.*

class ListView_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view3)


        val name = arrayOf(
            "Apple",
            "Google",
            "Microsoft",
            "Amazon",
            "Facebook",
            "Coca-Cola",
            "Disney",
            "Samsung",
            "Louis Vuitton",
            "McDonald's",
            "Toyota",
            "Intel",
            "NIKE",
            "AT&T",
            "Cisco",
            "Oracle",
            "Verizon",
            "Visa",
            "Walmart",
            "General ELectronics"
        )
        val foundercom = arrayOf("Steve Jobs","Larry Page","Bill Gates ","Jeff Bezos",
            "Mark Zukerberg ","Asa Griggs ","Walt Disney ","Lee Byung ","Louis Vitton ",
            "Ray Kroc ","Kiichiro Toyoda ","Gordon Moore ","Phil Knight ","Alexender Graham Bell ",
            "Sandy Lerner ","Larry Ellison ","Chuck Lee ","Dee Hock ","Sam Walton ",
            "Thomas Edison ")

        val design = intArrayOf(
            R.drawable.apple, R.drawable.google, R.drawable.micro, R.drawable.ama, R.drawable.fb,
            R.drawable.cc, R.drawable.disney, R.drawable.ss, R.drawable.lv, R.drawable.mcd,
            R.drawable.ty, R.drawable.intel, R.drawable.nike, R.drawable.att, R.drawable.cis,
            R.drawable.orcale, R.drawable.ver, R.drawable.visa, R.drawable.wal, R.drawable.ge,
        )


        val category = arrayOf(
            "Technology", "Technology", "Technology", "Technology", "Technology",
            "Beverages", "leisure", "Technology", "Luxury", "Restaurants",
            "Automotive", "Technology", "Apparel", "Telecom", "Technology",
            "Technology", "Telecom", "Financial Services", "Retail", "Diversified",
        )

        val income = arrayOf(
            "$241.2 B", "$207.5 B",
            " $162.9 B",
            "$135.4 B",
            "$70.3 B",
            "$64.4 B",
            "$61.3 B",
            " $50.4 B",
            "$47.2 B",
            " $46.1 B",
            "$41.5 B",
            "$39.5 B",
            "$39.1 B",
            "$37.3 B",
            " $36 B",
            " $35.7 B",
            "$32.3 B",
            " $31.8 B",
            "$29.5 B",
            " $29.5 B",
        )



        val companyArrayList = ArrayList<SingleUnit>()

        for(i in name.indices){
            val com = SingleUnit(name[i],category[i],income[i],foundercom[i],design[i])
            companyArrayList.add(com)
        }

        lstv3.adapter = CompanyAdapter(this,companyArrayList)

        lstv3.setOnItemClickListener { adapterView, view, i, l ->

            val cname = name[i]
            val cfounder = foundercom[i]
            val cincome = income[i]
            val cimage = design[i]

            val intent = Intent(this,IndividualDetails::class.java)
            intent.putExtra("name",cname)
            intent.putExtra("founder",cfounder)
            intent.putExtra("income",cincome)
            intent.putExtra("logo",cimage)
            startActivity(intent)

        }
    }
}