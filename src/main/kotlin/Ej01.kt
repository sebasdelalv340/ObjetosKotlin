package org.example
/*
1. Saludo personalizado
Pedir al usuario su nombre y saludarle con un mensaje personalizado. Ejemplo: "¡Hola,
Juan!".
 */

class Ej01 {
    fun pedirNombre() {
        print("Introduce tu nombre: ")
        try {
            val nombre = readln()
            println("¡Hola, $nombre")
        } catch (e: Exception) {
            println(e.message)
        }
    }
}