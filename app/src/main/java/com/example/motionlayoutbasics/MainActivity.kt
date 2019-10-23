package com.example.motionlayoutbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        newWidget.withBackGroundColor(R.color.colorPrimary)
        newWidget.setNewTextColor(R.color.colorAccent)
    }
}
