open class Empleado(nombre: String, edad: Int, salarioBase: Number, porcentajeImpuestos: Number = 10.0): Persona(nombre, edad) {

    var salarioBase: Double = salarioBase.toDouble()
    val porcentajeImpuestos: Double = porcentajeImpuestos.toDouble()


    open fun calcularSalario(): Double{
        return salarioBase*(porcentajeImpuestos/100)
    }

    fun trabajar(): String{
        return "$nombre está trabajando en la empresa"
    }

    override fun toString(): String {
        val msj = super.toString(); val decimales = 2; val salario = "%.${decimales}f".format(salarioBase)
        return "$msj, SalarioBase: $salario€, PorcentajeImpuestos: $porcentajeImpuestos%"
    }
}