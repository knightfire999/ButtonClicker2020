package com.example.buttonclicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

private var timesClicked = 0
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickMeClick(view : View)
    {
        timesClicked++
        button.setText(timesClicked.toString())
        if(timesClicked == 10)
        {
            Toast.makeText(this, "Way to go! 10 is a big number!", Toast.LENGTH_LONG).show()
        }
        else if(timesClicked == 50)
        {
            Toast.makeText(this, "Wow! Nice button clicking!", Toast.LENGTH_LONG).show()
        }
        else if(timesClicked == 100)
        {
            Toast.makeText(this, "You're still here? Go study.", Toast.LENGTH_LONG).show()
        }
    }
}