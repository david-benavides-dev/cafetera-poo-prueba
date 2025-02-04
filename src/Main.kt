import classes.*
import kotlin.random.Random

fun main() {

    //TODO: Crear 3 cafeteras en la Sala, Cocina y Oficina
    val cafetera1 = Cafetera("Sala")
    val cafetera2 = Cafetera("Cocina")
    val cafetera3 = Cafetera("Oficina")

    //TODO: Crear una lista de 20 tazas con capacidades aleatorias
    val listaTazas = mutableListOf<Taza>()
    repeat(20) {
        val capacidadesPosibles = arrayOf(50, 75, 100)
        val tacita = Taza()
        tacita.color = Color.entries[Random.nextInt(0,4)]
        tacita.capacidad = capacidadesPosibles.random()
        listaTazas.add(tacita)
    }

    println("**********************************************")

    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras y las tazas.
    println(cafetera1)
    println(cafetera2)
    println(cafetera3)

    for (taza in listaTazas) {
        println(taza)
    }


    println("**********************************************")
    println("Llenar la cafetera1 de café...")
    println("Vaciar la cafetera2...")
    println("Agregar café a la cafetera2 a la mitad de su capacidad...")
    println("Agregar 400 c.c. de café a la cafereta3...")

    //TODO: Llenar la cafetera1 de café.
    cafetera1.llenar()


    //TODO: Vaciar la cafetera2.
    cafetera2.vaciar()


    //TODO: Agregar café a la cafetera2 a la mitad de su capacidad.
    cafetera2.agregarCafe(500)

    //TODO: Agregar 400 c.c. de café a la cafereta3
    cafetera3.agregarCafe(400)

    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras
    println(cafetera1)
    println(cafetera2)
    println(cafetera3)


    println("**********************************************")
    println("Servir café en las tazas...")

    //TODO: Servir café en las tazas... siempre que haya café en la cafetera y en el orden cafetera1, cafetera2 y cafetera3.



    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras y las tazas.
    println(cafetera1)
    println(cafetera2)
    println(cafetera3)

    for (taza in listaTazas) {
        println(taza)
    }
}