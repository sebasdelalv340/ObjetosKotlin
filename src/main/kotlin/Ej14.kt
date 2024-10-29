package org.example
/*
14. Inventario de videojuegos
 Crear una clase Videojuego con los atributos titulo, plataforma y horasJugadas. Permitir al
 usuario crear un inventario con varios videojuegos. El programa debe permitir añadir,
 eliminar y mostrar los videojuegos del inventario.
 */

data class Videojuego(
    val titulo: String,
    val plataforma: String,
    val horasJugadas: Int
) {
    override fun toString(): String {
        return "Título: $titulo, plataforma: $plataforma, horas jugadas: $horasJugadas"
    }
}

class Inventario {
    val _inventario = mutableListOf<Videojuego>()

    fun crearVideojuego(): Videojuego {
        var titulo: String = ""
        var plataforma: String = ""
        var horasJugadas: Int = 0
        try{
            println("Introduce el nombre:")
            titulo = readln()
            println("Introduce el número de episodios:")
            plataforma = readln()
            println("Introduce el género:")
            horasJugadas = readln().toInt()
        } catch (e: Exception) {
            println(e.message)
        }

        return Videojuego(titulo, plataforma, horasJugadas)
    }

    fun insertVideojuego(videojuego: Videojuego) {
        _inventario.add(videojuego)
    }

    fun deleteVideojuego(videojuego: Videojuego) {
        _inventario.remove(videojuego)
    }

    fun mostrarInventario() {
        _inventario.forEach { println(it) }
    }
}
