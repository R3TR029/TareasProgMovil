/*Rogelio Rafael Gonzalez Martinez 6NM61*/

const val ladoA = 4
const val ladoB = 5
const val ladoC = 6

fun main(){
    // Genera tres números aleatorios para representar las longitudes de los baleros

    println("Longitudes de los baleros:")
    println("Lado A: $ladoA")
    println("Lado B: $ladoB")
    println("Lado C: $ladoC")

    // Verifica el tipo de triángulo
    if(ladoA == ladoB && ladoB == ladoC) {
        println("El triángulo es equilátero.")
    } 
    else if(ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
        println("El triángulo es isósceles.")
    } 
    else {
        println("El triángulo es escaleno.")
    }
}
