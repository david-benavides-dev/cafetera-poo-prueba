package classes

// Constructor primario
class Cafetera(val ubicacion: String) {

    private var capacidad: Int = 1000
    private var cantidad: Int = 0

    // Constructor con ubicación y capacidad
    constructor(ubicacion: String, capacidad: Int) : this(ubicacion) {
        this.capacidad = capacidad
    }

    // Constructor con ubicación, capacidad y cantidad
    constructor(ubicacion: String, capacidad: Int, cantidad: Int) : this(ubicacion) {
        this.capacidad = capacidad
        this.cantidad = cantidad

        if (this.cantidad > this.capacidad) {
            this.cantidad = 1000
        }
    }

    fun llenar() {
        cantidad = capacidad
    }

    // servirTaza(Taza): simula la acción de servir una taza con la capacidad que tenga la taza. Si la cafetera tiene café,
    // llenará la taza y restará la cantidad servida en la cantidad de la cafetera.
    // Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. Actualizar la cantidad de la cafetera y aplicar el método adecuado de la taza.
    fun servirTaza(t: Taza) {
        if(cantidad != 0) {
            if (cantidad - t.cantidad < 0) {
                t.cantidad = cantidad
                cantidad - t.cantidad
            } else {
                cantidad -= t.cantidad
                t.llenar()
            }
        }
    }

    fun vaciar() {
        cantidad = 0
    }

    fun agregarCafe(cantidadCafe: Int = 200) {
        if(cantidadCafe > 1000) {
            llenar()
        } else {
            cantidad += cantidadCafe
        }
    }

    override fun toString(): String {
        return "Cafetera(ubicación = $ubicacion, capacidad = $capacidad c.c., cantidad = $cantidad)"
    }
}