package com.goodtechmind.dcollection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.goodtechmind.dcollection.R
import com.goodtechmind.dcollection.databinding.ActivityUserBinding

class userActivity : AppCompatActivity() {
    var binding: ActivityUserBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(
            layoutInflater
        )
        setContentView(binding!!.root)
        val intent = this.intent
        if (intent != null) {
            val name = intent.getStringExtra("name")
            val phone = intent.getStringExtra("phone")
            val country = intent.getStringExtra("country")
            val imageid = intent.getIntExtra("imageid", R.drawable.a)
            binding!!.namep.text = name
            binding!!.number.text = phone
            binding!!.con.text = country
            binding!!.profileImahe.setImageResource(imageid)
        }
    }
}