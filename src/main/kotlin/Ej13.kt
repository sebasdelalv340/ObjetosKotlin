package org.example
/*
13. Clase Anime sencilla
 Crear una clase Anime con los atributos nombre, episodios y género. Luego, permitir al
 usuario crear un objeto de tipo Anime con estos atributos y mostrar su información.
 */

class Anime(
    val nombre: String,
    val episodios: Int,
    val genero: String
) {
    override fun toString(): String {
        return "Nombre: $nombre, episodios: $episodios y género: $genero"
    }
}

fun crearAnime(): Anime {
    var nombre: String = ""
    var episodios: Int = 0
    var genero: String = ""
    try{
        println("Introduce el nombre:")
        nombre = readln()
        println("Introduce el número de episodios:")
        episodios = readln().toInt()
        println("Introduce el género:")
        genero = readln()
    } catch (e: Exception) {
        println(e.message)
    }

    return Anime(nombre, episodios, genero)
}