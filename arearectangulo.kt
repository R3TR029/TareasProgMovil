/*Rogelio Rafael Gonzalez Martinez 6NM61*/

fun main() {
 
    val largo = 12.0
    val ancho = 4.0
    val altura = 6.0
    
    val AreaRectangulo = CalcularArea(largo, ancho)
    println("El área del rectángulo es: $AreaRectangulo")

    val Volumen = CalcularVolumen(AreaRectangulo, altura)
    println("El volumen del prisma rectangular es: $Volumen")
}


fun CalcularArea(largo: Double, ancho: Double): Double {
    return largo * ancho
}

fun CalcularVolumen(AreaRectangulo: Double, altura: Double): Double {
    return AreaRectangulo * altura
}
