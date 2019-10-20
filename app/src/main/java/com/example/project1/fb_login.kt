package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.project1.fb_login
import kotlinx.android.synthetic.main.signup.*

class fb_login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        signup.setOnClickListener() {
            var i = Intent(this, login::class.java)
            startActivity(i)

        }
    }
}
