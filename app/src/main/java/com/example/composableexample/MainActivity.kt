package com.example.composableexample

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composableexample.ui.theme.ComposableExampleTheme

/**
 * Notes
 * Day1: Defining Row & Coloumn basics & using setContent
 * Day2:    Text, Spacer UI elements.
 *          Using modifiers.
 *          Value paramters are applied sequentially in th order declared inside
 *          offset is equivalent to margin, but this once actually ignores other ui elements and overlaps based on it's x and y axis defined
 * Day3: clickable modifier
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column(
                modifier = Modifier
                    .background(Color.Green)
//                    .fillMaxSize(0.5f)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()
//                    .height(200.dp)
//                    .width(300.dp)
//                    .padding(10.dp)
//                    .padding(top = 50.dp)
//                    .requiredWidth(600.dp)

                    .border(5.dp, Color.Magenta)
                    .padding(5.dp)
                    .border(5.dp, Color.Blue)
                    .padding(5.dp)
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Hello", modifier = Modifier.offset(0.dp, 50.dp))
                Text("World", modifier = Modifier
                    .padding(30.dp)
                    .border(5.dp, Color.Yellow)
                    .clickable {
                        Toast
                            .makeText(baseContext, "Click", Toast.LENGTH_SHORT)
                            .show()
                    })
                Spacer(modifier = Modifier.height(150.dp))
                Text("Again")
            }
        }
    }
}

