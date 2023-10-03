/*Rogelio Rafael Gonzalez Martinez 6NM61*/

fun main() {
    print("Ingresa tu edad: ")
    val age = readLine()?.toInt()

    when (age) {
        0 -> println("Apenas eres un recién nacido")
        1 -> println("Solo tienes un año de edad")
        in 2..5 -> println("Estás chiquit@")
        in 6..11 -> println("Ya eres todo un niñ@")
        in 12..14 -> println("Eres un preadolescente")
        in 15..17 -> println("Ya eres un total adolecente")
        in 18..25 -> println("Woow ya eres un adulto")
        else -> {
            println("Edad invalida")

        }
    }
}
