object Excepciones {
    fun depurarEnteros (numero: String): Boolean{// lanza true en caso de entero false si el input no es entero
        try {
            numero.toInt()
            return true
        }catch (e: NumberFormatException){
            return false
        }
    }
}