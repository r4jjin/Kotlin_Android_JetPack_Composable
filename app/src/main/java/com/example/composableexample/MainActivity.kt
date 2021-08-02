package com.example.composableexample

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
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
    Row {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "profile pic."
        )
        Column {
            Text(text = "Name : ${text.name}")
            Text(text = "Description : ${text.details}")
        }
    }
}

@Preview
@Composable
fun Preview() {
    MessageText(Message("Detoxic", "Spirit"))
}