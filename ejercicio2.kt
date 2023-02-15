fun main (){
    println("Ingrese la edad")

    var edad = readLine()!!.toInt()

    if(edad < 18){
        println("La persona es menor de edad")
    }

    println("La edad es $edad")
}