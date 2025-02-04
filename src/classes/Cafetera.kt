package classes


class Cafetera(private val ubicacion: String) {

    var capacidad: Int = 1000
    var cantidad: Int = 0


    constructor(ubicacion: String, capacidad: Int) : this(ubicacion) {
        this.capacidad = capacidad
    }


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

    fun servirTaza(t: Taza) {
        if (cantidad > 0) {
            if (cantidad >= t.capacidad) {
                t.llenar(capacidad)
                cantidad -= t.capacidad
            } else {
                t.llenar()
                cantidad = 0
            }
        } else {
            println("No queda café en la cafetera...")
        }
    }

    fun vaciar() {
        cantidad = 0
    }

    fun agregarCafe(cantidadCafe: Int = 200) {
        if(cantidadCafe > 1000) {
            llenar()
        } else {
            cantidad = cantidadCafe
        }
    }

    override fun toString(): String {
        return "Cafetera(ubicación = $ubicacion, capacidad = $capacidad c.c., cantidad = $cantidad)"
    }
}