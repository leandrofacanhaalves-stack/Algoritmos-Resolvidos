//algoritmo 4 [Capítulo 1 - Conceitos iniciais]
//algoritmo para o fim de semana
fun main() {
    println("1 - ver a previsão do tempo")
    println("Vai fazer sol? (s/n)")
    val sol = readln().lowercase()
    if (sol == "s") {
        println("2 - ir à praia")
    } else {
        println("2 - ir estudar")
    }
    println("3 - almoçar")
    println("4 - ver televisão")
    println("5 - dormir")
}