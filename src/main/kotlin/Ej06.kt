package org.example
/*
 6. Sumar números del 1 al 100
 Crear un programa que sume todos los números del 1 al 100.
 */

class Ej06 {
    fun suma() {
        var suma = 0
        for(i in 1..100) {
            suma += i
        }
        println("La suma de todos los números del 1 al 100 es $suma")
    }
}