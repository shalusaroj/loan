package com.goodtechmind.dcollection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.goodtechmind.dcollection.DashboardActivity
import com.goodtechmind.dcollection.databinding.ActivityLoginBinding
import com.goodtechmind.dcollection.retrofit.ApiInterface
import com.goodtechmind.dcollection.retrofit.RetrofitClient
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

            val username = binding!!.loginUsername.text.toString().trim()
            val password = binding!!.loginPassword.text.toString().trim()

            if (TextUtils.isEmpty(username)){
                binding!!.loginUsername.error="Username required"
            }else if (TextUtils.isEmpty(password)){
                binding!!.loginPassword.error="Password required"
            }else{

                login()

            }
        }
    }

    private fun login() {

        var retrofit = RetrofitClient.getInstance()
        var apiInterface = retrofit.create(ApiInterface::class.java)
        lifecycleScope.launchWhenCreated {
            try {
                val response = apiInterface.loginUser(binding!!.loginUsername.text.toString().trim(),binding!!.loginPassword.text.toString().trim())
                if (response.isSuccessful){
                    startActivity(Intent(this@LoginActivity,DashboardActivity::class.java))
                }else{
                    Toast.makeText(this@LoginActivity,response.errorBody().toString(),Toast.LENGTH_SHORT).show()
                }
            }catch (Ex:java.lang.Exception){
                Log.e("Error ",Ex.localizedMessage)
            }
        }

    }
}