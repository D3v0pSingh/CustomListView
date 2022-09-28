package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.customlistview.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_list_view2.*



class ListView_2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view2)

        //setting pictures in array
        val img = arrayOf(
            R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six,
            R.drawable.seven,R.drawable.eight,R.drawable.nine,R.drawable.ten,R.drawable.eleven,R.drawable.twelve,
            R.drawable.thirteen,R.drawable.fourteen,R.drawable.fifteen,R.drawable.sixteen,R.drawable.eighteen,R.drawable.nineteen,
            R.drawable.twenty
        )

        //setting names in an array
        val friends = arrayOf(
            "Gagan","Raj","Sandeep","Navjot","Senthil","Ashok","Guri","AP","Pitbull",
            "Ananya","Rishi","Rohan","Arjun","Satpreet","Shivan","Dillu","Karan","Karen",
            "Chris"
        )

        //3.setting phone numbers in array
        val numph = arrayOf(
            "189345785776","7857878745","85784754875","57574857","467656385","6345894759",
            "8758975345","7485734453","9878457456","578346578658","8458765754","7465764784",
            "45348757648","485739887","475897487453","5768457662763","2345878675","90687053423",
            "635475688789"
        )

        //4.setting country name in array
        val cotry = arrayOf(
            "US","Ind","AUS","Uk","SRI","NZ","CAN","BRA","RUS","CHN","JPN",
            "US","Ind","AUS","Uk","SRI","NZ","CAN","BRA"
        )

        //defining a arraylist to add all the above array into itself
        val userArrayList = ArrayList<AllUserData>()

        //defining a for loop with numph as a reference
        for (i in numph.indices){
            //defining object of data class AllUserData as user
            val user = AllUserData(friends[i],numph[i],cotry[i],img[i])
            //adding the user object into arraylist as a 1 user with name,number,img
            // 1 index = 1 user
            //user1 = friend[1],numph[1],couty[1],img[1]
            userArrayList.add(user)
        }
       //setting customadapter for listView
        lv2.adapter = CustomAdapter(this,userArrayList)
    }
}