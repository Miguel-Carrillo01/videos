// Do while

fun main (){
    println("Ingrese el numero de personas a saludar: ")

    var cantidadDePersonas = readLine()!!.toInt()
    var contador = 1

    do {
        println("Ingrese el nombre de la persona $contador: ")
        var nombre = readLine()!!
        println("Hola $nombre, Mucho gusto!")
        contador++
    }while (contador <= cantidadDePersonas)
}