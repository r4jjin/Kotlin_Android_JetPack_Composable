package com.example.composableexample

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageText("This is a composable function.")
        }
    }

    @Composable
    fun MessageText(text: String) {
        Text(text = "Intro : $text")
    }

    @Preview
    @Composable
    fun Preview() {
        MessageText("Hi")
    }
}