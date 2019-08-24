package com.example.themsytle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun display(view: View){
        info.text ="Android Application Development , Android Security" +
                "Essential and Monetize Android Application "

    }
    fun display_exma(view: View){
        info.text = " Hey this is one of the an ATC Android exma test "
    }
    fun display_freelance(view: View){
        info.text = " Hey this is the freelance test "
    }
}
