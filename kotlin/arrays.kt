fun main() {
    var numeros = arrayOf(1, 2, 3, 4, 5)
    println("Array original: ${numeros.joinToString()}")

    numeros.short()

    println("Array ordenado: ${numeros.joinToString()}")

    var promedio = numeros.average()

    println("El promedio de los numeros es $promedio")
}