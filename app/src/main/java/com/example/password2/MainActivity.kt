package com.example.password2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var et_user_name = findViewById<EditText>(R.id.et_user_name)
        var et_password = findViewById<EditText>(R.id.et_password)
        var btn_reset = findViewById<Button>(R.id.btn_reset)
        var btn_submit = findViewById<Button>(R.id.btn_submit)

        btn_reset.setOnClickListener {

            et_user_name.setText("")
            et_password.setText("")
        }

        btn_submit.setOnClickListener {
            val user_name = et_user_name.text;
            val password = et_password.text;
            Toast.makeText(this@MainActivity, user_name, Toast.LENGTH_LONG).show()

        }
        findViewById<Button>(R.id.pokazbtn).setOnClickListener {
            if(findViewById<Button>(R.id.pokazbtn).text.toString().equals("Show")){
                et_password.transformationMethod = HideReturnsTransformationMethod.getInstance()
                findViewById<Button>(R.id.pokazbtn).text = "Hide"
            } else{
                et_password.transformationMethod = PasswordTransformationMethod.getInstance()
                findViewById<Button>(R.id.pokazbtn).text = "Show"
            }
        }
    }
}
