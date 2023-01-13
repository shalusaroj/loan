package com.goodtechmind.dcollection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
    }

    fun employee(view: View) {
        val intent = Intent(this@DashboardActivity, employee_dashboard::class.java)
        startActivity(intent)
    }
    fun loanassign(view: View) {
        val intent = Intent(this@DashboardActivity, AssignActivity::class.java)
        startActivity(intent)
    }
    fun approvals(view: View) {
        val intent = Intent(this@DashboardActivity, ApprovalsActivity::class.java)
        startActivity(intent)
    }
}