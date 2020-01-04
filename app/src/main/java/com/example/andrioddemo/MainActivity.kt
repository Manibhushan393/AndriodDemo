package com.example.andrioddemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myBtn = findViewById<Button>(R.id.myButton)
        val myText = findViewById<TextView>(R.id.myTextView)
        val myEditText = findViewById<TextView>(R.id.myEditText)
        val maleRadioBtn = findViewById<RadioButton>(R.id.maleRadioButton)


        myBtn.setOnClickListener {

            Toast.makeText(this,"Button is Clicked",Toast.LENGTH_LONG).show()
            myText.text = myEditText.text.toString()

        }

    }
}
