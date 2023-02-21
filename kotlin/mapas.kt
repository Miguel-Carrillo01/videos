fun main() {
    var poblaciones = mutableMapOf(
        "Salento" to 3_200_000,
        "Filandia" to 1_600_000,
        "Pijao" to 800_000
    )
    poblaciones.put("Calarca", 900_500)
    poblaciones["Montenegro"] = 400_100
    poblaciones.remove("Pijao")
    println(poblaciones)
}