fun main(){
    val alguien = Persona("Juan", 11)
    println(alguien)
    println(alguien.celebrarCumple())
    println()

    val empleado = Empleado("Felipe", 23, 1000)
    println(empleado)
    println(empleado.celebrarCumple())
    println("${empleado.nombre} recibe con impuestos ${"%.2f".format(empleado.calcularSalario())}€.")
    println(empleado.trabajar())
    println()

    val gerente = Gerente("Roberto", 45, 2435.45, 200.0, true)
    println(gerente)
    println(gerente.celebrarCumple())
    if (gerente.exentoImpuestos){
        println("${gerente.nombre} está exento de impuestos por lo que recibe más bonus es ${gerente.calcularSalario()}€.")
    } else println("${gerente.nombre} recibe con impuestos y bonus añadidos es ${"%.2f".format(gerente.calcularSalario())}€.")
    println(gerente.administrar())

    val lista = listOf(alguien, empleado, gerente)
    for (persona in lista){
        println(persona)
        println(persona.celebrarCumple())
        when(persona){
            if (persona is Empleado){
                println("${empleado.nombre} recibe con impuestos ${"%.2f".format(empleado.calcularSalario())}€.")
                println(persona.trabajar())
            } else{
                if (persona.exentoImpuestos){
                    println("${persona.nombre} está exento de impuestos por lo que recibe más bonus es ${persona.calcularSalario()}€.")
                } else println("${persona.nombre} recibe con impuestos y bonus añadidos es ${"%.2f".format(persona.calcularSalario())}€.")
                println(persona.administrar())
            }
        }







        println()
    }
}