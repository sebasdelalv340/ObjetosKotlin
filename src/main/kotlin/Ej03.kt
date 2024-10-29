package org.example
/*
3. Cálculo del área de un círculo
 Pedir al usuario el radio de un círculo y calcular su área (A = π * r^2).
 */

class Ej03 {
    fun pedirRadio() {
        print("Introduce un número: ")
        try {
            val radio = readln().toDouble()
            val area = 3.14 * (radio * radio)
            println("Área: $area")
        } catch (e: Exception) {
            println(e.message)
        }
    }
}