fun main(){
    val alguien = Persona("Juan", 11)
    val empleado = Empleado("Felipe", 23, 1000)
    val gerente = Gerente("Roberto", 45, 2435.45, 200.0, true)

    val lista = listOf(alguien, empleado, gerente)
    for (persona in lista){
        println(persona)
        println(persona.celebrarCumple())
        when {
            persona is Empleado && persona !is Gerente -> {
                println("${empleado.nombre} recibe con impuestos ${"%.2f".format(empleado.calcularSalario())}€.")
                println(persona.trabajar())
            }
            persona is Gerente -> {
                if (persona.exentoImpuestos){
                    println("${persona.nombre} está exento de impuestos por lo que recibe más bonus es ${"%.2f".format(persona.calcularSalario())}€.")
                } else println("${persona.nombre} recibe con impuestos y bonus añadidos es ${"%.2f".format(persona.calcularSalario())}€.")
                println(persona.administrar())
            }
        }







        println()
    }
}