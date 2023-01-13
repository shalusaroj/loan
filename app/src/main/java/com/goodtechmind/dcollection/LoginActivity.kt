package com.goodtechmind.dcollection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.goodtechmind.dcollection.DashboardActivity
import com.goodtechmind.dcollection.databinding.ActivityLoginBinding
import java.util.*

class LoginActivity : AppCompatActivity() {
    var binding: ActivityLoginBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(
            layoutInflater
        )
        setContentView(binding!!.root)
        Objects.requireNonNull(supportActionBar)?.hide()
        binding!!.loginBtn.setOnClickListener {
            startActivity(
                Intent(
                    this@LoginActivity,
                    DashboardActivity::class.java
                )
            )
        }
    }
}