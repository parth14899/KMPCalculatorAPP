package com.example.kmpcalculatorapp.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculator.Calculator
import com.example.kmpcalculatorapp.Greeting

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val calculator = Calculator()
            val sum = calculator.add(10.0, 5.0)
            val difference = calculator.subtract(10.0, 5.0)
            val product = calculator.multiply(10.0, 5.0)
            val quotient = calculator.divide(10.0, 5.0)
            val square = calculator.square(10.0)

            println("Sum: $sum")
            println("Difference: $difference")
            println("Product: $product")
            println("Quotient: $quotient")
            println("Square: $square")
           // MyApplicationTheme {
            //    Surface(
             //       modifier = Modifier.fillMaxSize(),
             //       color = MaterialTheme.colorScheme.background
             //   ) {
             //       GreetingView(Greeting().greet())
             //   }
         //   }
        }
    }
}

//@Composable
//fun GreetingView(text: String) {
//    Text(text = text)
//}

//@Preview
//@Composable
//fun DefaultPreview() {
  //  MyApplicationTheme {
 //       GreetingView("Hello, Android!")
 //   }
//}
