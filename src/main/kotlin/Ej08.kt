package org.example
/*
8. Contador de vocales
 Pedir una frase al usuario y contar cuántas vocales (a, e, i, o, u) contiene.
 */

class Ej08 {
    fun contarVocales() {
        val vocales = "aeiou"
        print("Introduce una frase: ")
        try {
            val frase = readln().lowercase()
            println("'$frase' tiene:")
            for (vocal in vocales) {
                println("\t-$vocal: ${frase.count {it==vocal}}")
            }
        } catch (e: Exception) {
            println(e.message)
        }
    }
}