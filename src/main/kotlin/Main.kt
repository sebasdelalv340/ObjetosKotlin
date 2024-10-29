package org.example

fun main() {
    val ejercicio1 = Ej01()
    val ejercicio2 = Ej02()
    val ejercicio3 = Ej03()
    val ejercicio4 = Ej04()
    val ejercicio5 = Ej05()
    val ejercicio6 = Ej06()
    val ejercicio7 = Ej07()
    val ejercicio8 = Ej08()
    val ejercicio9 = Ej09()
    val ejercicio10 = Ej10()
    val ejercicio11 = Ej11()
    val ejercicio12 = Ej12()
    val ejercicio14 = Inventario()

    while (true) {
        println("\nMenú:")
        println(" 1. Ejercicio 1")
        println(" 2. Ejercicio 2")
        println(" 3. Ejercicio 3")
        println(" 4. Ejercicio 4")
        println(" 5. Ejercicio 5")
        println(" 6. Ejercicio 6")
        println(" 7. Ejercicio 7")
        println(" 8. Ejercicio 8")
        println(" 9. Ejercicio 9")
        println("10. Ejercicio 10")
        println("11. Ejercicio 11")
        println("12. Ejercicio 12")
        println("13. Ejercicio 13")
        println("14. Ejercicio 14")
        println("15. Salir")
        println("Elige una opción (1-15):")

        when (readLine()?.toIntOrNull()) {
            1 -> ejercicio1.pedirNombre()
            2 -> ejercicio2.pedirNum()
            3 -> ejercicio3.pedirRadio()
            4 -> ejercicio4.adivinarNum()
            5 -> ejercicio5.tablaMultiplicar()
            6 -> ejercicio6.suma()
            7 -> ejercicio7.cadenaReverse()
            8 -> ejercicio8.contarVocales()
            9 -> ejercicio9.esPrimo()
            10 -> {
                ejercicio10.FahrenheitToCelsius()
                    ejercicio10.CelsiusToFahrenheit()
            }
            11 -> ejercicio11.secuenciaFibonacci()
            12 -> ejercicio12.numReverse()
            13 -> {
                println(crearAnime())
            }
            14 -> {
                val videojuego = ejercicio14.crearVideojuego()
                ejercicio14.insertVideojuego(videojuego)
                ejercicio14.mostrarInventario()
                ejercicio14.deleteVideojuego(videojuego)
            }
            15 -> {
                println("Saliendo del menú. ¡Hasta luego!")
                break
            }
            else -> println("Opción no válida. Inténtalo de nuevo.")
        }
    }
}