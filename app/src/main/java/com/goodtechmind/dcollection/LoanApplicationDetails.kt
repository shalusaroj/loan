package com.goodtechmind.dcollection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.goodtechmind.dcollection.databinding.ActivityLoanApplicationDetailsBinding
import java.util.*

class LoanApplicationDetails : AppCompatActivity() {
    private var binding: ActivityLoanApplicationDetailsBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoanApplicationDetailsBinding.inflate(
            layoutInflater
        )
        setContentView(binding!!.root)
        Objects.requireNonNull(supportActionBar)?.hide()
    }
}