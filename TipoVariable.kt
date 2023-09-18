/*Rogelio Rafael Gonzalez Martinez 6NM61*/

import kotlin.math.PI

/*Declaracion de PI*/
const val pi = PI

fun main(){
    
    
    println ("1. Para un número decimal, ¿Qué tipo de dato se asigna por defecto?")
    println("R: Double.\n")

    println ("2. Volver flotante a la variable decimal.")     
    println("R: Es dejando al final del numero asignado en variable una f por ejemplo: 'valorX = 1.71f'.\n")

    println ("3. Declarar una variable const val con el valor de PI y multiplicarla por 2 veces nuestra variable decimal para sacar el perímetro de un círculo.")
    
    val perimetro= 2 * pi
    
    println("El perímetro del círculo es: $perimetro")
    
}
