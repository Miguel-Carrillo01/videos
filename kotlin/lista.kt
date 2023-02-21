fun main() {
    var nombres = listOf("Cristian", "Miguel", "Samuel", "Andres", "Manuel")

    println("Lista completa: $nombres")

    var primerNombre = nombres[0]
    println("Primer nombre: $primerNombre")

    var ultimoNombre = nombres[nombres.size - 1]
    println("Ultimo nombre: $ultimoNombre")

    for (nombre in nombres) {
        println(nombre)
    }

    var nombresConM = nombres.filter { it.startsWith("M") }
    println("Nombres que comienzan con M: $nombresConM")

    var nombresOrdenados = nombres.sorted()
    println("Lista ordenada: $nombresOrdenados")

    var nombresConNuevo = nombres.toMutableList()
    nombresConNuevo.add("Carrillo")
    println("Lista con nuevo nombre: $nombresConNuevo")
}