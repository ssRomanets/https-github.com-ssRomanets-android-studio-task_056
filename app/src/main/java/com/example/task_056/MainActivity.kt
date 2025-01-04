package com.example.task_056

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

////1.1 Пустой модификатор
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            val emptyModifier = Modifier
//
//            Message("Привет", emptyModifier)
//        }
//    }
//
//}

//@Composable
//fun Message(text:String, textModifier:Modifier){
//    Text(text, textModifier)
//}


////1.2 Дефолтный модификатор
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            val defaultModifier = Modifier
//                    .padding(90.dp)
//                    .border(width = 2.dp, color = Color.Red)
//                    .padding(16.dp)
//            Message("Привет", defaultModifier)
//        }
//    }
//}

//@Composable
//fun Message(text:String, defaultModifier:Modifier){
//
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Bottom
//    ) {
//        Text(
//            text = text,
//            modifier = defaultModifier,
//            fontSize = 28.sp,
//        )
//    }
//}


////1.3 Кастомный модификатор
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            Message("Привет")
//        }
//    }
//}

//@Composable
//fun Message(text:String){
//
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Bottom
//    ) {
//        Text(
//            text = text,
//            textAlign = TextAlign.Center,
//            modifier = Modifier
//                .padding(16.dp)
//                .border(width = 2.dp, color = Color.Red)
//                .padding(16.dp)
//                .clip(shape = RectangleShape)
//                .border(width = 2.dp, color = Color.Red)
//                .background(Color.Yellow)
//                .width(100.dp)
//                .padding(0.dp, 0.dp, 0.dp, 4.dp),
//            fontSize = 18.sp,
//        )
//    }
//}


//2.1
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val defaultModifier = Modifier.fillMaxWidth().padding(10.dp)
            Message("Привет", defaultModifier)
        }
    }
}

@Composable
fun Message(text:String, defaultModifier: Modifier){
    Text(text, defaultModifier, fontSize = 18.sp, textAlign = TextAlign.Center)
}