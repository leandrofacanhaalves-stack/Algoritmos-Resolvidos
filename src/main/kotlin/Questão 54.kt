//algoritmo 54 [Lista 1 - Leia, imprima, atribuição e funções]
//criar um algoritmo que calcule e imprima a área de um triângulo.
fun main() {
    print("Digite a base: ")
    val base = readln().toDouble()
    print("Digite a altura: ")
    val altura = readln().toDouble()
    val area = base * altura / 2
    println("area: $area")

}