fun main (){
    println("Ingrese su Nombre")

    var nombre = readLine()!!

    println("Ingrese la materia")

    var materia = readLine()!!

    println("Ingrese la nota 1")

    var nota1 = readLine()!!.toFloat()

    println("Ingrese la nota 2")

    var nota2 = readLine()!!.toFloat()

    println("Ingrese la nota 3")

    var nota3 = readLine()!!.toFloat()

    var prom = (nota1 + nota2 + nota3) /3

    println("El promedio es $prom")

    if(prom < 3.5){
        println("El estudiante $nombre perdio la $materia")
    }
}