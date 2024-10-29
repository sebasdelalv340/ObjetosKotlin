package org.example
/*
9. Números primos
 Pedir un número al usuario y verificar si es un número primo.
 */

class Ej09 {
    fun numPrimo(): Boolean {
        var num: Int = 0
        try {
            num = readln().toInt()
        } catch (e: Exception) {
            println(e.message)
        }

        if (num <= 1) return false
        for(i in 2..num/2){
            if(num % 2 == 0) return false
        }
        return true
    }

    fun esPrimo() {
        print("Introduce un número entero: ")
        if(numPrimo()){
            println("El número introducido es primo.")
        } else {
            println("El número introducido no es primo.")
        }
    }

}