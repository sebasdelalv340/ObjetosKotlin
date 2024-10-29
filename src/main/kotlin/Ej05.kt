package org.example
/*
5. Tabla de multiplicar
 Pedir un número al usuario e imprimir su tabla de multiplicar del 1 al 10.
 */

class Ej05 {
    fun tablaMultiplicar() {
        print("Introduce un número entero: ")
        var num: Int = 0
        try {
            num = readln().toInt()
        } catch (e: Exception) {
            println(e.message)
        }

        for (i in 1..10) {
            println("$i x $num: ${i * num}")
        }
    }
}