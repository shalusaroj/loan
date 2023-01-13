package com.goodtechmind.dcollection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.content.Intent
import com.goodtechmind.dcollection.databinding.ActivityAssignBinding
import java.util.ArrayList

class AssignActivity : AppCompatActivity() {
    var binding: ActivityAssignBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAssignBinding.inflate(
            layoutInflater
        )
        setContentView(binding!!.root)
        val imageId =
            intArrayOf(R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e)
        val name = arrayOf(
            "Gaurav Suyal",
            "Kanhiya Singh",
            "Utsav Dwivedi",
            "Vicky Raj",
            "Gajendar Yadav",
            "Gaurav Suyal",
            "Kanhiya Singh",
            "Utsav Dwivedi",
            "Vicky Raj",
            "Gajendar Yadav"
        )
        val lastMassage = arrayOf("hello", "hello", "hello", "hello", "hello")
        val lastmsgTime = arrayOf("8:00 Am", "8:00 Am", "8:00 Am", "8:00 Am", "8:00 Am")
        val phoneNo = arrayOf("9661171289", "9661171289", "9661171289", "9661171289", "9661171289")
        val country = arrayOf("India", "India", "India", "India", "India")
        val userArrayList = ArrayList<User>()
        for (i in imageId.indices) {
            val user = User(name[i], lastMassage[i], phoneNo[i], country[i], imageId[i])
            userArrayList.add(user)
        }
        val listAdapter = ListAdapter(this@AssignActivity, userArrayList)
        binding!!.listview.adapter = listAdapter
        binding!!.listview.isClickable = true
        binding!!.listview.onItemClickListener = OnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this@AssignActivity, userActivity::class.java)
            intent.putExtra("name", name[i])
            intent.putExtra("phone", phoneNo[i])
            intent.putExtra("country", country[i])
            intent.putExtra("imageid", imageId[i])
            startActivity(intent)
        }
    }
}