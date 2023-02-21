fun main() {
var (a, b) = Pair(1, 2)
println(a) 
println(b) 
    
}

fun main() {
    var pair1 = Pair("Hola", 455)

    var pair2 = Pair(10, 4.15)

    var (str,num) = pair1
    println("El valor de la cadena es $str y el valor del numero es $num")

    println("El primer valor del par es ${pair2.first} y el segundo valor es  ${pair2.second}")
}



