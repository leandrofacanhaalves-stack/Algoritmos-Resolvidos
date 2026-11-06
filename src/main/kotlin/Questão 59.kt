//algoritmo 59 [Lista 1 - Leia, imprima, atribuição e funções]
//entrar com os valores dos catetos de um triângulo retângulo e imprimir a hipotenusa.
fun main() {
    print("Digite o 1º cateto: ")
    val b = readln().toDouble()
    print("Digite o 2º cateto: ")
    val c = readln().toDouble()
    val a = Math.sqrt(b * b + c * c)
    println("hipotenusa: $a")
}