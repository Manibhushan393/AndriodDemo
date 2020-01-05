package com.example.andrioddemo

import android.content.Intent
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
        val nxtBtn = findViewById<Button>(R.id.next_button)
        val myText = findViewById<TextView>(R.id.myTextView)
        val myEditText = findViewById<TextView>(R.id.myEditText)
        val maleRadioBtn = findViewById<RadioButton>(R.id.maleRadioButton)


        myBtn.setOnClickListener {

            Toast.makeText(this,"Button is Clicked",Toast.LENGTH_LONG).show()
            myText.text = myEditText.text.toString()

        }

        nxtBtn.setOnClickListener {
          navigateToNext()
        }

    }

    fun navigateToNext()
    {
        val intent = Intent(this@MainActivity,ListingActivity::class.java)
        startActivity(intent)
    }

}
