package com.raikerxv.basicsinkotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.raikerxv.basicsinkotlin.kotlin_basics.lemonade.LemonadeActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(Intent(this, LemonadeActivity::class.java))
    }
}