package com.example.kmpcalculatorapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform