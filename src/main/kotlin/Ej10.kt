package org.example
/*
10. Conversión de temperaturas
 Crear un programa que convierta una temperatura de grados Celsius a Fahrenheit y
 viceversa. (C = (F- 32) * 5/9, F = C * 9/5 + 32).
 */

class Ej10 {
    fun CelsiusToFahrenheit() {
        print("Introduce una temperatura en Celsius: ")
        var grados: Int = 0
        try {
            grados = readln().toInt()
        } catch (e: Exception) {
            println(e.message)
        }
        val fah = grados * 9/5 + 32
        println("$grados grados Celsius son $fah grados Fahrenheit")
    }

    fun FahrenheitToCelsius() {
        print("Introduce una temperatura en Fahrenheit: ")
        var grados: Int = 0
        try {
            grados = readln().toInt()
        } catch (e: Exception) {
            println(e.message)
        }
        val cel = (grados - 32) * 5/9
        println("$grados grados Fahrenheit son $cel grados Celsius")
    }
}