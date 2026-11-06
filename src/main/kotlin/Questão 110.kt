//algoritmo 110 [Lista 2 - Estrutura do Se]
//criar um algoritmo que leia dois números e imprimir uma mensagem dizendo se são iguais ou diferentes.
fun main() {
    print("Digite o 1º número: ")
    val a = readln().toDouble()
    print("Digite o 2º número: ")
    val b = readln().toDouble()
    if (a == b) {
        println("iguais")
    } else {
        println("diferentes")
    }
}