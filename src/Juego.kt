class Juego(val numero: Int) {// declaro en número secreto como atributo de la clase
    fun bucleJuego() {
        var input: String?//el interrogante sirve para que el valor sea nullable
        var i: Int = 0;
        //println(numero)
        println("ADIVINA EL NÚMERO SECRETO")

        while (true) {
            println("\nIntroduce un número entre 1 y 100:")
            input = readlnOrNull()?.trim() //sirve para introducir el número y pone el valor en null si el flujo se cierra
            if (input == null){ //comprueba si el input cierra el flujo de consola (muy improbable)
                System.err.println("ERROR: Se ha cerrado la entrada de datos.\n" +
                        "Cerrando programa.")
                break;//sale del bucle
            }
            if (!Excepciones.depurarEnteros(input)){// comprueva si el input es un entero
                System.err.println("ERROR: tienes que introducir un número entero.")
            }else if (input.toInt() !in 1..100){ //comprueba que el input introducido esté entre 1 y 100
                System.err.println("Error: Tienes que introducir un número comprendido entre 1 y 100.")
            }else if (input.toInt() > numero){// compruebba si el input es mayor al número
                println("El número secreto es menor")
                i++
            } else if (input.toInt() < numero){// comprueba si el input es menor al número
                println("El número secreto es mayor")
                i++
            } else {//el ultimo caso se da si el input es igual al número
                println("\nHas adivinado el número: " + numero)
                println("Te ha tomado " + i + " intentos.")
                break //sale del bucle
            }
        }
    }
}

