//algoritmo 55 [Lista 1 - Leia, imprima, atribuição e funções]
//criar um algoritmo que calcule e imprima a área de um losango.
fun main() {
    print("Digite a diagonal maior: ")
    val dmaior = readln().toDouble()
    print("Digite a diagonal menor: ")
    val dmenor = readln().toDouble()
    val area = dmaior * dmenor / 2
    println("area: $area")
}