package org.example

import kotlin.random.Random

/*
4. Generador de números aleatorios
 Generar un número aleatorio entre 1 y 100 y pedir al usuario que adivine qué número es.
 El programa indicará si el número es mayor o menor al ingresado.
 Pista: Utilizar la función de generación de números aleatorios y bucles while o do-while.
 */

class Ej04 {
    fun adivinarNum() {
        val numRamdon = Random.nextInt(1, 100)
        print("Intenta adivinar el número entre 1 y 100: ")
        do {
            try {
                val num = readln().toInt()
                if (num < numRamdon) {
                    print("El número es mayor al ingresado. Inténtelo de nuevo: ")
                } else if (num > numRamdon){
                    print("El número es menor al ingresado. Inténtelo de nuevo: ")
                } else {
                    println("Ha acertado")
                    break
                }
            } catch (e: Exception) {
                println(e.message)
            }
        } while (true)
    }
}