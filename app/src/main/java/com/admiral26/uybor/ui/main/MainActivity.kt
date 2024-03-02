package com.admiral26.uybor.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.admiral26.uybor.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}