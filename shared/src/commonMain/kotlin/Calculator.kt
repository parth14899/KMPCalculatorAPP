// shared/src/commonMain/kotlin/Calculator.kt

package com.example.calculator

// Define a public class named 'Calculator'
class Calculator {

    // Add function takes two doubles and returns their sum
    fun add(a: Double, b: Double): Double {
        return a + b
    }

    // Subtract function takes two doubles and returns the difference
    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    // Divide function takes two doubles and returns the quotient
    // It throws an exception if division by zero occurs
    fun divide(a: Double, b: Double): Double {
        if (b == 0.0) {
            throw IllegalArgumentException("Cannot divide by zero.")
        }
        return a / b
    }

    // Multiply function takes two doubles and returns the product
    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    // Square function takes a double and returns the square
    fun square(a: Double): Double {
        return a * a
    }
}
