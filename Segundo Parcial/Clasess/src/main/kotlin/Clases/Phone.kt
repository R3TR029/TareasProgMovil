package Clases

class Phone {

    var isOn= false
    lateinit var model:String

    fun turnOn(){
        isOn = true
    }
    fun turnOff(){
        isOn = true
    }
    fun getTurn(){
        val turnMode = if(isOn) "Encedido" else "Apagado"
        println("El teléfono esta $turnMode")
    }
}
