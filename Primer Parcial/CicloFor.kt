/*Rogelio Rafael Gonzalez Martinez 6NM61*/
fun main(){
    val nombres = list0f(
        "Rafael",
        "Clara",
        "Cykes",
        "Erick",
        "Dar",
        "Just",
        "Axel",
        "Noble 6",
        "Pepe"
    )
    for (nombre in nombres){
        println(nombre)
        if (nombre=="Noble 6"){
            println("Personaje Encontrado!")
            break
        }
    }
}
