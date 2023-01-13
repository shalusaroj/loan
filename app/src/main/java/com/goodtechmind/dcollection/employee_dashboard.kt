package com.goodtechmind.dcollection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class employee_dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_dashboard)
    }
fun todayscollectionlist(view: View) {
    val intent = Intent(this@employee_dashboard, todaylist_i::class.java)
    startActivity(intent)
}
fun previousdueslist(view: View) {
    val intent = Intent(this@employee_dashboard, previous_list_item::class.java)
    startActivity(intent)
}
fun collectionhistory(view: View) {
    val intent = Intent(this@employee_dashboard, collection_history_item::class.java)
    startActivity(intent)
}
    fun leave(view: View) {
        val intent = Intent(this@employee_dashboard, leave_form::class.java)
        startActivity(intent)
    }
    fun attendence(view: View) {
        val intent = Intent(this@employee_dashboard, camera_intent::class.java)
        startActivity(intent)
    }
    fun transactionhistory(view: View) {
        val intent = Intent(this@employee_dashboard, payment_history::class.java)
        startActivity(intent)
    }
}