package com.goodtechmind.dcollection

import androidx.appcompat.app.AppCompatActivity
import com.goodtechmind.dcollection.customization.CustomProgressDialog
import android.os.Bundle
import android.content.Intent
import android.os.Handler
import com.goodtechmind.dcollection.LoginActivity
import com.goodtechmind.dcollection.databinding.ActivityWelcomeBinding
import java.util.*

class WelcomeActivity : AppCompatActivity() {
    private var binding: ActivityWelcomeBinding? = null
    var dialog: CustomProgressDialog? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(
            layoutInflater
        )
        setContentView(binding!!.root)
        Objects.requireNonNull(supportActionBar)?.hide()
        dialog = CustomProgressDialog(this)
        binding!!.login.setOnClickListener {
            dialog!!.show()
            Handler().postDelayed({
                dialog!!.dismiss()
                val intent = Intent(this@WelcomeActivity, LoginActivity::class.java)
                startActivity(intent)
                finish()
            }, 1000)
        }
    }
}