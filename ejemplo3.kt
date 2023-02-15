fun main (){
    println("Ingrese un numero: ")

    var numero =  readLine()!!.toInt()

    if(numero > 0){
        println("El numero es positivo")
    }else {
        println("El numero es negativo")
    }

    println("El numero es $numero")
}