class Gerente(nombre: String, edad: Int, salarioBase: Number, val bonus: Double, val exentoImpuestos: Boolean = false): Empleado(nombre, edad, salarioBase, 33.99)  {

    override fun calcularSalario(): Double{
        return if (exentoImpuestos) super.calcularSalario()+bonus else salarioBase+bonus
    }

    fun administrar(): String{
        return "$nombre está administrando la empresa"
    }

    override fun toString(): String {
        val msj = super.toString()
        return "$msj, Bonus: $bonus€, ExentoImpuestos: $exentoImpuestos"
    }
}