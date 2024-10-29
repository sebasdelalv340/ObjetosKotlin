package org.example
/*
12. Inversión de un número
 Pedir un número entero al usuario e imprimir el número con sus dígitos invertidos.
 Ejemplo: si el usuario ingresa 1234, el programa debería imprimir 4321.
 */

class Ej12 {
    fun numReverse() {
        print("Introduce un número entero: ")
        var num: String = ""
        try {
            num = readln()
        } catch (e: Exception) {
            println(e.message)
        }
        val numNuevo = num.reversed()
        println(numNuevo)
    }
}