package com.katsidzira.funfacts

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    private var factTextView: TextView? = null
    private var showFactButton: Button? = null
    private val factBook = FactBook()
    private val colorWheel = ColorWheel()
    private var relativeLayout: RelativeLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_facts)

        relativeLayout = findViewById(R.id.relative_layout)

        factTextView = findViewById(R.id.fact_textview)
        showFactButton = findViewById(R.id.button)
        showFactButton!!.setOnClickListener {
            val fact = factBook.getFact()
            val color = colorWheel.getColor()

            factTextView!!.text = fact
            relativeLayout!!.setBackgroundColor(color)
            showFactButton!!.setTextColor(color)
        }
    }



}
