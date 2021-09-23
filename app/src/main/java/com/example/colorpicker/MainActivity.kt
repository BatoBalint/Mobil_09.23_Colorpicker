package com.example.colorpicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.RelativeLayout
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var RedSeekBar : SeekBar
    lateinit var GreenSeekBar : SeekBar
    lateinit var BlueSeekBar : SeekBar
    lateinit var ColorLayout : RelativeLayout
    lateinit var TextView : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Init() {
        RedSeekBar = findViewById(R.id.seek_bar_red)
        GreenSeekBar = findViewById(R.id.seek_bar_red)
        BlueSeekBar = findViewById(R.id.seek_bar_red)
        ColorLayout = findViewById(R.id.color_layout)
        TextView = findViewById(R.id.color_text_view)
    }
}