package com.example.quoteofday.main

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun QuoteOfDayScreen(){
    Column{
        Text(text = "Texto, texto, texto")
        Button(onClick = { /*TODO*/ },
            content = { Text(text = "Get Quote!") }
        )
    }
}