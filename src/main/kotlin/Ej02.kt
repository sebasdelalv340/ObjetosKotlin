package org.example
/*
 2. Número par o impar
 Pedir un número al usuario e indicar si es par o impar.
 */

class Ej02 {
    fun pedirNum() {
        print("Introduce un número entero: ")
        try {
            val num = readln().toInt()
            if ((num%2) == 0) {
                println("$num es par")
            } else {
                println("$num es impar")
            }
        } catch (e: Exception) {
            println(e.message)
        }
    }
}