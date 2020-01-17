package com.katsidzira.funfacts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    private var factTextView: TextView? = null
    private var showFactButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_facts)

        factTextView = findViewById<TextView>(R.id.fact_textview)
        showFactButton = findViewById<Button>(R.id.button)
        showFactButton!!.setOnClickListener {

            factTextView!!.text = fact
        }
    }



}
