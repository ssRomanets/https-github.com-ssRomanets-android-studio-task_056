package com.example.task_056

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

//1.1 Пустой модификатор
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val emptyModifier = Modifier

            Message("Привет", emptyModifier)
        }
    }

}

@Composable
fun Message(text:String, textModifier:Modifier){
    Text(text, textModifier)
}