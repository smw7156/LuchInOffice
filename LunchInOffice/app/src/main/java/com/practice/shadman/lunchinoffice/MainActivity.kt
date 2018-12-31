package com.practice.shadman.lunchinoffice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var tv_hello :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_hello = findViewById<TextView>(R.id.tv_hello)
        val btn_click = findViewById<Button>(R.id.btn_clk)
        btn_click.setOnClickListener {
            tv_hello.setText("I Got CLICKED!!")
        }
    }
}
