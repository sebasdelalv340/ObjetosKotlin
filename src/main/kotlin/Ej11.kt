package org.example
/*
11. Fibonacci
 Crear un programa que imprima los primeros N números de la secuencia de Fibonacci (el
 número N lo ingresa el usuario).
 */

class Ej11 {
    fun secuenciaFibonacci() {
        print("Introduce un número entero: ")
        var num: Int = 0
        try {
            num = readln().toInt()
        } catch (e: Exception) {
            println(e.message)
        }

        var a = 0
        var b = 1
        var suma = 0
        println("$num números fibonacci:")
        for(i in 2..num) {
            suma = a + b
            a = b
            b = suma
            println("\t- $suma" )
        }
    }
}