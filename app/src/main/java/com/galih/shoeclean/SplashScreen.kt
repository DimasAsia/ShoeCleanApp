package com.galih.shoeclean

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        var handler = Handler()
        handler.postDelayed({
            var intent = Intent(this@SplashScreen, Onboarding1::class.java)
            startActivity(intent)
            finish()
        }, 5000)
    }
}