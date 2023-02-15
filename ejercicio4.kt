// Condicionales multiples con when

fun main (){
    var numero = 49

    var respuesta = when {
        numero == 49 -> "El valor es igual a 49"
        numero > 40 -> "El valor es mayor a 35"
        else -> "No corresponde a ninguno"
    }

    println(respuesta)
}