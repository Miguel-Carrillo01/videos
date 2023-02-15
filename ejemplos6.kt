// while

fun main (){
    var num: Int
    var siguiente = "si"

    while(siguiente.uppercase() == "SI"){
        println("Ingrese un numero")
        num = readLine()!!.toInt()
        if(num < 0){
            num = num * -1
        }
        println("El numero positivo es: $num")
        println("¿Quiere ingresar otro numero? (si/no)")
        siguiente = readLine()!!
    }
}