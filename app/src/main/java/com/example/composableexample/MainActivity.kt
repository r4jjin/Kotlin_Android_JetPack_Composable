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
            MessageText(Message("Detoxic", "Spirit"))
        }
    }
}

data class Message(val name: String, val details: String)

@Composable
fun MessageText(text: Message) {
    Text(text = "Intro : ${text.name}")
    Text(text = "Intro : ${text.details}")
}

@Preview
@Composable
fun Preview() {
    MessageText(Message("Detoxic", "Spirit"))
}