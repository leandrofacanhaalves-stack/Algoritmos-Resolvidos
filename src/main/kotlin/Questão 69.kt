//algoritmo 69 [Lista 1 - Leia, imprima, atribuição e funções]
//criar um algoritmo que leia o numerador e o denominador de uma fração e transformá-lo em um número decimal.
fun main() {
    print("Digite o numerador: ")
    val numerador = readln().toDouble()
    print("Digite o denominador: ")
    val denominador = readln().toDouble()
    val decimal = numerador / denominador
    println("decimal: $decimal")
}