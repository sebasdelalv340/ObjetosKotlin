package org.example
/*
 7. Reverso de una cadena
 Pedir una cadena al usuario e imprimirla al revés.
 */

class Ej07 {
    fun cadenaReverse() {
        print("Introduce una palabra: ")
        try {
            val palabra = readln()
            println(palabra.reversed())
        } catch (e: Exception) {
            println(e.message)
        }
    }
}