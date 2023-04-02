package com.sefakuru.uidesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {
    private lateinit var myToolBar:Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myToolBar=findViewById(R.id.myToolBar)

        myToolBar.title="Profile"
    }
}