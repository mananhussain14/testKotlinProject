package com.techalgo.kotlintestproject

import android.os.Bundle
import android.widget.Space
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
        setContent {
            testFun()
        }


    }


    @Composable
    fun testFun() {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .background(Color.Yellow)
                .padding(10.dp)
                .offset(10.dp,0.dp)
                .border(border = BorderStroke(5.dp,Color.Green), shape = RoundedCornerShape(16.dp))
                .padding(10.dp).border(5.dp,Color.Cyan),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
            //test

        ) {
            Text(text = "this is text", color = Color(0xFFCE1414))
            Spacer(modifier = Modifier.height(50.dp))

            Image(painterResource(R.drawable.testimage), contentDescription = "")
            RadioButton(selected = false, onClick = { println("radioi clicked") })
        }
    }

    @Preview
    @Composable
    fun preview() {
        testFun()

    }


}