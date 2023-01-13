package com.goodtechmind.dcollection

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.goodtechmind.dcollection.R

class phone_call : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_call)
        title = "Phone_Call"
        fun send(view: View) {
            try {
                packageManager.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES)
                val number = "+918429673533"
                val intent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://wa.me/$number?text=I'm%20interested%20in%20your%20car%20for%20sale")
                )
                intent.setPackage("com.whatsapp")
                startActivity(intent)
            } catch (e: PackageManager.NameNotFoundException) {
                Toast.makeText(
                    this,
                    "Whatsapp app not installed in your phone",
                    Toast.LENGTH_SHORT
                ).show()
                e.printStackTrace()
            }
        }
    }
    fun call(view: View) {
        val dialIntent = Intent(Intent.ACTION_DIAL)
        dialIntent.data = Uri.parse("tel:" + "8344814819")
        startActivity(dialIntent)
    }

}