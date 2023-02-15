//for

fun main (){
    println("Ingrese la cantidad de numeros a procesar: ")
    var cant = readLine()!!.toInt()
    
    for (i in 1..cant){
        println("ingrese un numero: ")
        var numero = readLine()!!.toInt()

        if(numero % 11 == 0 ){
            println("El numero $numero es divisible entre 11")
        }else{
            println("El numero $numero no es divisible entre 11")
        }
    }
}