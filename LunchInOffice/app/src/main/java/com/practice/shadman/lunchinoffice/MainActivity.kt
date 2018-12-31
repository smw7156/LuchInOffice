package com.practice.shadman.lunchinoffice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

    lateinit var tv_hello :TextView
    lateinit var btn_click :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_hello = findViewById<TextView>(R.id.tv_hello)
        btn_click = findViewById<Button>(R.id.btn_clk)
//        btn_click.setOnClickListener {
//            tv_hello.setText("I Got CLICKED!!")
//        }

        btn_click.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if ( v != null) {
            if (v == btn_click) {
                Log.i("onCLick","button Click")
                tv_hello.setText("I did it")
            }
        }
    }

}
