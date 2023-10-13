package com.galih.shoeclean


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Onboarding1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding1)

        var button: ImageButton = findViewById(R.id.btn_arrow)
        button.setOnClickListener(){
            var intent = Intent(this@Onboarding1, Onboarding2::class.java)
            startActivity(intent)
            finish()
        }
    }
}